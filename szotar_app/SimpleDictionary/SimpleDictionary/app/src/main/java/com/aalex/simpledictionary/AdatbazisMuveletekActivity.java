package com.aalex.simpledictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdatbazisMuveletekActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonSzavakFelvetele;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adatbazis_muveletek);

        buttonSzavakFelvetele = (Button) findViewById(R.id.buttonSzavakFelvetele);
        buttonSzavakFelvetele.setOnClickListener(this);

        final Intent intentAdatbazisMuveletek = getIntent();
    }



    public void onClick(View v){
        switch (v.getId())
        {
            case R.id.buttonSzavakFelvetele:
                Intent intentSzavakFelvetele = new Intent(AdatbazisMuveletekActivity.this, MagyarAngolSzoFelviteleActivity.class);
                startActivity(intentSzavakFelvetele);
                break;



        }
    }
}
