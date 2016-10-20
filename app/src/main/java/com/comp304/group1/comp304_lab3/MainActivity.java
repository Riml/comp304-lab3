package com.comp304.group1.comp304_lab3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ex1Click(View v){
        Intent i = new Intent(MainActivity.this, Exercise1.class);
        startActivity(i);
    }

    public void ex2Click(View v){
        Intent i = new Intent(MainActivity.this, Exercise2.class);
        startActivity(i);
    }

    public void ex3Click(View v){
        Intent i = new Intent(MainActivity.this, Exercise3.class);
        startActivity(i);
    }
}
