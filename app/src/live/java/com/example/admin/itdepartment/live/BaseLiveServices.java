package com.example.admin.itdepartment.live;


import com.example.admin.itdepartment.infrastructure.ItdepartmentApplication;
import com.google.firebase.auth.FirebaseAuth;
import com.squareup.otto.Bus;

public class BaseLiveServices {
    protected Bus bus;
    protected ItdepartmentApplication application;
    protected FirebaseAuth auth;

    public BaseLiveServices(ItdepartmentApplication application) {
        this.application = application;
        bus= application.getBus();
        bus.register(this);
        auth=FirebaseAuth.getInstance();
    }

}
