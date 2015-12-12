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

public class MagyarAngolLista extends AppCompatActivity     {
        ListView lv;
        SearchView sv;


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magyar_angol_lista);

        lv = (ListView)findViewById(R.id.magyarAngolLista);
        sv=(SearchView)findViewById(R.id.searchView1);

        String[] values = new String[] {"A-Á", "", "a - the", "abbahagy - abandon", "abbamarad - go off", " ABC - supermarket", "ablak - window", "ablaktörlő - windscreen",
                "abortusz - abortion", "ábra - diagram", "ábránd - daydream", "ábrázol - portray", "abrosz - cloth", "abszurd - absurd", "acél - steel", "ács - carpenter", "ácsorog - stand",
                "ad - give", "adat - data", "ádáz - bitter", "addig - then", "adó - duty", "adódik  - arise", "aggaszt - disturbe", "ágy - bed", "agyad - clay", "ajak - lip", "ajándék - gift",
                "ajándékoz - give away", "ajánlat - offer", "ajtó - door", "ajtócsengő - doorbell", "akadály - block", "akár - well", "állam - state", "átlatlános - generaly",
                "analizál - analyse", "anya - mother", "apa- father", "aranyos - lovely", "arc - face", "árny - shadow", "autó - car", "autómata - automatic", "B", "",  "bab - bean",
                "baba - baby", "baj - trouble", "bajnok - champion", "bajnokság - champion", "bájos - attractive", "bakancs - boot", "bal - left", "baleset - accident", "balta - axe",
                "bámul - stare", "bárhol - anywhere", "bárki - anybody", "bármi - anything", "bármikor - whenever", "barna - brown", "basszus - bass", "be - in", "beállít - set",
                "becsület - honour", "becsületes - honest", "bedug - plug", "befagy - freeze", "befed - cover", "befejez - cover", "belerak - put into", "bizakodás - hope",
                "bízik - belive in", "bizonyít - prove", "biztonság - safety", "blöff - bluff", "bocsánatkérés - apologise", "bogár - insect", "bomba - bomb", "bolt - shop",
                "bor - wine", "borda - rip", "borotva - shaver", "bors - pepper", "büszke - pride", "C-CS", "cápa - shark", "cédula - tag", "cél - targer", "cella - cell",
                "cifra - fancy", "cikk - article", "cím - address", "cipő - shoes", "civilizáció - civilization", "cukor - sugar", "csal - cheat", "család - family", "csapás - disaster",
                "csapat - team", "csata - battle", "csendes - quiet", "cseng - ring", "csepp - drop", "cserél - change", "csík - streak", "csípés - bite", "csoda - wonder", "csók - kiss",
                "csomag - pack", "csont - bone", "cső - pipe", "csökkentés - decrease", "csúszás - slide", "dal - song", "daru - crane", "dátum - date", "de - but", "defekt - puncture",
                "dél - south", "desszert - dessert", "deszka - board", "diák - student", "díj - award", "díjmentes - free", "diktátor - dictator", "díszít - decorate", "disznó - pig",
                "dívány - sofa", "divat - fashion", "dob - throw", "dobog - beat", "dohányos - smoker", "domb - hill", "döntés - decision", "döntő - final", "dráma - drama", "drámai - dramatic",
                "drót - wire", "düh - anger", "dzseki - jacket", "dzsem - jam", "ebéd - lunch", "ébred - awake", "ébresz - wake", "ecset - brush", "édes - sweet", "édesség - candy", "edz - train",
                "edző - coach", "ég - sky", "egér - mouse", "égés - burn", "egész - all", "egészség - health", "egyedülálló - single", "egyenlő - equal", "elad - sell", "eladás - sale", "eláru - betray",
                "elbújik - hide", "elég - enough", "elegáns - elegant", "elemi - elementary", "éles - sharp", "élet - life", "élethű - realistic", "elismétel - repeat", "energia - energy",
                "enged - allow", "épület - building", "érme - coin", "érték - value", "esemény - event", "esik - fall", "eső - rain", "este - evening", "észak - north", "esszé - essay", "fa -tree",
                "fagyás - frost", "fájdalom - pain", "fal - wall", "falu - village ", "fáradt - tired", "farm - farm"};

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

        lv = (ListView) findViewById(R.id.magyarAngolLista);
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
