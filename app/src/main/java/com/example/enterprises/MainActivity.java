package com.example.enterprises;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
ImageView toChooseButton, toRegionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
     toChooseButton = (ImageView) findViewById(R.id.button2);
        toRegionButton = (ImageView) findViewById(R.id.button);
        toChooseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChooseActivity.class);
                intent.putExtra("code","деяка галузь ");
                startActivity(intent);
            }
        });
        toRegionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChooseActivity.class);
                intent.putExtra("code","регіон");
                startActivity(intent);
            }
        });


    }
}
