package com.example.permissionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button b1, b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= (Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNextActivity();
            }
        });
       b2=(Button) findViewById(R.id.button1);
       b2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               openNextActivity1();
           }
       });
    }
    public void openNextActivity()
    {
        Intent intent = new Intent(this, Apply.class);
        startActivity(intent);
    }

    public void openNextActivity1()
    {
        Intent intent = new Intent(this, AdminHome.class);
        startActivity(intent);
    }
}