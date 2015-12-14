package com.aalex.simpledictionary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.List;


public class MagyarAngolLista extends AppCompatActivity implements View.OnClickListener {
    Button buttonAddSzo;
    private ListView listView;

    SearchView sv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magyar_angol_lista);

        this.listView = (ListView) findViewById(R.id.listView);
        DatabaseAcces databaseAccess = DatabaseAcces.getInstance(this);
        databaseAccess.open();
        List<String> magyar_angol = databaseAccess.getQuotes();
        databaseAccess.close();


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, magyar_angol);
        this.listView.setAdapter(adapter);

        buttonAddSzo = (Button) findViewById(R.id.buttonAddSzo);
        buttonAddSzo.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v == buttonAddSzo)
        {
                Intent intentAddSzo = new Intent(MagyarAngolLista.this, MagyarAngolInsert.class);
                Toast.makeText(this,"Felvitel", Toast.LENGTH_SHORT).show();
                startActivity(intentAddSzo);
            finish();

        }

    }
}
