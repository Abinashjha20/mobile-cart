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


public class BrandAdapter extends BaseAdapter {

    Context context;
    ArrayList<BrandlistActivity.Brand> list1;
    public BrandAdapter(Context context, ArrayList<BrandlistActivity.Brand> list1) {
        this.context=context;
        this.list1=list1;

    }

    @Override
    public int getCount() {
        return list1.size();
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
        View v=ll.inflate(R.layout.mylist,viewGroup,false);
        TextView tv_name=(TextView)v.findViewById(R.id.tv_name);
        ImageView iv_imageUrl = (ImageView)v.findViewById(R.id.imageurl) ;

        tv_name.setText(list1.get(i).getName());
        Picasso.get().load(list1.get(i).getImageUrl()).into(iv_imageUrl);


        return v;
    }

    private class LoaderImageView {
    }
}
