package com.example.mittprojekt;
import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>  {

    Context context;
    List<ClipData.Item>items;

    public MyAdapter(Context context, List<ClipData.Item> items){
        this.context = context;
                this.items=items;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.activity_recycleview,parent,false));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
holder.textViewRecycleView.setText(items.get(position).getText());
        holder.textViewRecycleViewSmall.setText(items.get(position).getText());

    }
}
