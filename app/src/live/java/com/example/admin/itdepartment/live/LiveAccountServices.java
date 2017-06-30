package com.example.admin.itdepartment.live;


import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.widget.Toast;

import com.example.admin.itdepartment.activities.LoginActivity;
import com.example.admin.itdepartment.activities.MainActivity;
import com.example.admin.itdepartment.entities.User;
import com.example.admin.itdepartment.infrastructure.ItdepartmentApplication;
import com.example.admin.itdepartment.infrastructure.Utils;
import com.example.admin.itdepartment.services.AccountServices;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ServerValue;
import com.firebase.client.ValueEventListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.squareup.otto.Subscribe;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.HashMap;

public class LiveAccountServices extends BaseLiveServices{
    public LiveAccountServices(ItdepartmentApplication application) {
        super(application);
    }

    @Subscribe
    public void RegisterUser(final AccountServices.RegisterUserRequest request){
        AccountServices.RegisterUserResponse response=new AccountServices.RegisterUserResponse();

        if(request.userEmail.isEmpty()){
            response.setPropertyErrors("email","Please put in your email");
        }
        if(request.userName.isEmpty()){
            response.setPropertyErrors("userName","Please put in your name");
        }
        if(response.didSuceed()){
            request.progressDialog.show();

            SecureRandom random = new SecureRandom();
            final String randomPassword = new BigInteger(32,random).toString();


            auth.createUserWithEmailAndPassword(request.userEmail,randomPassword)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>(){
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task){
                        if(!task.isSuccessful()){
                            request.progressDialog.dismiss();
                            Toast.makeText(application.getApplicationContext(),task.getException().getMessage(),Toast.LENGTH_LONG).show();
                        }else{
                            auth.sendPasswordResetEmail(request.userEmail)
                                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                                        @Override
                                        public void onComplete(@NonNull Task<Void> task){
                                            if (!task.isSuccessful()){
                                                request.progressDialog.dismiss();
                                                Toast.makeText(application.getApplicationContext(),task.getException().getMessage(),Toast.LENGTH_LONG).show();
                                            }
                                            else{


                                                Firebase reference = new Firebase(Utils.FIRE_BASE_USER_REFERENCE + Utils.encodeEmail(request.userEmail));
                                                reference.child("email").setValue(request.userEmail);
                                                reference.child("name").setValue(request.userName);
                                                reference.child("hasLoggedInWithPassword").setValue(false);



                                                Toast.makeText(application.getApplicationContext(), "Please check your email", Toast.LENGTH_LONG).show();
                                                request.progressDialog.dismiss();

                                                Intent intent = new Intent(application.getApplicationContext(), MainActivity.class);
                                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK );
                                                application.startActivity(intent);
                                            }
                                        }
                                    });
                        }
                    }
            });
        }
        bus.post(response);
    }

    @Subscribe
    public void LogInUser(final AccountServices.LogUserInRequest request){
        AccountServices.LogUserInresponse response = new AccountServices.LogUserInresponse();

        if (request.userEmail.isEmpty()){
            response.setPropertyErrors("email","Please Enter your E-mail");
        }

        if (request.userPassword.isEmpty()){
            response.setPropertyErrors("password","Please enter your Password");
        }

        if (response.didSuceed()){
            request.progressDialog.show();
            auth.signInWithEmailAndPassword(request.userEmail,request.userPassword)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(!task.isSuccessful()){
                                request.progressDialog.dismiss();
                                Toast.makeText(application.getApplicationContext(),task.getException().getMessage(),Toast.LENGTH_LONG).show();
                            }else{
                                final Firebase userLocation = new Firebase(Utils.FIRE_BASE_USER_REFERENCE + Utils.encodeEmail(request.userEmail));
                                userLocation.addListenerForSingleValueEvent(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {
                                        User user = dataSnapshot.getValue(User.class);
                                        if (user!=null){
                                            userLocation.child("hasLoggedInWithPassword").setValue(true);
                                            SharedPreferences sharedPreferences = request.sharedPreferences;
                                            sharedPreferences.edit().putString(Utils.EMAIL,Utils.encodeEmail(user.getEmail())).apply();
                                            sharedPreferences.edit().putString(Utils.USERNAME,user.getName()).apply();

                                            request.progressDialog.dismiss();
                                            Intent intent = new Intent(application.getApplicationContext(), MainActivity.class);
                                            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK );
                                            application.startActivity(intent);
                                        } else {
                                            request.progressDialog.dismiss();
                                            Toast.makeText(application.getApplicationContext(), "Failed to connect Please try again", Toast.LENGTH_LONG).show();
                                        }
                                    }

                                    @Override
                                    public void onCancelled(FirebaseError firebaseError) {
                                        request.progressDialog.dismiss();
                                        Toast.makeText(application.getApplicationContext(), firebaseError.getMessage(), Toast.LENGTH_LONG).show();

                                    }
                                });
                            }
                        }
                    });
        }
        bus.post(response);
    }
}
