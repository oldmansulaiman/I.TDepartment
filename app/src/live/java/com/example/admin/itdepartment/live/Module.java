package com.example.admin.itdepartment.live;


import com.example.admin.itdepartment.infrastructure.ItdepartmentApplication;

public class Module
{
    public static void Register(ItdepartmentApplication application){
        new LiveAccountServices(application);
    }
}
