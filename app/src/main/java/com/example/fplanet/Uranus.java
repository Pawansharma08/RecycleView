package com.example.fplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Uranus extends AppCompatActivity {

    ImageView PImage7;
    TextView PName7,PText7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uranus);

        PImage7 = findViewById(R.id.PImage7);
        PName7 = findViewById(R.id.PName7);
        PText7 = findViewById(R.id.PText7);
    }
}