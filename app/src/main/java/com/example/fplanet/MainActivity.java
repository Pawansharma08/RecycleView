package com.example.fplanet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView List;
    Myadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List = findViewById(R.id.list);
        List.setLayoutManager(new LinearLayoutManager(this));

         adapter = new Myadapter(PlanetList(),getApplicationContext());
        List.setAdapter(adapter);


    }

    public ArrayList<Model> PlanetList()
    {

        ArrayList<Model> holder = new ArrayList<>();

        Model obj1 = new Model();
        obj1.setPlanetImage(R.drawable.img);
        obj1.setPlanetName("Mercury");
        holder.add(obj1);

        Model obj2 = new Model();
        obj2.setPlanetImage(R.drawable.venus);
        obj2.setPlanetName("Venus");
        holder.add(obj2);

        Model obj3 = new Model();
        obj3.setPlanetImage(R.drawable.earth);
        obj3.setPlanetName("Earth");
        holder.add(obj3);

        Model obj4 = new Model();
        obj4.setPlanetImage(R.drawable.mars);
        obj4.setPlanetName("Mars");
        holder.add(obj4);

        Model obj5 = new Model();
        obj5.setPlanetImage(R.drawable.jupiter);
        obj5.setPlanetName("Jupiter");
        holder.add(obj5);

        Model obj6 = new Model();
        obj6.setPlanetImage(R.drawable.saturn);
        obj6.setPlanetName("Saturn");
        holder.add(obj6);

        Model obj7 = new Model();
        obj7.setPlanetImage(R.drawable.uranus);
        obj7.setPlanetName("Uranus");
        holder.add(obj7);

        Model obj8 = new Model();
        obj8.setPlanetImage(R.drawable.neptune);
        obj8.setPlanetName("Neptune");
        holder.add(obj8);


        return holder;
    }
}