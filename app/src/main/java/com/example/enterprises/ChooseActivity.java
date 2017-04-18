package com.example.enterprises;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by ПОДАРУНКОВИЙ on 18.04.2017.
 */

public class ChooseActivity extends AppCompatActivity {
    private ListView lvCategories;
    private CategoryListAdapter adapter;
    private List<Category> categories;
     ImageView submenu;
    String fName;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        getSupportActionBar().hide();
        Intent intent = getIntent();

          fName = intent.getStringExtra("code");
        submenu = (ImageView)findViewById(R.id.imageView2);
        if(fName.length()<8){submenu.setImageResource(R.drawable.header2);
            Log.d("TESTREG","header 2 is monted");};

        lvCategories = (ListView)findViewById(R.id.list_view);
        categories = new ArrayList<>();
        categories.add(new Category(fName,1));
        categories.add(new Category(fName,2));
        categories.add(new Category(fName,3));
        categories.add(new Category(fName,4));
        categories.add(new Category(fName,5));
        categories.add(new Category(fName,6));
        categories.add(new Category(fName,7));
        categories.add(new Category(fName,8));
        categories.add(new Category(fName,9));
        categories.add(new Category(fName,57));
        adapter = new CategoryListAdapter(getApplicationContext(),categories);
        lvCategories.setAdapter(adapter);

        lvCategories.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ChooseActivity.this, CategoryActivity.class);
                intent.putExtra("code",fName);
                startActivity(intent);
            }
        });

    }



}
