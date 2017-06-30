package com.example.admin.itdepartment.infrastructure;


public class Utils {
    public static final String FIRE_BASE_BASE_URL ="https://itdepartment-df0a9.firebaseio.com/";
    public static final String FIRE_BASE_USER_REFERENCE=FIRE_BASE_BASE_URL + "user/";
    public static final String FIRE_BASE_ATTENDANCE_LIST_REFERENCE = FIRE_BASE_BASE_URL + "userAttendanceList/";


    public static final String MY_PREFERENCE = "MY_PREFERENCE";
    public static final String EMAIL = "EMAIL";
    public static final  String USERNAME = "USERNAME";
    public static final String ATTENDANCE = "ATTENDANCE";
    public static String encodeEmail(String userEmail){
        return userEmail.replace(".",",");
    }


}
