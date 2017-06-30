package com.example.admin.itdepartment.dialog;

import android.app.DialogFragment;
import android.os.Bundle;

import com.example.admin.itdepartment.infrastructure.ItdepartmentApplication;
import com.squareup.otto.Bus;

/**
 * Created by ADMIN on 06-Apr-17.
 */

public class BaseDialog extends DialogFragment {
    protected ItdepartmentApplication application;
    protected Bus bus;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        application = (ItdepartmentApplication) getActivity().getApplication();
        bus= application.getBus();
        bus.register(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        bus.unregister(this);
    }
}
