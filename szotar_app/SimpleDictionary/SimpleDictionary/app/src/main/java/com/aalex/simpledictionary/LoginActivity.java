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

public class LoginActivity extends AppCompatActivity {
    //ListView lv;
    String[] szavak;
    ArrayList<String> listaSzavak; //items
    ArrayAdapter<String> adapter;
    EditText editText;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void mainMenuNyit(View view) {
        setContentView(R.layout.main_menu);

        overridePendingTransition(R.anim.animtut, R.anim.animtut2);
    }


    public void szotarakNyit(View view) {
        setContentView(R.layout.szotarak_layout);
        overridePendingTransition(R.anim.animtut, R.anim.animtut2);

    }

    public void angolMagyarListaz(View view) {
        setContentView(R.layout.angol_magyar_lista);
        //setContentView(R.layout.angol_magyar_lista);
        listView = (ListView) findViewById(R.id.angolListaSzavak);
        editText = (EditText) findViewById(R.id.textsearch);
        listView.setAdapter(adapter);
        initList();
        itemClickON();
        overridePendingTransition(R.anim.animtut, R.anim.animtut2);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().equals("")) {
                    initList();
                } else {
                    searchItem(s.toString());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public void searchItem(String textToSearch) {
        for (String item : szavak) {
            if (!item.contains(textToSearch)) {
                listaSzavak.remove(item);
            }
        }
        adapter.notifyDataSetChanged();
    }

    public void initList() {
        szavak = new String[]{"Szó1", "wedsa", "htgfd", "fesfd", "fdsfs", "cxca", "oiuz", "mnh", "tds", "xss", "sd", "bm", "rr"};
        listaSzavak = new ArrayList<>(Arrays.asList(szavak));
        adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.txtitem, listaSzavak);
        listView.setAdapter(adapter);

    }

    public void itemClickON()
    {
        listView = (ListView)findViewById(R.id.angolListaSzavak);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+" kiválasztva",Toast.LENGTH_LONG).show();
            }
        });
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

