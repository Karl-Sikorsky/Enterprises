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
    private List<Category> companies;

    public CategoryListAdapter(Context context, List<Category> companies) {
        this.context = context;
        this.companies = companies;
    }

    @Override
    public int getCount() {
        return companies.size();
    }

    @Override
    public Object getItem(int position) {
        return companies.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(context, R.layout.item_product_list,null);
        TextView tvName = (TextView) v.findViewById(R.id.textItem);
        tvName.setText(companies.get(position).getName());
        TextView tvType = (TextView) v.findViewById(R.id.textItemType);
        tvType.setText(companies.get(position).getType());
        TextView tvTel = (TextView) v.findViewById(R.id.textItemTel);
        tvTel.setText(companies.get(position).getTel());
        v.setTag(companies.get(position).getId());
       return v;
    }
}
