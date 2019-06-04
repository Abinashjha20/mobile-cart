package com.chetan.cshoppingcart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.support.design.widget.Snackbar;

public class DescriptionActivity extends AppCompatActivity {

    TextView textview2;
    TextView pricetext;
    CheckBox checkbox1;
    Button button1;
    String Price;
    String Info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        textview2 = (TextView) findViewById(R.id.textview2);
        pricetext=(TextView)findViewById(R.id.pricetext);
        checkbox1=(CheckBox)findViewById(R.id.checkbox1);
        button1=(Button)findViewById(R.id.button1);
        Intent intent = getIntent();
         Info = intent.getStringExtra("INFO");
         Price=intent.getStringExtra("PRICE");
        pricetext.setText("Effective price:"+ Price);
        textview2.setText(Info);

        checkbox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {

                    Snackbar.make(buttonView, "Discount of 10% is Applied", Snackbar.LENGTH_SHORT).setAction("Action", null).show();

                    int price = Integer.parseInt(Price);
                    price = (price *90)/100;
                    String EffectivePrice = Integer.toString(price);
                    pricetext.setText("Effective price:"+ EffectivePrice);

                }
                else{
                    pricetext.setText("Effective price:"+ Price);
                }

            }

        });
    }
    public void clickAddress(View view){

       Intent intent=new Intent(DescriptionActivity.this,AddressActivity.class);
       intent.putExtra("PRICE",pricetext.getText().toString());
       intent.putExtra("PRODUCT_INFO",Info);
       startActivity(intent);

    }
}