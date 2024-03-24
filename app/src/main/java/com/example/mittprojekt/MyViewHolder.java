package com.example.mittprojekt;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    ImageButton imageButton;
    TextView textViewRecycleView,textViewRecycleViewSmall;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageButton = itemView.findViewById(R.id.imageButtonRecycleView);
        textViewRecycleView= itemView.findViewById(R.id.textViewRecycleView);
        textViewRecycleViewSmall = itemView.findViewById(R.id.textViewRecycleViewSmall);
    }
}
