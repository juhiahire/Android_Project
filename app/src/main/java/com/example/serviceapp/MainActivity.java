package com.example.serviceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button start, stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = findViewById(R.id.start_button);
        stop = findViewById(R.id.stop_button);


        start.setOnClickListener( this);
        stop.setOnClickListener( this);
    }

    public void onClick(View v){
        if(v == start){
            startService(new Intent(this, NewService.class));
        } else if (v == stop) {
            stopService(new Intent(this, NewService.class));
        }
    }
}