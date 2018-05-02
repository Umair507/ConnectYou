package com.example.umairmumtaz.connectyou.view.activities;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.umairmumtaz.connectyou.R;

public class FirstPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
    }

    public void Start(View view) {
        Intent intent = new Intent(getApplicationContext(), Start.class);
        startActivity(intent);
    }

    public void Instructions(View view) {
        Intent intent = new Intent(getApplicationContext(), Instructions.class);
        startActivity(intent);
    }

    public void About(View view) {
        Intent intent = new Intent(getApplicationContext(), About.class);
        startActivity(intent);
    }

    public void ContactUs(View view) {
        Intent intent = new Intent(getApplicationContext(), ContactUs.class);
        startActivity(intent);
    }

    public void Exit(View view) {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Do You Want To Exit ?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = new Intent(getApplicationContext(), ZeroActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        intent.putExtra("EXIT", true);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });
        builder.create();
        builder.show();
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), ZeroActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("EXIT", true);
        startActivity(intent);
    }

}
