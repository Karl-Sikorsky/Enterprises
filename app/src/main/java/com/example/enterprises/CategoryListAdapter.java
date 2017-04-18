package com.example.enterprises;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by ПОДАРУНКОВИЙ on 17.04.2017.
 */

public class CategoryListAdapter extends BaseAdapter {

    private Context context;
    private List<Category> categories;

    public CategoryListAdapter(Context context, List<Category> categories) {
        this.context = context;
        this.categories = categories;
    }

    @Override
    public int getCount() {
        return categories.size();
    }

    @Override
    public Object getItem(int position) {
        return categories.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(context, R.layout.item_product_list,null);
        TextView tvDesc = (TextView) v.findViewById(R.id.textItem);
        tvDesc.setText(categories.get(position).getDesription());
        v.setTag(categories.get(position).getId());
       return v;
    }
}
