package com.example.chogle.autoalarm.model;

import android.net.Uri;

/**
 * 闹钟模型
 * Created by chogle on 2016/4/4.
 */
public class Alarm {

    /**
     * 星期常量
     */
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THUSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;

    private int id = -1;
    private String name;
    private boolean repeatingDays[] = new boolean[7];
    private boolean repeatWeekly = true;
    private boolean isEnabled = true;
    private Uri alarmTone;
    private int timeMinute;
    private int timeHour;

    public Alarm(){

    }


}
