package com.example.admin.itdepartment.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.LinearLayout;

import com.example.admin.itdepartment.R;

import butterknife.BindView;
import butterknife.ButterKnife;



public class AboutActivity extends BaseActivity {

    @BindView(R.id.activity_about_Linear_layout)
    LinearLayout linearLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        ButterKnife.bind(this);

    }

    public void bulink (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/amtulbushra/"));
        startActivity(browserIntent);
    }

    public void sulink (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/sulaimanabdulquadeer/"));
        startActivity(browserIntent);
    }


    public void aulink (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/mohd.ausaaf.7?fref=ts"));
        startActivity(browserIntent);
    }
}
