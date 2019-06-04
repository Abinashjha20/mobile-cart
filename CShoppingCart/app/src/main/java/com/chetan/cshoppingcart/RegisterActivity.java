package com.chetan.cshoppingcart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class RegisterActivity extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rb_gender;
    CheckBox cb;
    Button bt;
    String en_user;
    String en_pass;
    String mobile;
    String mail;
    ProgressBar progressBar;
    DatabaseReference ref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        progressBar = (ProgressBar) findViewById(R.id.progressbar);
        rg = (RadioGroup) findViewById(R.id.radiogroup);
        cb = (CheckBox) findViewById(R.id.checkbox);
        bt = (Button) findViewById(R.id.registerbutton);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int selectedId = rg.getCheckedRadioButtonId();
                rb_gender = (RadioButton) findViewById(selectedId);
            }}
        );

        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean res) {
                if (res) {
                    bt.setEnabled(true);
                } else {
                    bt.setEnabled(false);
                }
            }
        });
    }

    public void registerClick(View v) {
        progressBar.setVisibility(View.VISIBLE);
        EditText et_name = (EditText) findViewById(R.id.et_name);
        EditText et_pass = (EditText) findViewById(R.id.et_pass);
        EditText et_mob = (EditText) findViewById(R.id.et_mob);
        EditText et_mail = (EditText) findViewById(R.id.et_mail);

        en_user = et_name.getText().toString();
        en_pass = et_pass.getText().toString();
        mobile = et_mob.getText().toString();
        mail = et_mail.getText().toString();

          if (cb.isChecked()) {
              final MyBean bean=new MyBean();
              bean.setName(en_user);
              bean.setPass(en_pass);
              bean.setMobile(mobile);
              bean.setEmail(mail);
              bean.setGender(rb_gender.getText().toString());

              //call firebase database
              FirebaseDatabase database=FirebaseDatabase.getInstance();
              ref=database.getReference("USERS").child(en_user);
              ref.addListenerForSingleValueEvent(new ValueEventListener() {
                  @Override
                  public void onDataChange(DataSnapshot dataSnapshot) {
                      if (dataSnapshot.exists()){
                          Toast.makeText(RegisterActivity.this, "Username is already exist.please enter another username", Toast.LENGTH_LONG).show();
                      }
                      else {
                          ref.setValue(bean);
                          Toast.makeText(RegisterActivity.this, "Register Successfully", Toast.LENGTH_SHORT).show();
                          Intent i=new Intent(RegisterActivity.this,LoginActivity.class);
                          startActivity(i);
                          finish();

                      }
                  }

                  @Override
                  public void onCancelled(DatabaseError databaseError) {

                  }
              });

              progressBar.setVisibility(View.GONE);



          } else {
            Toast.makeText(RegisterActivity.this, "Please accept to continue", Toast.LENGTH_SHORT).show();
        }








       // Intent i = new Intent(RegisterActivity.this, OTPActivity.class);
        //i.putExtra("MOBILE", mobile);
        //startActivity(i);


    }
    public class MyBean{
        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        String gender;
        String name;
        String pass;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPass() {
            return pass;
        }

        public void setPass(String pass) {
            this.pass = pass;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        String mobile;
        String email;


    }


}
