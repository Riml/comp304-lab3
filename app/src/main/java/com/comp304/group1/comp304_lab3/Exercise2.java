package com.comp304.group1.comp304_lab3;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Exercise2 extends AppCompatActivity {

    private ImageView imageView;
    private AnimationDrawable frameAnimation;
    private Button start, stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise2);
    }

    @Override
    protected void onStart(){
        loadUI();
        UIControls();
        // set background image of imageView to the AnimationDrawable
        frameAnimation = (AnimationDrawable) imageView.getBackground();
        // Stop after one iteration of animation
        frameAnimation.setOneShot(true);
    }

    private void loadUI(){
        start = (Button)findViewById(R.id.start);
        stop = (Button)findViewById(R.id.stop);
        imageView = (ImageView) findViewById(R.id.imageView);
        // Set background resource
        if (imageView != null) {
            imageView.setBackgroundResource(R.drawable.frame_animation_list);
        }
    }

    private void UIControls(){
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frameAnimation.start();
            }
        });
        stop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                frameAnimation.stop();
            }
        });
    }

}
