package com.example.hw2;

import java.util.ArrayList;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class classesAdapter extends RecyclerView.Adapter {
    ArrayList<Classes> cArray;
    Context context;

    public classesAdapter(ArrayList<Classes> mArray, Context context) {
        this.cArray = mArray;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //connecting to movie_list_item xml
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.class_list_item,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder) holder).day.setText(cArray.get(position).getC_Days());
        ((ViewHolder) holder).time.setText(cArray.get(position).getC_Time());
        ((ViewHolder) holder).code.setText(cArray.get(position).getC_code());
        ((ViewHolder) holder).img.setImageResource(cArray.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return cArray.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView img;
        public TextView code;
        public TextView time;
        public TextView day ;
        public View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            img = itemView.findViewById(R.id.img);
            code = itemView.findViewById(R.id.code);
            time = itemView.findViewById(R.id.textView5);
            day = itemView.findViewById(R.id.textView3);
        }
    }

}
