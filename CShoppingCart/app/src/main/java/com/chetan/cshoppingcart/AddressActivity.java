package com.chetan.cshoppingcart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddressActivity extends AppCompatActivity {
    EditText edittext1;
    EditText edittext2;
    EditText edittext3;
    EditText edittext4;
    Button mapbutton;
    private String product_info,price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        Intent i_rev=getIntent();
        price=i_rev.getStringExtra("PRICE");
        product_info=i_rev.getStringExtra("PRODUCT_INFO");
        edittext1 = (EditText) findViewById(R.id.edittext1);
        edittext2 = (EditText) findViewById(R.id.edittext2);
        edittext3 = (EditText) findViewById(R.id.edittext3);
        edittext4 = (EditText) findViewById(R.id.edittext4);

    }
    public void mapClick(View view){

        Intent intent=new Intent(AddressActivity.this,PaymentActivity.class);
        intent.putExtra("HouseNo",edittext1.getText().toString());
        intent.putExtra("Street",edittext2.getText().toString());
        intent.putExtra("City",edittext3.getText().toString());
        intent.putExtra("Pin",edittext4.getText().toString());
        intent.putExtra("price",price);
        intent.putExtra("product_info",product_info);
        startActivity(intent);


    }
}