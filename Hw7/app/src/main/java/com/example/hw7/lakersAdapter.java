package com.example.hw7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class lakersAdapter extends RecyclerView.Adapter {

    ArrayList<lakers> Larry;

    public lakersAdapter(ArrayList<lakers> larry) {
     this.Larry = larry;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.alltimestarlakers,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).img.setImageResource(Larry.get(position).getImage());
        ((ViewHolder)holder).name.setText(Larry.get(position).getName());
        ((ViewHolder)holder).rating.setText(Larry.get(position).getRating()+" ");
    }

    @Override
    public int getItemCount() {
        return Larry.size();

    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView img;
        public TextView name;
        public TextView rating;
        public View view;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
         view = itemView;
         name = itemView.findViewById(R.id.name);
         rating = itemView.findViewById(R.id.number);
         img = itemView.findViewById(R.id.imageView);
        }
    }
}

