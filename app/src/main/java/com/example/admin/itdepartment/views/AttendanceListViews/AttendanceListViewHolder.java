package com.example.admin.itdepartment.views.AttendanceListViews;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.admin.itdepartment.R;
import com.example.admin.itdepartment.entities.AttendanceList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AttendanceListViewHolder  extends RecyclerView.ViewHolder{

    @BindView(R.id.list_attendance_list_student_name)
    TextView ownerName;

    @BindView(R.id.list_attendance_list_name)
    TextView listName;

    @BindView(R.id.list_attendance_list_relative_layout)
    public View layout;

    public AttendanceListViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void populate(AttendanceList attendanceList){
        ownerName.setText(attendanceList.getOwnerName());
        listName.setText(attendanceList.getListName());
    }
}
