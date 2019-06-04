package com.chetan.cshoppingcart;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class LoginActivity extends AppCompatActivity {
    EditText uname;
    EditText pass;
    Button bt;
    LinearLayout lt;
    private View view;
    String en_user;
    String en_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences sp = getSharedPreferences("MYUSERDATA", MODE_PRIVATE);
        String en_user = sp.getString("NAME", "");
        String en_pass = sp.getString("PASSWORD", "");
        if (!en_user.isEmpty() && !en_pass.isEmpty()) {
            Intent i = new Intent(LoginActivity.this, BrandlistActivity.class);
            startActivity(i);
        } else {
            setContentView(R.layout.activity_login);
        }
        bt = (Button) findViewById(R.id.button);
        lt = (LinearLayout) findViewById(R.id.linearlayout);
    }

    public void clickContinue(View V) {
        uname = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.password);
        en_user = uname.getText().toString();
        en_pass = pass.getText().toString();

        if (en_user.isEmpty() && en_pass.isEmpty()) {
            uname.setError("username cannot be empty");
            pass.setError("password cannot be empty");
        } else if (en_user.isEmpty()) {
            uname.setError("username cannot be empty");
        } else if (en_pass.isEmpty()) {
            pass.setError("password cannot be empty");
        }
        Query query = FirebaseDatabase.getInstance().getReference("USERS").orderByChild("name").equalTo(en_user);
        query.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    for (DataSnapshot c : dataSnapshot.getChildren()) {
                        if (c.child("pass").getValue().equals(en_pass)) {
                            Toast.makeText(LoginActivity.this, "Login Successfully", Toast.LENGTH_SHORT).show();
                            SharedPreferences sp=getSharedPreferences("MYUSERDATA",MODE_PRIVATE);
                            SharedPreferences.Editor editor=sp.edit();
                            editor.putString("NAME",en_user);
                            editor.putString("PASSWORD",en_pass);
                            editor.commit();

                            Intent i = new Intent(LoginActivity.this, BrandlistActivity.class);
                            i.putExtra("USERNAME", en_user);
                            startActivity(i);
                        } else {
                            Toast.makeText(LoginActivity.this, "Invalid password", Toast.LENGTH_SHORT).show();
                            pass.setText("");
                        }
                    }


                } else {
                    Toast.makeText(LoginActivity.this, "Invalid username", Toast.LENGTH_SHORT).show();
                    uname.setText("");
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });





       /* if (en_user.equals("Sravan") && en_pass.equals("576")) {


            


            Intent i = new Intent(LoginActivity.this, BrandlistActivity.class);
            startActivity(i);
        }
        else {
            if (!en_user.equals("Sravan")) {
                Toast.makeText(LoginActivity.this, "Username is Incorrect", Toast.LENGTH_SHORT).show();
            } else if (!en_pass.equals("576")) {
                Toast.makeText(this, "Incorrect password", Toast.LENGTH_SHORT).show();
            } else if (!en_user.equals("Sravan") && !en_pass.equals("576")) {
                Toast.makeText(this, "Username and Password invalid", Toast.LENGTH_SHORT).show();
            }

        }*/

    }

    public void gotoRegister(View view) {

        Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
