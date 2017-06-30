package com.example.admin.itdepartment.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.admin.itdepartment.R;

import butterknife.ButterKnife;

/**
 * Created by ADMIN on 11-Apr-17.
 */

public class AcmActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acm);
        ButterKnife.bind(this);
    }

    public void event1 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSfkkn_Gn6wIXDxpsAZTxCnXStGymaZNrOQwQ3VnXD7vH2opqw/viewform?usp=sf_link"));
        startActivity(browserIntent);
    }

    public void event2 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdwRaRf0TczqxaTys-nQK7MWrT6-e1aPfQwqFWspXEYjwVuWA/viewform?usp=sf_link"));
        startActivity(browserIntent);
    }
}
