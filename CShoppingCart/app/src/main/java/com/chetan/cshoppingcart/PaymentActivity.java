package com.chetan.cshoppingcart;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.google.firebase.database.FirebaseDatabase;

public class PaymentActivity extends AppCompatActivity {
    CheckBox c_box1;
    CheckBox c_box2;
    CheckBox c_box3;
    CheckBox c_box4;
    Button cb_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        c_box1 = (CheckBox)findViewById(R.id.c_box1);
        c_box2 = (CheckBox)findViewById(R.id.c_box2);
        c_box3 = (CheckBox)findViewById(R.id.c_box3);
        c_box4 = (CheckBox)findViewById(R.id.c_box4);

        c_box1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    Snackbar.make(compoundButton, "Payment via paytm.will be available soon", Snackbar.LENGTH_SHORT)
                            .setAction("Action", null).show();
                }
            }
        });

        c_box2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    Snackbar.make(compoundButton, "Payment via NetBanking.will be available soon", Snackbar.LENGTH_SHORT)
                            .setAction("Action", null).show();
                }
            }
        });

        c_box3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    Snackbar.make(compoundButton, "Payment via Credit/Debit card.will be available soon", Snackbar.LENGTH_SHORT)
                            .setAction("Action", null).show();
                }
            }
        });
        c_box4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    Snackbar.make(compoundButton, "cash on Delivery", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                         }
            }
        });
    }
    public void proceedClick(View view){
        //call firebase
        Intent i=getIntent();
        SharedPreferences sp = getSharedPreferences("MYUSERDATA", MODE_PRIVATE);
        String en_user = sp.getString("NAME", "");

        OrderBean bean=new OrderBean();
        bean.setHouseNo(""+i.getStringExtra("HouseNo"));
        bean.setStreet(""+i.getStringExtra("Street"));
        bean.setCity(""+i.getStringExtra("City"));
        bean.setPin(""+i.getStringExtra("Pin"));
        bean.setPrice(""+i.getStringExtra("price"));
        bean.setProduct_info(""+i.getStringExtra("product_info"));
        bean.setPayment_mode("COD");

        FirebaseDatabase.getInstance().getReference("USERS").child(en_user).child("ORDER SUMMARY").setValue(bean);
        Toast.makeText(PaymentActivity.this, "Successfully completed", Toast.LENGTH_SHORT).show();

        Intent intent=new Intent(PaymentActivity.this,ConformationActivity.class);
        startActivity(intent);

    }


}
