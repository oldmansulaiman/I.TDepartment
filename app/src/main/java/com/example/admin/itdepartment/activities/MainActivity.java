package com.example.admin.itdepartment.activities;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.admin.itdepartment.R;
import com.example.admin.itdepartment.infrastructure.Utils;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MainActivity extends BaseActivity{

    private DatabaseReference mDatabase;

    private ListView mUserList;

    private ArrayList<String> mUpdates = new ArrayList<>();
    private ArrayList<String> mKeys = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDatabase = FirebaseDatabase.getInstance().getReference().child("updates");
        mUserList = (ListView) findViewById(R.id.activity_main_list);

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mUpdates);

        mUserList.setAdapter(arrayAdapter);


        mDatabase.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {

                String value = dataSnapshot.getValue(String.class);
                mUpdates.add(value);

                String key = dataSnapshot.getKey();
                mKeys.add(key);

                arrayAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

                String value = dataSnapshot.getValue(String.class);
                String key = dataSnapshot.getKey();

                int index = mKeys.indexOf(key);

                mUpdates.set(index, value);

                arrayAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        String toolBarName;

        if (userName.contains(" ")){
            toolBarName = userName.substring(0,userName.indexOf("")) + "'s Account";
        }else{
            toolBarName = userName + "'s Account";
        }

        getSupportActionBar().setTitle(toolBarName);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_logout:
                SharedPreferences sharedPreferences2 = getSharedPreferences(Utils.MY_PREFERENCE, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences2.edit();
                editor.putString(Utils.EMAIL,null).apply();
                editor.putString(Utils.USERNAME,null).apply();
                auth.signOut();
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                finish();

        }
        return true;
    }
    public void log (View view){
        Intent intent = new Intent(this,StudentActivity.class);
        startActivity(intent);
    }


    public void vis (View view){
        Intent intent = new Intent(this,VisionActivity.class);
        startActivity(intent);
    }

    public void mis (View view){
        Intent intent = new Intent(this,MissionActivity.class);
        startActivity(intent);
    }

    public void abt (View view){
        Intent intent = new Intent(this,AboutActivity.class);
        startActivity(intent);
    }

}
