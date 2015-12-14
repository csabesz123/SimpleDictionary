package com.aalex.simpledictionary;

/**
 * Created by apjok on 2015. 12. 13..
 */
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseAcces {
    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase database;
    private static DatabaseAcces instance;


    private DatabaseAcces(Context context) {
            this.openHelper = new DatabaseOpenHelper(context);
        }


    public static DatabaseAcces getInstance(Context context) {
        if (instance == null) {
            instance = new DatabaseAcces(context);
        }
        return instance;
    }

    //adatbáziskapcsolat nyitása
    public void open() {
        this.database = openHelper.getWritableDatabase();
    }

    //adatbázis kapcsolat bezárása
    public void close() {
        if (database != null) {
            this.database.close();
        }
    }

    //adatbázisból olvassa a sorokat, majd egy listában visszaadja
    public List<String> getQuotes() {
        List<String> list = new ArrayList<>();
        Cursor cursor = database.rawQuery("SELECT * FROM magyar_angol", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            list.add(cursor.getString(0));
            cursor.moveToNext();
        }
        cursor.close();
        return list;
    }

    public boolean LanguageInsert(String Szo) {
        open();
        try {
            String sql = " INSERT INTO magyar_angol (szavakmezo) VALUES (\"" + Szo + "\")";
            database.execSQL(sql);
            close();
            return true;
        }
        catch (android.database.SQLException e) {
            e.printStackTrace();
            close();
            return false;
        }
    }
}
