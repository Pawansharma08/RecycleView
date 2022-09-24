package com.example.fplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Mercury extends AppCompatActivity {

    ImageView PImage;
    TextView PName,PText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercury);

        PImage = findViewById(R.id.PImage);
        PName = findViewById(R.id.PName);
        PText = findViewById(R.id.PText);
    }
}