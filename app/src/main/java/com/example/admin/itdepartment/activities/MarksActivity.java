package com.example.admin.itdepartment.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.example.admin.itdepartment.R;

import butterknife.ButterKnife;



public class MarksActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marks);
        ButterKnife.bind(this);

        if (userName.equals("Amtul")) {
            TextView textView = (TextView) findViewById(R.id.activity_marks_text);
            textView.setText("INTERNAL 1:");
        } else {
            TextView textView = (TextView) findViewById(R.id.activity_marks_text);
            textView.setText("Nothing to Display");
        }
        if (userName.equals("Amtul")) {
            TextView textView = (TextView) findViewById(R.id.activity_marks_sub1);
            textView.setText("SOFTWARE TESTING:18");
        }
        if (userName.equals("Amtul")) {
            TextView textView = (TextView) findViewById(R.id.activity_marks_sub2);
            textView.setText("THEORY OF AUTOMATA:16");
        }
        if (userName.equals("Amtul")) {
            TextView textView = (TextView) findViewById(R.id.activity_marks_sub3);
            textView.setText("ARTIFICIAL INTELLIGENCE:16");
        }
        if (userName.equals("Amtul")) {
            TextView textView = (TextView) findViewById(R.id.activity_marks_sub4);
            textView.setText("COMPUTER NETWORKS:20");
        }
        if (userName.equals("Amtul")) {
            TextView textView = (TextView) findViewById(R.id.activity_marks_sub5);
            textView.setText("THEORY OF AUTOMATA:19");
        }
        if (userName.equals("Amtul")) {
            TextView textView = (TextView) findViewById(R.id.activity_marks_sub6);
            textView.setText("CCDM:15");
        }
        if (userName.equals("Amtul")) {
            TextView textView = (TextView) findViewById(R.id.activity_marks_text2);
            textView.setText("INTERNAL 2:");
        }
        if (userName.equals("Amtul")) {
            TextView textView = (TextView) findViewById(R.id.activity_marks_sub7);
            textView.setText("SOFTWARE TESTING:TBA");
        }
        if (userName.equals("Amtul")) {
            TextView textView = (TextView) findViewById(R.id.activity_marks_sub8);
            textView.setText("THEORY OF AUTOMATA:TBA");
        }
        if (userName.equals("Amtul")) {
            TextView textView = (TextView) findViewById(R.id.activity_marks_sub9);
            textView.setText("ARTIFICIAL INTELLIGENCE:TBA");
        }
        if (userName.equals("Amtul")) {
            TextView textView = (TextView) findViewById(R.id.activity_marks_sub10);
            textView.setText("COMPUTER NETWORKS:TBA");
        }
        if (userName.equals("Amtul")) {
            TextView textView = (TextView) findViewById(R.id.activity_marks_sub11);
            textView.setText("THEORY OF AUTOMATA:TBA");
        }
        if (userName.equals("Amtul")) {
            TextView textView = (TextView) findViewById(R.id.activity_marks_sub12);
            textView.setText("CCDM:TBA");
        }
    }
}
