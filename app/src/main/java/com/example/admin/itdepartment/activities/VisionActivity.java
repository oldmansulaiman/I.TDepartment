package com.example.admin.itdepartment.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.admin.itdepartment.R;

import butterknife.ButterKnife;

/**
 * Created by ADMIN on 07-Apr-17.
 */

public class VisionActivity extends BaseActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vision);
        ButterKnife.bind(this);
    }
}
