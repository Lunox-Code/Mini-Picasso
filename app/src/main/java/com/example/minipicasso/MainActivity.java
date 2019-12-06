package com.example.minipicasso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Finding image by id
        ImageView imageView = findViewById(R.id.imageView);
        ImageView imageView2 = findViewById(R.id.imageView2);

        //Load url into image view using Picasso
        Picasso.get().load("https://i.imgur.com/n1bReXI.png").into(imageView);
        Picasso.get().load("https://em.wattpad.com/9e0c0e8a17c586be4c2db717d5cc80f17b163041/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f6f6b516379507331656a593279773d3d2d34322e313561623236643531633066643636313933313430333536373836342e6a7067?s=fit&w=720&h=720").into(imageView2);
    }
}
