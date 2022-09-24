package com.example.fplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Neptune extends AppCompatActivity {

    ImageView PImage8;
    TextView PName8,PText8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neptune);

        PImage8 = findViewById(R.id.PImage8);
        PName8 = findViewById(R.id.PName8);
        PText8 = findViewById(R.id.PText8);
    }
}