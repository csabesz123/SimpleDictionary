package com.aalex.simpledictionary;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class LoginActivity extends AppCompatActivity implements  View.OnClickListener {
    //ListView lv;
    String[] szavak;
    ArrayList<String> listaSzavak; //items
    ArrayAdapter<String> adapter;
    EditText editText;
    ListView listView;
    Button buttonBelepes;
    Button buttonExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        buttonBelepes = (Button) findViewById(R.id.buttonBelepes);
        buttonBelepes.setOnClickListener(this);

        buttonExit = (Button) findViewById(R.id.buttonExit);
        buttonExit.setOnClickListener(this);



    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonBelepes:
                Intent intentBelepes = new Intent(LoginActivity.this, MainMenuActivity.class);
                startActivity(intentBelepes);
                break;

            case R.id.buttonExit:
                finish();
                break;



        }
    }
}












//lv = (ListView)findViewById(R.id.angolListaSzavak); //jó kód
//adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, szavak);
        /*lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+" kiválasztva",Toast.LENGTH_LONG).show();
            }
        });*/

