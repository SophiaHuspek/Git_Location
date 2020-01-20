package com.example.git_location;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MySQLiteHelper extends SQLiteOpenHelper {

    public static final String TABLE_NAME = "Locations";
    private final static String DB_NAME = "locations.db";
    private final static int DB_VERSION = 1;

    public final static String LocationID = "LocationID";
    public final static String Longitude = "Longitude";
    public final static String Latitude = "Latitude";
    public final static String Date = "Date";
    public final static String Time = "Time";

    public MySQLiteHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " +TABLE_NAME +
                    "(" +
                      LocationID + "INTEGER PRIMARY KEY," +
                      Longitude + "TEXT NOT NULL," +
                      Latitude + "TEXT NOT NULL," +
                      Date + "TEXT NOT NULL," +
                      Time + "TEXT NOT NULL" +
                      ")"
                        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DELETE FROM " + TABLE_NAME);
        onCreate(db);

    }
}
