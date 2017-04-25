package com.example.enterprises;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {
    private ListView lvCategories, lvProducts;
    private CategoryListAdapter subadapter,compadapter;
    private List<Category> subcategories, companies;
    private ImageView submenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportActionBar().hide();



        submenu = (ImageView)findViewById(R.id.imageView3);


        lvCategories = (ListView)findViewById(R.id.list_sub);
        lvProducts = (ListView)findViewById(R.id.list_products);



        String[] values = new String[] { "пункт 1", "пункт 2", "пункт 3",
                "пункт 4", "пункт 5", "пункт 6", " пункт 7", "пункт 8",
                "пункт 9", "пункт 10" };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, values);
        lvProducts.setAdapter(adapter);
        lvCategories.setAdapter(adapter);

        lvCategories.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"категорію вибрано",Toast.LENGTH_SHORT).show();
            }
        });
        lvProducts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"регіон вибрано",Toast.LENGTH_SHORT).show();
            }
        });


    }
}
