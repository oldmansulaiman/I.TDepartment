package com.example.admin.itdepartment.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.admin.itdepartment.R;



public class StudentActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
    }

    public void attend (View view){
        Intent intent = new Intent(this,AttendActivity.class);
        startActivity(intent);
    }

    public void marks (View view){
        Intent intent = new Intent(this,MarksActivity.class);
        startActivity(intent);
    }

    public void resources (View view){
        Intent intent = new Intent(this,ResourcesActivity.class);
        startActivity(intent);
    }

    public void acm (View view){
        Intent intent = new Intent(this,AcmActivity.class);
        startActivity(intent);
    }

    public void cal(View view){
        Intent intent = new Intent(this,CalenderActivity.class);
        startActivity(intent);
    }

}
