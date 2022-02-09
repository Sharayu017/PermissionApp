
package com.example.permissionapp;

import static android.content.ContentValues.TAG;

import android.nfc.Tag;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;


public class adminsndfragment extends Fragment {

//FirebaseFirestore fs=FirebaseFirestore.getInstance();
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    String Name, Email,Prn,Subject,Description,FromD,FromT,ToD,ToT,Status,Uid,Docid;

    public adminsndfragment() {
        // Required empty public constructor
    }

    public adminsndfragment(String name, String email, String prn, String subject, String description, String fromD, String fromT, String toD, String toT, String status, String uid, String docid) {
        this.Name = name;
        this.Email = email;
        this.Prn = prn;
        this.Subject = subject;
        this.Description = description;
        this.FromD = fromD;
        this.FromT = fromT;
        this.ToD = toD;
        this.ToT = toT;
        this.Status = status;
        this.Uid = uid;
        this.Docid = docid;
    }

    // TODO: Rename and change types and number of parameters
    public static adminsndfragment newInstance(String param1, String param2) {
        adminsndfragment fragment = new adminsndfragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_adminsndfragment, container, false);
        TextView nameholder=view.findViewById(R.id.nmholder);
        TextView emailholder =view.findViewById(R.id.emholder);
        TextView prnholder=view.findViewById(R.id.pholder);
        TextView subholder=view.findViewById(R.id.subholder);
        TextView descholder=view.findViewById(R.id.descholder);
        TextView fromD=view.findViewById(R.id.d1holder);
        TextView fromT=view.findViewById(R.id.t1holder);
        TextView toD=view.findViewById(R.id.d2holder);
        TextView toT=view.findViewById(R.id.t2holder);
        Button ab=view.findViewById(R.id.approvebutton);
        Button rb=view.findViewById(R.id.rejectbutton);
        TextView t=view.findViewById(R.id.status);

        nameholder.setText(Name);
        emailholder.setText(Email);
        prnholder.setText(Prn);
        subholder.setText(Subject);
        descholder.setText(Description);
        fromD.setText(FromD);
        fromT.setText(FromT);
        toD.setText(ToD);
        toT.setText(ToT);
        t.setText(Status);


        ab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ab.setVisibility(View.INVISIBLE);
                rb.setVisibility(View.INVISIBLE);
                String a="Approved";
                t.setText(a);

               // changeStatus("Approved");
                FirebaseFirestore.getInstance().collection("Permission").document(Uid)
                        .collection("appli").document(Docid).update("Status","Approved");



            }
        });

        rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ab.setVisibility(View.INVISIBLE);
                rb.setVisibility(View.INVISIBLE);
                String a="Rejected";
                t.setText(a);
                FirebaseFirestore.getInstance().collection("Permission").document(Uid)
                        .collection("appli").document(Docid).update("Status","Rejected");

                // changeStatus("Rejected");
            }
        });

        return view;
    }


   /* public void changeStatus(String str) {

       final DocumentReference d= FirebaseFirestore.getInstance().collection("Permission").document(Uid).collection("appli").document(Docid);
               d.update("Status",str);
                       d.addSnapshotListener(new EventListener<DocumentSnapshot>() {

           public void onEvent(@Nullable DocumentSnapshot snapshot,
                               @Nullable FirebaseFirestoreException e) {
               if (e != null) {
                   Log.w( "Listen failed.", e);
                   return;
               }

               if (snapshot != null && snapshot.exists()) {

                   Log.d(TAG, "Current data: " + snapshot.getData());
               } else {
                   Log.d(TAG, "Current data: null");
               }
           }
       });


    }*/

    public void onBackPressed(){
        AppCompatActivity activity=(AppCompatActivity)getContext();
        activity.getSupportFragmentManager().beginTransaction().replace(R.id.awrapper, new adrecfragment()).addToBackStack(null).commit();

    }


  //  public void
}
