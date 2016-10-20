package com.comp304.group1.comp304_lab3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by Jacky on 19/10/2016.
 */

public class Exercise3 extends AppCompatActivity {
    private ImageView moonImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        moonImg = (ImageView) findViewById(R.id.moon);
    }

}
