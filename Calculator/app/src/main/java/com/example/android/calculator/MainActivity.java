package com.example.android.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button one = findViewById(R.id.one);
        Button two = findViewById(R.id.two);
        Button three = findViewById(R.id.three);
        Button four = findViewById(R.id.four);
        Button five = findViewById(R.id.five);
        Button six = findViewById(R.id.six);
        Button seven = findViewById(R.id.seven);
        Button eight = findViewById(R.id.eight);
        Button nine = findViewById(R.id.nine);
        Button zero = findViewById(R.id.zero);
        Button doublezero = findViewById(R.id.doublezero);
        Button point = findViewById(R.id.point);

        Button mul = findViewById(R.id.mul);
        Button div = findViewById(R.id.div);
        Button sub = findViewById(R.id.sub);
        Button add = findViewById(R.id.add);

        Button sin = findViewById(R.id.sin);
        Button cos = findViewById(R.id.cos);
        Button tan = findViewById(R.id.tan);
        Button sqrt = findViewById(R.id.sqrt);

        Button del = findViewById(R.id.del);
        Button equals = findViewById(R.id.equals);

        final TextView disp = findViewById(R.id.disp);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText().toString() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText().toString() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText().toString() + "9");
            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText().toString() + ".");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText().toString() + "0");
            }
        });

        doublezero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText().toString() + "00");
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText().toString() + "*");
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText().toString() + "/");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText().toString() + "+");
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText().toString() + "-");
            }
        });

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText().toString() + " sin ");
            }
        });

        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText().toString() + " cos ");
            }
        });

        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText().toString() + " tan ");
            }
        });

        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText().toString() + " sqrt ");
            }
        });



        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText("");
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String expr = disp.getText().toString();
               if (expr.contains("*")){
                   String[] parts = expr.split("\\*");
                   String ans = Float.toString(Float.parseFloat(parts[0]) * Float.parseFloat(parts[1]));
                   disp.setText(ans);
               }else if (expr.contains("/")){
                   String[] parts = expr.split("\\/");
                   String ans = Float.toString(Float.parseFloat(parts[0]) / Float.parseFloat(parts[1]));
                   disp.setText(ans);
               }else if (expr.contains("+")){
                   String[] parts = expr.split("\\+");
                   String ans = Float.toString(Float.parseFloat(parts[0]) + Float.parseFloat(parts[1]));
                   disp.setText(ans);
               }else if (expr.contains("sin")){
                   String[] parts = expr.split("\\s+");
                   String ans = Double.toString(Math.sin(Float.parseFloat(parts[2])));
                   disp.setText(ans);
               }else if (expr.contains("cos")){
                   String[] parts = expr.split("\\s+");
                   String ans = Double.toString(Math.cos(Float.parseFloat(parts[2])));
                   disp.setText(ans);
               }else if (expr.contains("tan")){
                   String[] parts = expr.split("\\s+");
                   String ans = Double.toString(Math.tan(Float.parseFloat(parts[2])));
                   disp.setText(ans);
               }else if (expr.contains("sqrt")){
                   String[] parts = expr.split("\\s+");
                   String ans = Double.toString(Math.sqrt(Float.parseFloat(parts[2])));
                   disp.setText(ans);
               }else if (expr.contains("--")){
                   String[] parts = expr.split("\\--");
                   String ans = Float.toString(Float.parseFloat(parts[0]) + Float.parseFloat(parts[1]));
                   disp.setText(ans);
               }else if (expr.contains("-")){
                   String[] parts = expr.split("\\-");
                   String ans = Float.toString(Float.parseFloat(parts[0]) - Float.parseFloat(parts[1]));
                   disp.setText(ans);
               }else if(expr.startsWith("-") && !expr.contains("--")){
                   String[] parts = expr.split("\\-");
                   expr = parts[1];
                   System.out.print(expr);
                   parts = expr.split("\\-");
                   String ans = Float.toString(- Float.parseFloat(parts[0]) - Float.parseFloat(parts[1]));
                   disp.setText(ans);
               }
            }
        });
    }

}
