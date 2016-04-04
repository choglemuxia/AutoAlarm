package com.example.chogle.autoalarm.database;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by chogle on 2016/4/4.
 *
 * AlarmDatabase数据库的SQLiteOpenHelper
 */
public class AlarmDatabaseOpenHelper extends SQLiteOpenHelper{

    /**
     * alarm表建表语句
     */
    public static final String CREATE_ALARM = "create table Alarm(" +
            "id integer primary key autoincrement," +
            "alarm_name text," +
            "alarm_time_minute integer," +
            "alarm_time_hour integer," +
            "alarm_repeat_days text," +
            "alarm_repeat_weekly boolean," +
            "alarm_tone text," +
            "alarm_enabled boolean)";


    public AlarmDatabaseOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public AlarmDatabaseOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_ALARM);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
