package com.example.fplanet;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Viewholder extends RecyclerView.ViewHolder {

    ImageView PlanetImage;
    TextView PlanetName;
    public Viewholder(@NonNull View itemView) {
        super(itemView);

        PlanetImage = itemView.findViewById(R.id.PlanetImage);
        PlanetName = itemView.findViewById(R.id.PlanetName);
    }
}
