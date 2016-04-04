package com.example.chogle.autoalarm.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by chogle on 2016/4/4.
 *
 * AlarmDatabase 闹钟数据库类
 */
public class AlarmDatabase {

    /**
     * 数据库名称
     */
    public static final String ALARM_DA_NAME = "alarm.db";

    /**
     * 数据库版本
     */
    public static final int VERSION = 1;

    private static AlarmDatabase alarmDatabase;

    private SQLiteDatabase db;

    /**
     * 构造方法私有化
     */
    private AlarmDatabase(Context context){
        AlarmDatabaseOpenHelper dbHelper = new AlarmDatabaseOpenHelper(context, ALARM_DA_NAME, null, VERSION);
        db = dbHelper.getWritableDatabase();
    }

    /**
     * 获取AlarmDatabase实例
     * @param context
     * @return
     */
    public synchronized static AlarmDatabase getInstance(Context context){
        if (alarmDatabase == null)
            alarmDatabase = new AlarmDatabase(context);
        return alarmDatabase;
    }


}
