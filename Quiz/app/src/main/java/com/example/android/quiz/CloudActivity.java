package com.example.android.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CloudActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloud);

        final TextView descr = findViewById(R.id.descr);
        Button back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(CloudActivity.this, MainActivity.class);
                startActivity(back);
            }
        });

        String name = getIntent().getExtras().get("name").toString();
        descr.setText("Welcome to Cloud computing, " + name + "!");
    }
}
