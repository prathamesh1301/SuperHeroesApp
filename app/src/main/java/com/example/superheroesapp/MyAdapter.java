package com.example.superheroesapp;

import android.content.Context;
import android.content.Intent;

import android.os.DeadObjectException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



import java.util.List;
import java.util.Objects;

import static java.util.Objects.requireNonNull;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<SuperheroAttributes> list;
    private Context context;

    public MyAdapter(List<SuperheroAttributes> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SuperheroAttributes s1=list.get(position);
        holder.superheroName.setText(s1.getName());
        holder.superheroImage.setImageResource(s1.getImage());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, DetailsActivity.class);
                intent.putExtra("superheroName",list.get(position).getName());
                intent.putExtra("superheroImage",list.get(position).getImage());
                intent.putExtra("info",list.get(position).getDes());
                context.startActivity(intent);
            }
        });

    }



    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView superheroName;
        public ImageView superheroImage;
        public TextView des;
        public LinearLayout linearLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            superheroName=(TextView) itemView.findViewById(R.id.superheroName);
            superheroImage=(ImageView) itemView.findViewById(R.id.superheroImage);
            des=(TextView) itemView.findViewById(R.id.des);
            linearLayout=(LinearLayout) itemView.findViewById(R.id.linearLayout);
        }
    }
}
