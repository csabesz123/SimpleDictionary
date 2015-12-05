package com.aalex.simpledictionary;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static android.support.v7.widget.SearchView.*;

/**
 * Created by apjok on 2015. 11. 27..
 */
public class AngolMagyarLista extends Activity {
    ListView lv;
    String[] szavak = {"a","s","d","f","g","h","j","k","l","q","w","e","v"};
    ArrayList<String> listaSzavak; //items
    ArrayAdapter<String> adapter;


    SearchView sv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.angol_magyar_lista);

        lv = (ListView)findViewById(R.id.angolListaSzavak);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, szavak);
        lv.setAdapter(adapter);

        /*lv = (ListView) findViewById(R.id.angolListaSzavak);
        sv = (SearchView) findViewById(R.id.searchViewKereso);

        adapter = new ArrayAdapter<String>(this, R.layout.angol_magyar_lista, szavak);
        lv.setAdapter(adapter);

        //sv.setOnQueryTextListener(adapter.getFilter().filter(szavak));*/



    }
}














