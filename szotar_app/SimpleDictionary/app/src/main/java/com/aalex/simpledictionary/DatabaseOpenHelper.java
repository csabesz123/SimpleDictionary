package com.aalex.simpledictionary;

/**
 * Created by apjok on 2015. 12. 13..
 */
import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DatabaseOpenHelper extends SQLiteAssetHelper {
    public static final String DATABASE_NAME = "MagyarAngolDatabase.db";
    public static final int DATABASE_VERSION = 1;

    public DatabaseOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public class DatabaseOpenHelperNemet extends SQLiteAssetHelper {
        public static final String DATABASE_NAME = "MagyarNemetDatabase.db";
        public static final int DATABASE_VERSION = 1;

        public DatabaseOpenHelperNemet(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }
    }
}
