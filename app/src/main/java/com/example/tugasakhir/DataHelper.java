package com.example.tugasakhir;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "resto";
    private static final int DATABASE_VERSION = 1;
    public DataHelper(Context context){
        super(context, DATABASE_NAME,null,DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        String sql = "create table daerah(no integer primary key, daerah text null,namaresto text null,menuunggulan text null, menusampingan text null);";
        Log.d("Data","OnCreate: "+sql);
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2){

    }
}
