package com.aalex.simpledictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MagyarOlasz extends AppCompatActivity     {
    ListView lv;
    SearchView sv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magyar_olasz);

        lv = (ListView)findViewById(R.id.magyarOlaszLista);
        sv=(SearchView)findViewById(R.id.searchView1);
        //
        String[] values = new String[] {"A-Á", "", "a - il","abbahagy - smettere", "abbamarad - cessare", " ABC - supermercato", "ablak - finestra", "ablaktörlő - tergicristallo", "abortusz - aborto", "ábra - cifra",
                "ábránd - sognare", "ábrázol - rappresentare", "abrosz - tovaglia", "abszurd -assurdo", "acél - acciaio", "ács - falegname", "ácsorog - salotto", "ad - dare", "adat - dati", "ádáz - feroce", "addig - prima", "adó - tasse", "adódik  - dovuto", "aggaszt - preoccuparsi", "ágy - letto",
                 "agyag - argilla", "ajak - labbro", "ajándék - regalo", "ajándékoz - donare", "ajánlat - offerta", "ajtó - porta", "ajtócsengő - Chime", "akadály - barriera", "akár - anche", "állam - stato", "átlatlános - generale",
                "analizál - analizzare", "anya - madre", "apa- padre", "aranyos - bello", "arc - faccia", "árny - ombra", "autó - auto", "autómata - automatici", "B", "",  "bab - fagiolo", "baba - bambino", "baj - problemi",
                "bajnok - campione", "bajnokság - campione", "bájos - attraente", "bakancs - avvio", "bal - sinistra", "baleset - incidente", "balta - ascia", "bámul - fissare", "bárhol - dovunque", "bárki - qualcuno",
                "bármi - nulla", "bármikor - ogni volta che", "barna - colore marrone", "basszus - basso", "be - in", "beállít - impostato", "becsület - onore", "becsületes - onesto", "bedug - spina", "befagy - congelare",
                "befed - coprire", "befejez - coprire", "belerak - metti dentro", "bizakodás - speranza", "bízik - credere in","bizonyít - dimostrare", "biztonság - sicurezza", "blöff - bluff", "bocsánatkérés - chiedere scusa",
                "bogár - insetto", "bomba - bomba", "bolt - negozio", "bor - vino", "borda - costola", "borotva - rasoio", "bors - Pepe", "büszke - orgoglio", };

        final ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < values.length; ++i) {
            list.add(values[i]);
        }

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);

        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String text) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String text) {
                adapter.getFilter().filter(text);

                return false;
            }
        });

        lv = (ListView) findViewById(R.id.magyarOlaszLista);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final String item = (String) parent.getItemAtPosition(position);

                Toast.makeText(getApplicationContext(), item, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
