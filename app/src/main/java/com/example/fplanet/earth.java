package com.example.fplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class earth extends AppCompatActivity {

    ImageView PImage3;
    TextView PName3,PText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earth);

        PImage3 = findViewById(R.id.PImage3);
        PName3 = findViewById(R.id.PName3);
        PText3 = findViewById(R.id.PText3);
    }
}