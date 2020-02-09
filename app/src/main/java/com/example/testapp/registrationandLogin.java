package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registrationandLogin extends AppCompatActivity {

    Button btnlogin;
    Button btnregistration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrationand_login);

        btnlogin=(Button) findViewById(R.id.logbutton);
        btnregistration=(Button) findViewById(R.id.Registration);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(registrationandLogin.this,main2.class);
                startActivity(in);
            }
        });

        btnregistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(registrationandLogin.this,registration.class);
                startActivity(in);
            }
        });

    }
}
