package com.example.umairmumtaz.connectyou.view.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.umairmumtaz.connectyou.R;

public class ZeroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zero);

        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
            System.exit(0);
        }

        Runnable r = new Runnable() {
            @Override
            public void run(){
                Intent intent = new Intent(getApplicationContext(), FirstPage.class);
                startActivity(intent);
            }
        };

        Handler h = new Handler();
        h.postDelayed(r, 1000);

    }
}
