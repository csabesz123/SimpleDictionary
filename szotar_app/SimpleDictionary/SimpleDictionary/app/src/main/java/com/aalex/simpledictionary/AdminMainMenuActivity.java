package com.aalex.simpledictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminMainMenuActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonAdminMagyarAngol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_main_menu);


        buttonAdminMagyarAngol = (Button) findViewById(R.id.buttonAdminMagyarAngol);
        buttonAdminMagyarAngol.setOnClickListener(this);


        final Intent intentAdminMainMenu = getIntent();
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonAdminMagyarAngol:
                Intent intentAdatbazisMuveletek = new Intent(AdminMainMenuActivity.this, AdatbazisMuveletekActivity.class);
                startActivity(intentAdatbazisMuveletek);
                break;
        }
    }
}
