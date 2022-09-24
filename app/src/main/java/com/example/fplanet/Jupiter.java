package com.example.fplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Jupiter extends AppCompatActivity {

    ImageView PImage5;
    TextView PName5,PText5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jupiter);

        PImage5 = findViewById(R.id.PImage5);
        PName5 = findViewById(R.id.PName5);
        PText5 = findViewById(R.id.PText5);
    }
}