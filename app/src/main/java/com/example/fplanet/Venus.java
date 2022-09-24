package com.example.fplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Venus extends AppCompatActivity {

    ImageView PImage2;
    TextView PName2,PText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venus);

        PImage2 = findViewById(R.id.PImage2);
        PName2 = findViewById(R.id.PName2);
        PText2 = findViewById(R.id.PText2);
    }
}