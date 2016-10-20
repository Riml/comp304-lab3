package com.comp304.group1.comp304_lab3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by Jacky on 19/10/2016.
 */

public class Exercise3 extends AppCompatActivity {
    private ImageView moonImg;
    private Animation orbit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise3);
        moonImg = (ImageView) findViewById(R.id.moon);

        orbit = AnimationUtils.loadAnimation(this, R.anim.orbit);
        orbit.setRepeatCount(Animation.INFINITE);
        Log.d("123", "-------------------------------------------");
        Log.d("MoonImg", "J " + moonImg.toString());

        moonImg.startAnimation(orbit);
    }


}
