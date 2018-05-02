package com.example.umairmumtaz.connectyou.view.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.umairmumtaz.connectyou.R;

public class Instructions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
