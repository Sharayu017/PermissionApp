package com.example.permissionapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;

public class myadapter extends FirestoreRecyclerAdapter<model, myadapter.myviewholder>
{


    public myadapter(@NonNull FirestoreRecyclerOptions<model> options) {
        super(options);
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent, false);
        return new myviewholder(view);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull model model) {
        holder.nametext.setText(model.getName());
        holder.emailtext.setText(model.getEmail());
        holder.prntext.setText(model.getPrn());
        holder.subtext.setText(model.getSubject());
        holder.nametext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppCompatActivity activity=(AppCompatActivity)view.getContext();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.wrapper, new descfragment(model.getName(),model.getEmail(),model.getPrn(),model.getSubject(),model.getDescription(),model.getFromD(),model.getFromT(),model.getToD(),model.getToT())).addToBackStack(null).commit();
            }
        });
    }

    public class myviewholder extends RecyclerView.ViewHolder
    {
        TextView nametext,emailtext,prntext,subtext;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            nametext=itemView.findViewById(R.id.nametext);
            emailtext=itemView.findViewById(R.id.emailtext);
            prntext =itemView.findViewById(R.id.prntext);
            subtext =itemView.findViewById(R.id.subtext);
        }
    }
}
