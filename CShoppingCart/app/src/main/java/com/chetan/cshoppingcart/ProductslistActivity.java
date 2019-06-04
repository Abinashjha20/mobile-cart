package com.chetan.cshoppingcart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.chetan.cshoppingcart.adapter.PhoneAdapter;

import java.util.ArrayList;


public class ProductslistActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<BrandlistActivity.Phone> phonesList = new ArrayList<BrandlistActivity.Phone>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productslist);
        Intent intent = getIntent();
        phonesList = (ArrayList<BrandlistActivity.Phone>) getIntent().getSerializableExtra("PHONES");

        lv = (ListView) findViewById(R.id.listview2);

        PhoneAdapter adapter = new PhoneAdapter(ProductslistActivity.this, phonesList);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object obj = lv.getItemAtPosition(position);
                int i = (int) obj;
                BrandlistActivity.Phone phone = (BrandlistActivity.Phone) phonesList.get(i);
                Intent intent1=new Intent(ProductslistActivity.this,DescriptionActivity.class);
                intent1.putExtra("INFO",phone.Info);
                intent1.putExtra("PRICE",phone.Price);
                startActivity(intent1);

            }
        });

    }

}

