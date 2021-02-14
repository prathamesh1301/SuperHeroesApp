package com.example.superheroesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ImageView detailsImg=findViewById(R.id.detailsImg);
        TextView detailsName=findViewById(R.id.detailsName);
        TextView des=findViewById(R.id.des);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String name=bundle.getString("superheroName");
            String desc=bundle.getString("info");
            int img=bundle.getInt("superheroImage");

            detailsImg.setImageResource(img);
            detailsName.setText(name);
            des.setText(desc);


        }

    }
}