package com.comp304.group1.comp304_lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ImageView;
import android.widget.Spinner;


import java.util.Arrays;


public class Exercise1 extends AppCompatActivity implements OnItemSelectedListener {


    //Prepare Variables
    ImageView mainRectView;
    ArrayAdapter colorAdapter;
    Spinner colorPicker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1);
        drawRect();
        prepareSpinner();
    }

    //prepare RectView
    private void drawRect(){
        mainRectView = (ImageView) findViewById(R.id.rectView);
        mainRectView.setImageResource(R.drawable.rectangle);
    }

    // Prepare and Populate spinner
    private void prepareSpinner(){

       colorPicker =(Spinner)findViewById(R.id.spinner);

       // Create ArrayAdapter for the spinner
        colorAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,
                Arrays.asList(getResources().getStringArray(R.array.rect_color_picker)));

        // Attach the array adapter to the spinner
        colorPicker.setAdapter(colorAdapter);
        colorPicker.setOnItemSelectedListener(this);

    }

    //Add controls to move view
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        switch (keyCode){
            //no DPAD on a real phone, so just to showcase lets use Volume btns
            case KeyEvent.KEYCODE_VOLUME_UP:
            case KeyEvent.KEYCODE_DPAD_DOWN:
                mainRectView.setTranslationY(mainRectView.getTranslationY()+5);
                return true;
            case KeyEvent.KEYCODE_DPAD_UP:
            case KeyEvent.KEYCODE_VOLUME_DOWN:
                mainRectView.setTranslationY(mainRectView.getTranslationY()-5);
                return true;
            case KeyEvent.KEYCODE_DPAD_LEFT:
                mainRectView.setTranslationX(mainRectView.getTranslationX()-5);
                return true;
            case KeyEvent.KEYCODE_DPAD_RIGHT:
                mainRectView.setTranslationX(mainRectView.getTranslationX()+5);
                return true;
            case  KeyEvent.KEYCODE_BACK:
                onBackPressed();
                return true;

        }
        return false;
    }
    //Switch rect color based on picked item
    //color format 0xAARRGGBB
    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        switch (parent.getSelectedItem().toString()){
            case "Black":
                mainRectView.setColorFilter( 0xff000000);
                break;
            case "Blue":
                mainRectView.setColorFilter( 0xff0000ff);
                break;
            case "Red":
                mainRectView.setColorFilter( 0xffff0000);
                break;

        }


    }

    //required method for  ----implements OnItemSelectedListener---
    public void onNothingSelected(AdapterView<?> parent) {
        mainRectView.setColorFilter( 0xffbaffed);
    }


}
