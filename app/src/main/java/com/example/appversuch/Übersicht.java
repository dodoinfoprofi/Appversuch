package com.example.appversuch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Übersicht extends AppCompatActivity
{
    private Button hörsaal;
    private Button seminar;
    private Button edv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        hörsaal = findViewById(R.id.hörsaal);
        hörsaal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_main3);
            }
        });
        seminar = findViewById(R.id.seminar);
        seminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_main4);
            }
        });
        edv = findViewById(R.id.edv);
        edv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_edv);
            }
        });

    }

}

