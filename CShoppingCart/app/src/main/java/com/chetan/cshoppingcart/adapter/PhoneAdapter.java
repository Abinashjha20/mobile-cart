package com.chetan.cshoppingcart.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.chetan.cshoppingcart.BrandlistActivity;
import com.chetan.cshoppingcart.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class PhoneAdapter extends BaseAdapter {

    Context context;
    ArrayList<BrandlistActivity.Phone> list;
    public PhoneAdapter(Context context, ArrayList<BrandlistActivity.Phone> list) {
        this.context=context;
        this.list=list;

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater ll=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v=ll.inflate(R.layout.mylist2,viewGroup,false);
        TextView productname=(TextView)v.findViewById(R.id.productname);
        TextView productprice=(TextView)v.findViewById(R.id.productprice);
        TextView productyear=(TextView)v.findViewById(R.id.productyear);
        TextView productrating=(TextView)v.findViewById(R.id.productrating);
        ImageView imagemodelurl = (ImageView)v.findViewById(R.id.imagemodelurl) ;

        productname.setText(list.get(i).getModelName());
        productprice.setText(list.get(i).getPrice());
        productyear.setText(list.get(i).getYear());
        productrating.setText(list.get(i).getRating());
        Picasso.get().load(list.get(i).getImageUrl()).into(imagemodelurl);


        return v;
    }

    private class LoaderImageView {
    }
}