package com.example.admin.itdepartment.activities;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class SplashScreenActivity extends BaseActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
}
