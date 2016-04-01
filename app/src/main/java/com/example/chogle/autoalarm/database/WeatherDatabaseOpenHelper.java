package com.example.chogle.autoalarm.database;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by chogle on 2016/3/31.
 */
public class WeatherDatabaseOpenHelper extends SQLiteOpenHelper {
    /**
     * province表建表语句
     * @param db
     */
    public static final String CREATE_PROVINCE = "cerate table Province(" +
            "id integer primary key autoincrement," +
            "province_name text" +
            "province_code text)";

    /**
     * city表建表语句
     * @param db
     */
    public static final String CREATE_CITY = "create table City(" +
            "id integer primary autoincrement," +
            "city_name text," +
            "city_code text," +
            "province_id integer)";

    /**
     * county表建表语句
     * @param db
     */
    public static final String CREATE_COUNTY = "create table County(" +
            "id integer primary autoincrement," +
            "county_name text," +
            "county_code text," +
            "city_id integer)";

    public WeatherDatabaseOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public WeatherDatabaseOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE_PROVINCE");
        db.execSQL("CREATE_CITY");
        db.execSQL("CREATE_COUNTY");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
