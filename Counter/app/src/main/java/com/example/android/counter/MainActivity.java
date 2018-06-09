package com.example.android.counter;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button add = findViewById(R.id.buttonAdd);
        Button reset = findViewById(R.id.buttonReset);
        Button sub = findViewById(R.id.buttonSub);
        final TextView counterView = findViewById(R.id.counterView);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = counter + 1;
                counterView.setText("" + counter);
                MediaPlayer add = MediaPlayer.create(getBaseContext(), R.raw.add);
                add.start();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = 0;
                counterView.setText("" + counter);
                MediaPlayer reset = MediaPlayer.create(getBaseContext(), R.raw.reset);
                reset.start();
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter >= 1){
                    counter = counter -1;
                    counterView.setText("" + counter);
                    MediaPlayer sub = MediaPlayer.create(getBaseContext(), R.raw.sub);
                    sub.start();
                }
            }
        });
    }
}
