package com.imagine.colorpalettesample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.imagine.colorpalette.ColorPalette;

public class MainActivity extends AppCompatActivity {

    ColorPalette colorPalette1, colorPalette2, colorPalette3, colorPalette4, colorPalette5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // define the Views
        colorPalette1 = findViewById(R.id.color_palette1);
        colorPalette2 = findViewById(R.id.color_palette2);
        colorPalette3 = findViewById(R.id.color_palette3);
        colorPalette4 = findViewById(R.id.color_palette4);
        colorPalette5 = findViewById(R.id.color_palette5);
        // set the listener to the ColorPalette views
        colorPalette1.setListener(onColorSelected);
        colorPalette2.setListener(onColorSelected);
        colorPalette3.setListener(onColorSelected);
        colorPalette4.setListener(onColorSelected);
        colorPalette5.setListener(onColorSelected);
    }

    /**
     * The colorSelection Listener (returns the Hex value for that color)
     */
    ColorPalette.ColorSelectListener onColorSelected = new ColorPalette.ColorSelectListener() {
        @Override
        public void onColorSelected(String color) {
            // TODO use color (The Hex Value of the Selected color)
            Toast.makeText(MainActivity.this, "Selected Color HeX:" + color, Toast.LENGTH_SHORT).show();
        }
    };

    private void addColor() {
        colorPalette1.addColor("#631452", true);
    }

    private void removeColorByValue(){
        colorPalette1.removeColorByHexValue("#FFFFFF");
    }

    private void removeColorByIndex(){
        colorPalette1.removeColorByIndex(1);
    }

}
