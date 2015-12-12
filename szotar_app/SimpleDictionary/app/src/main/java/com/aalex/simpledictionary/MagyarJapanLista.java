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

public class MagyarJapanLista extends AppCompatActivity {

    ListView lv;
    SearchView sv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magyar_japan_lista);

        lv = (ListView)findViewById(R.id.magyarJapanLista);
        sv=(SearchView)findViewById(R.id.searchView1);

        String[] values = new String[] { "abbahagy - 停止", "elmegy-出掛けます", "ABC - スーパーマーケット", "ablak - 車窓","ablaktörlő - ワイパー",
                "abortusz - 中絶", "abszolút -  寄付します", "ábrázol - 描きます", "acél-Suchīru", "ács - 大工", "adat - \n" +
                "データ", "addig - 前", "adó - \n" +
                "税",
                "adódik - \n" +
                        "原因", "adományoz - \n" +
                "寄付します", "adottság - \n" +
                "手腕", "agy - \n" +
                "脳", "valami - 寄付します","ül - \n" +
                "座ります","fekszik - \n" +
                "横たわっています","eszik - \n" +
                "食べます","repül - \n" +
                "飛びます","repülő - \n" +
                "飛行"




        };

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

        lv = (ListView) findViewById(R.id.magyarJapanLista);
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
