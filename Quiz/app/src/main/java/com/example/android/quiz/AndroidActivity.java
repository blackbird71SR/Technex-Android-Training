package com.example.android.quiz;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class AndroidActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);

        final TextView descr = findViewById(R.id.descr);

        final CheckBox aq1a1 = findViewById(R.id.aq1a1);
        final CheckBox aq1a2 = findViewById(R.id.aq1a2);
        final CheckBox aq1a3 = findViewById(R.id.aq1a3);
        final CheckBox aq1a4 = findViewById(R.id.aq1a4);


        aq1a1.setOnClickListener(this);
        aq1a2.setOnClickListener(this);
        aq1a3.setOnClickListener(this);
        aq1a4.setOnClickListener(this);

        Button back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(AndroidActivity.this, MainActivity.class);
                if(aq1a1.isChecked()){
                    Toast.makeText(getApplicationContext(), "Correct answer...", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(), "You are wrong...", Toast.LENGTH_LONG).show();
                }
                startActivity(back);
            }
        });

        String name = getIntent().getExtras().get("name").toString();
        descr.setText("Welcome to Android, " + name + "!");
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id){
//            case R.id.aq1a1:
//                aq1a2.setChecked(false);
//                aq1a3.setChecked(false);
//                aq1a4.setChecked(false);
//            case R.id.aq1a2:
//                aq1a1.setChecked(false);
//                aq1a3.setChecked(false);
//                aq1a4.setChecked(false);
//            case R.id.aq1a3:
//                aq1a2.setChecked(false);
//                aq1a1.setChecked(false);
//                aq1a4.setChecked(false);
//            case R.id.aq1a4:
//                aq1a2.setChecked(false);
//                aq1a3.setChecked(false);
//                aq1a1.setChecked(false);
        }

    }
}
