package com.example.admin.itdepartment.services;

import android.app.ProgressDialog;
import android.content.SharedPreferences;

import com.example.admin.itdepartment.infrastructure.ServiceResponse;

/**
 * Created by ADMIN on 06-Apr-17.
 */

public class AccountServices {
    public AccountServices() {

    }

    public static class RegisterUserRequest{
        public String userName;
        public String userEmail;
        public ProgressDialog progressDialog;

        public RegisterUserRequest(String userName, String userEmail, ProgressDialog progressDialog) {
            this.userName = userName;
            this.userEmail = userEmail;
            this.progressDialog = progressDialog;
        }
    }

    public static class RegisterUserResponse extends ServiceResponse{

    }

    public static class LogUserInRequest {
        public String userEmail;
        public String userPassword;
        public ProgressDialog progressDialog;
        public SharedPreferences sharedPreferences;



        public LogUserInRequest(String userEmail, String userPassword, ProgressDialog progressDialog, SharedPreferences sharedPreferences) {
            this.userEmail = userEmail;
            this.userPassword = userPassword;
            this.progressDialog = progressDialog;
            this.sharedPreferences = sharedPreferences;
        }
    }

        public static class LogUserInresponse extends ServiceResponse{

    }


}
