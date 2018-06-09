package com.example.android.colorgame;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bRed = findViewById(R.id.buttonRed);
        Button bGreen = findViewById(R.id.buttonGreen);
        Button bYellow = findViewById(R.id.buttonYellow);
        Button bBlack = findViewById(R.id.buttonBlack);
        final ConstraintLayout back1 = findViewById(R.id.back1);

        bRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back1.setBackgroundColor(Color.RED);
            }
        });

        bGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back1.setBackgroundColor(Color.GREEN);
            }
        });

        bYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back1.setBackgroundColor(Color.YELLOW);
            }
        });

        bBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back1.setBackgroundColor(Color.BLACK);
            }
        });

    }
}
