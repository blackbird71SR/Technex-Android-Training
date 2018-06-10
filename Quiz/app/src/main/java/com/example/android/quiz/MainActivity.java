package com.example.android.quiz;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.Time;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button login = findViewById(R.id.login);
        login.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        EditText name = findViewById(R.id.userName);
        EditText password = findViewById(R.id.password);
        String userName = name.getText().toString();
        String pass = password.getText().toString();
        switch (id){
            case R.id.login:
                if(userName == "omkar" && pass == "omkar"){
                    Intent loginIntent = new Intent(MainActivity.this, OptionActivity.class);
                    loginIntent.putExtra("name", userName);
                    startActivity(loginIntent);
                }
                break;
        }
    }
}
