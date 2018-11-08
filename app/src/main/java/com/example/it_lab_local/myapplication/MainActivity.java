package com.example.it_lab_local.myapplication;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Instance Variables
    TextView textViewPlayerScoreBox;
    TextView textViewAiScoreBox;
    TextView textViewSpeed;
    Button buttonReset;

    Handler handler = new Handler();
    Runnable refresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        textViewPlayerScoreBox = findViewById(R.id.textViewPlayerScore);
        textViewAiScoreBox = findViewById(R.id.textViewAiScore);
        textViewSpeed = findViewById(R.id.textViewSpeed);
        buttonReset = findViewById(R.id.buttonReset);


        refresh = new Runnable() {
            @Override
            public void run() {



                //handler.postDelayed(refresh, 100);
            }
        };
        handler.post(refresh);


        buttonReset.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

            }
        });




    } // end onCreate
} // end MainActivity class
