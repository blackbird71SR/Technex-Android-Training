package com.example.android.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OptionActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);

        Button ml = findViewById(R.id.ml);
        Button android= findViewById(R.id.android);
        Button cloud = findViewById(R.id.cloud);
        Button iot = findViewById(R.id.iot);

        Button share = findViewById(R.id.share);

        ml.setOnClickListener(this);
        android.setOnClickListener(this);
        cloud.setOnClickListener(this);
        iot.setOnClickListener(this);
        share.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.ml:
                Intent ml = new Intent(OptionActivity.this, MLActivity.class);
//                ml.putExtra("name", userName);
                startActivity(ml);
                break;
            case R.id.android:
                Intent android = new Intent(OptionActivity.this, AndroidActivity.class);
//                android.putExtra("name", userName);
                startActivity(android);
                break;
            case R.id.cloud:
                Intent cloud = new Intent(OptionActivity.this, CloudActivity.class);
//                cloud.putExtra("name", userName);
                startActivity(cloud);
                break;
            case R.id.iot:
                Intent iot = new Intent(OptionActivity.this, IOTActivity.class);
//                iot.putExtra("name", userName);
                startActivity(iot);
                break;
            case R.id.share:
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "I scores 10 marks in android quiz...");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
        }
    }
}
