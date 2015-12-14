package com.aalex.simpledictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MagyarAngolInsert extends AppCompatActivity implements View.OnClickListener {
    DatabaseAcces databaseAccess;
    Button Felvitel;
    EditText SzoEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magyar_angol_insert);

        Felvitel = (Button) findViewById(R.id.Felvitelbutton);
        Felvitel.setOnClickListener(this);

        SzoEditText = (EditText) findViewById(R.id.SzoeditText);

        databaseAccess = DatabaseAcces.getInstance(this);
    }

    @Override
    public void onClick(View v) {
        if (v == Felvitel) {
            if (SzoEditText.getText().toString().length() != 0) {
                databaseAccess.LanguageInsert(SzoEditText.getText().toString());
                Intent eredeti = new Intent(MagyarAngolInsert.this, MagyarAngolInsert.class);
                startActivity(eredeti);
                finish();
            }
            else {
                Toast.makeText(this, "üres a mező", Toast.LENGTH_SHORT).show();
            }
        }

    }
}
