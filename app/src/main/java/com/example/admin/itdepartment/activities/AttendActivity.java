package com.example.admin.itdepartment.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.example.admin.itdepartment.R;

import butterknife.ButterKnife;

/**
 * Created by ADMIN on 13-Apr-17.
 */

public class AttendActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);
        ButterKnife.bind(this);

        if (userName.equals("Amtul")) {
            TextView textView = (TextView) findViewById(R.id.activity_attendance_text);
            textView.setText("65%");
        } else {
            TextView textView = (TextView) findViewById(R.id.activity_attendance_text2);
            textView.setText("No Attendance To Display");
        }
        if (userName.equals("Ausaaf")) {
            TextView textView = (TextView) findViewById(R.id.activity_attendance_text);
            textView.setText("70%");
        }
    }
}

