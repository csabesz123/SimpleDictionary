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

        String[] values = new String[] {"a - die","abbahagy - 停止","abbamarad - やめます","ABC - スーパーマーケット","ábécé - アルファベット","ablak - ウィンドウ",
                "ablakpárkány - 窓台","ablaktörlõ - ワイパー","abortusz - 中絶","ábra - 図","ábránd - 夢","ábrándozás - 夢","ábrándozik - 空想","ábrándozó - 夢想家","ábrázol - 描きます","abrosz - テーブルクロス",
                "abszolút - 絶対的なt","abszolút hallás - 絶対音感ör","abszurd - 不条理な","acél - スチール","ács - 大工r","ácsorog - ラウンジ","ad - 与えます","adag - 用量","adapter - アダプタ","adás - 放送",
                "adat - データ","ádáz - 熾烈な","addig - 前","addig is - その間に","addigra - その間に、","adjunktus - 講師","adminisztratív - 行政の","adó - Steuer","adó-vevõ - トランシーバ","adódik - 原因",
                "aggaszt - 心配","ágy - ベッド","agyad - あなたの脳","ajak - リップ","ajándék - ギフト","ajándékoz - 寄付します", "ajánlat - 入札","ajtó - ドア","ajtócsengõ - チャイム","akadály - バリア",
                "akár - 偶数","állam - 状態","átlatlános - 一般的な","analizál - 分析します","anya - 母","apa - 父","aranyos - すてきな","arc - 顔","árny - シャドー","autó - 車","autómata - オート","B", "","bab - 豆",
                "baba - 赤ちゃん","baj - トラブル","bajnok - チャンピオン","bajnokság - チャンピオンシップ","bájos - 愛らしいです","bakancs - ブーツ","bal - 左","baleset - 事故","balta - 斧","bámul - 凝視",
                "bárhol - どこでも","bárki - 誰でも","bármikor - たびに", "barna - ブラウン","basszus - 低音","be - 上の","beállít - 調整します","becsület - 名誉","becsületes - 正直な","bedug - プラグを差し込みます","befagy - 凍結"};

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
