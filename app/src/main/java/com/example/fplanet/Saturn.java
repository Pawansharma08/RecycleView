package com.example.fplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Saturn extends AppCompatActivity {

    ImageView PImage6;
    TextView PName6,PText6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saturn);

        PImage6 = findViewById(R.id.PImage6);
        PName6 = findViewById(R.id.PName6);
        PText6 = findViewById(R.id.PText6);
    }
}