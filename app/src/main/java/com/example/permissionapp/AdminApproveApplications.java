package com.example.permissionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class AdminApproveApplications extends AppCompatActivity {
FirebaseFirestore fs= FirebaseFirestore.getInstance();

TextView name,prn,subject,desc,sdt,edt,tm1,tm2;
Button b1;

String id_doc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_approve_application);

        name =findViewById(R.id.tname);
        prn= findViewById(R.id.tprn);
        subject = findViewById(R.id.tsubject);
        desc = findViewById(R.id.tdescrip);
        sdt = findViewById(R.id.tfromd);
        edt = findViewById(R.id.ttd);
        tm1 = findViewById(R.id.tfromt);
        tm2 = findViewById(R.id.ttt);
        b1= findViewById(R.id.vb);
        fs = FirebaseFirestore.getInstance();
        DocumentReference df= fs.collection("users").document();
        //b1.setOnClickListener();
    }





    DocumentReference docRef = fs.collection("users").document("XjDwgtyBxU8czjZ0gr8q");


}