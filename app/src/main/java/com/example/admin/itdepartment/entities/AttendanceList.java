package com.example.admin.itdepartment.entities;

import java.util.HashMap;

/**
 * Created by ADMIN on 09-Apr-17.
 */

public class AttendanceList {
    private String id;
    private String listName;
    private String ownerEmail;
    private String ownerName;

    public AttendanceList(String id, String listName, String ownerEmail, String ownerName) {
        this.id = id;
        this.listName = listName;
        this.ownerEmail = ownerEmail;
        this.ownerName = ownerName;
    }

    public String getId() {
        return id;
    }

    public String getListName() {
        return listName;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public String getOwnerName() {
        return ownerName;
    }

}
