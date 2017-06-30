package com.example.admin.itdepartment.infrastructure;


import android.app.Application;

import com.example.admin.itdepartment.live.Module;
import com.firebase.client.Firebase;
import com.squareup.otto.Bus;

public class ItdepartmentApplication extends Application {
    private Bus bus;

    public ItdepartmentApplication(){
        bus= new Bus();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
        Module.Register(this);
    }

    public Bus getBus() {
        return bus;
    }
}
