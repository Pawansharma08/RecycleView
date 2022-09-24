package com.example.fplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Mars extends AppCompatActivity {

    ImageView PImage4;
    TextView PName4,PText4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mars);

        PImage4 = findViewById(R.id.PImage4);
        PName4 = findViewById(R.id.PName4);
        PText4 = findViewById(R.id.PTExt4);
    }
}