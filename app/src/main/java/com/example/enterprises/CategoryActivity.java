package com.example.enterprises;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
        Intent intent = getIntent();

        final String fName = intent.getStringExtra("code");
        submenu = (ImageView)findViewById(R.id.imageView3);
        if(fName.length()<8){submenu.setImageResource(R.drawable.header2);};

        lvCategories = (ListView)findViewById(R.id.list_sub);
        lvProducts = (ListView)findViewById(R.id.list_products);

        subcategories = new ArrayList<>();
        subcategories.add(new Category("підкатегорія 1",1));
        subcategories.add(new Category("підкатегорія 2",2));
        subcategories.add(new Category("підкатегорія 3",3));
        subcategories.add(new Category("підкатегорія 4",4));
        subcategories.add(new Category("підкатегорія 5",5));
        subcategories.add(new Category("підкатегорія 6",1));
        subcategories.add(new Category("підкатегорія 7",2));
        subcategories.add(new Category("підкатегорія 8",3));
        subcategories.add(new Category("підкатегорія 9",4));
        subcategories.add(new Category("підкатегорія 10",5));


        companies = new ArrayList<>();
        companies.add(new Category("Компанія 1",1));
        companies.add(new Category("Компанія 2",2));
        companies.add(new Category("Компанія 3",3));
        companies.add(new Category("Компанія 4",4));
        companies.add(new Category("Компанія 5",5));
        companies.add(new Category("Компанія 6",6));
        companies.add(new Category("Компанія 7",1));
        companies.add(new Category("Компанія 8",2));
        companies.add(new Category("Компанія 9",3));
        companies.add(new Category("Компанія 10",4));
        companies.add(new Category("Компанія 11",5));
        companies.add(new Category("Компанія 12",6));

        subadapter = new CategoryListAdapter(getApplicationContext(),subcategories);
        compadapter = new CategoryListAdapter(getApplicationContext(),companies);
        lvCategories.setAdapter(subadapter);
        lvProducts.setAdapter(compadapter);

        lvCategories.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"subcategory",Toast.LENGTH_SHORT).show();
            }
        });
        lvProducts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Intent intent1 = new Intent(CategoryActivity.this, PageActivity.class);
                startActivity(intent1);
            }
        });


    }
}
