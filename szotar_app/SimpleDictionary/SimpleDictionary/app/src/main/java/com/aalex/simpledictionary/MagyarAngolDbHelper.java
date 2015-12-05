package com.aalex.simpledictionary;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by apjok on 2015. 12. 05..
 */
public class MagyarAngolDbHelper extends SQLiteOpenHelper {
    private static  final String ADATBAZIS_NEVE = "MAGYARANGOL.DB";
    private static final int ADATBAZIS_VERZIO=1;
    private static final String CREATE_QUERY="CREATE TABLE "+MagyarAngol.UjMagyarAngolSzo.TABLA_NEVE+"("+MagyarAngol.UjMagyarAngolSzo.MAGYAR_SZO+" TEXT,"
            +MagyarAngol.UjMagyarAngolSzo.ANGOL_SZO+" TEXT);";
    public MagyarAngolDbHelper(Context context)
    {
        super(context, ADATBAZIS_NEVE, null, ADATBAZIS_VERZIO);
        Log.e("Adatbazis műveletek", "Adatb elkészült / megnyilt");

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_QUERY);
        Log.e("Adatbazis műveletek", "Tábla elkészült");

    }
    public void szoHozzaadasa(String magyar, String angol, SQLiteDatabase db)
    {
        ContentValues contentValues = new ContentValues();
        contentValues.put(MagyarAngol.UjMagyarAngolSzo.MAGYAR_SZO,magyar);
        contentValues.put(MagyarAngol.UjMagyarAngolSzo.ANGOL_SZO,angol);
        db.insert(MagyarAngol.UjMagyarAngolSzo.TABLA_NEVE, null, contentValues);

        Log.e("Adatbazis műveletek", "Egy sor felvéve");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
