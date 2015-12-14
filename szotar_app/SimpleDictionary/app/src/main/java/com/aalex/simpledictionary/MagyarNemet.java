package com.aalex.simpledictionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class MagyarNemet extends AppCompatActivity {

    ListView lv;
    SearchView sv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magyar_nemet);

        lv = (ListView)findViewById(R.id.magyarNemetLista);
        sv=(SearchView)findViewById(R.id.searchView1);

        String[] values = new String[] { "a - die","abbahagy - stoppen","abbamarad - aufhören","ABC - Supermarkt","ábécé - ABECE","ablak - fenster",
                "ablakpárkány - Fensterbank","ablaktörlő - scheibenwischer","abortusz - abtreibung","ábra - Abbildung","ábránd - träumen",
                "ábrándozás - träumen","ábrándozik - Tagträumen","ábrándozó - Träumer","ábrázol - abbilden",
                "abrosz - Tischdecke","abszolút - absolut","abszolút hallás - das absolute Gehör",
                "abszurd - absurd","acél - Stahl","ács - Schreiner","ácsorog - Wohnzimmer","ad - gaben",
                "adag - dosieren","adapter - Adapter","adás - Broadcast","adat - daten","ádáz - Fierce",
                "addig - vor","addig is - inzwischen","addigra - bis dahin","adjunktus - dozent",
                "adminisztratív - administrativ","adó - Steuer","adó-vevő - Transceiver",
                "adódik - fällig","aggaszt - Sorge","ágy - Bett","agyad - Ihr Gehirn","ajak - Lippe",
                "ajándék - Geschenk","ajándékoz - spenden","ajánlat - Gebot","ajtó - Tür",
                "ajtócsengő - Glockenschlag","akadály - Barriere","akár - selbst","állam - Zustand",
                "átlatlános - allgemein","analizál - analysieren","anya - Mutter","apa - Vater",
                "aranyos - schön","arc-Gesicht","árny - Schlagschatten","autó - Auto",
                "autómata - Automaten","B", "","bab - Bohnen","baba - Baby","baj - Schwierigkeiten",
                "bajnok - Champion","bajnokság - Meisterschaft","bájos - lieblich","bakancs - Stiefel",
                "bal - links","baleset - Unfall","balta - Axt","bámul - glotzen","bárhol - irgendwo",
                "bárki - jemand","bármikor - wann auch immer","barna - braun","basszus - Bass","be - auf",
                "beállít - einstellen","becsület - Ehre","becsületes - ehrlich","bedug - einstecken",
                "befagy - frieren",};

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

        lv = (ListView) findViewById(R.id.magyarNemetLista);
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
