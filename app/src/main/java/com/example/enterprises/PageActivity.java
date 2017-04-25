package com.example.enterprises;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PageActivity extends AppCompatActivity {

    TextView name;
    TextView description;
    ImageView mail,site,tel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);
        getSupportActionBar().hide();

        Intent intent = getIntent();

        name = (TextView)findViewById(R.id.TextViewName);
        name.setText(intent.getStringExtra("code"));
        mail = (ImageView)findViewById(R.id.imageView2);
        tel = (ImageView)findViewById(R.id.imageView4);
        site = (ImageView)findViewById(R.id.imageView5);
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"mail",Toast.LENGTH_SHORT).show();
            }
        });

        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"call",Toast.LENGTH_SHORT).show();
            }
        });

        site.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"site",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
