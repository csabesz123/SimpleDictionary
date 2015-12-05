package com.aalex.simpledictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainMenuActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonSzotarak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        buttonSzotarak = (Button) findViewById(R.id.buttonSzotarak);
        buttonSzotarak.setOnClickListener(this);

        final Intent intentBelepes = getIntent();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonSzotarak:
                Intent intentSzotarak = new Intent(MainMenuActivity.this, SzotarakActivity.class);
                startActivity(intentSzotarak);
                break;
        }
    }
}
