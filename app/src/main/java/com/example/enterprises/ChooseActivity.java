package com.example.enterprises;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

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

    String fName;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_choose);
       // getSupportActionBar().hide();
        Intent intent = getIntent();

          fName = intent.getStringExtra("code");



        lvCategories = (ListView)findViewById(R.id.list_view);
        categories = new ArrayList<>();
        categories.add(new Category("підприємство 1","тип 1", "05077383883", 1));
        categories.add(new Category("підприємство 2","тип 1", "05077383883", 2));
        categories.add(new Category("підприємство 3","тип 2", "05077383883", 3));
        categories.add(new Category("підприємство 4","тип 2", "05077383883", 4));
        categories.add(new Category("підприємство 5","тип 2", "05077383883", 5));
        categories.add(new Category("підприємство 6","тип 3", "05077383883", 6));
        categories.add(new Category("підприємство 7","тип 3", "05077383883", 7));
        categories.add(new Category("підприємство 8","тип 3", "05077383883", 8));
        categories.add(new Category("підприємство 9","тип 4", "05077383883", 9));
        categories.add(new Category("підприємство 10","тип 4", "05077383883", 10));
        adapter = new CategoryListAdapter(getApplicationContext(),categories);
        lvCategories.setAdapter(adapter);

        lvCategories.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ChooseActivity.this, PageActivity.class);
                intent.putExtra("code",categories.get(position).getName());
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu, menu);
        getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.bgmenu));
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.activity_search_menu_item:
                Intent intent = new Intent(ChooseActivity.this, CategoryActivity.class);
                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
