package com.aalex.simpledictionary;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MagyarAngolSzoFelviteleActivity extends AppCompatActivity {
    EditText MagyarSzo, AngolSzo;
    Context context = this;
    MagyarAngolDbHelper magyarAngolDbHelper;
    SQLiteDatabase sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magyar_angol_szo_felvitele);
        MagyarSzo = (EditText)findViewById(R.id.magyar_szo);
        AngolSzo = (EditText) findViewById(R.id.angol_szo);

        //final Intent intentSzavakFelvetele = getIntent();
    }
    public void addSzo(View view)
    {
        String magyarSzo = MagyarSzo.getText().toString();
        String angolSzo = AngolSzo.getText().toString();
        magyarAngolDbHelper = new MagyarAngolDbHelper(context);
        sqLiteDatabase = magyarAngolDbHelper.getWritableDatabase();
        magyarAngolDbHelper.szoHozzaadasa(magyarSzo, angolSzo, sqLiteDatabase);
        Toast.makeText(getBaseContext(), "Szó hozzáadva", Toast.LENGTH_LONG).show();
        magyarAngolDbHelper.close();
    }
}
