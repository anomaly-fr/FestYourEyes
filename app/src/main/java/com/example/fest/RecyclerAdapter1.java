package com.example.fest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter1 extends RecyclerView.Adapter<RecyclerAdapter1.RecylerViewHolder1> {
    private ArrayList<Fest> arrayList;

    public RecyclerAdapter1(ArrayList<Fest> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RecylerViewHolder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fest_layout,parent,false);
        RecylerViewHolder1 rvh1 = new RecylerViewHolder1(v);
        return rvh1;
    }

    @Override
    public void onBindViewHolder(@NonNull RecylerViewHolder1 holder, int position) {


        holder.imageView.setAnimation(AnimationUtils.loadAnimation(holder.imageView.getContext(),R.anim.fade_transition));
        holder.layout.setAnimation(AnimationUtils.loadAnimation(holder.imageView.getContext(),R.anim.fade_transition));
        Fest currentFest;
        currentFest = arrayList.get(position);
        holder.title.setText(currentFest.getTitle());
        holder.content1.setText(currentFest.getContent1());
        holder.content2.setText(currentFest.getContent2());
        holder.imageView.setImageResource(currentFest.getImage());
        holder.bywhom.setText(currentFest.getBy());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class RecylerViewHolder1 extends RecyclerView.ViewHolder {
        public TextView content1,content2,title,bywhom;
        public com.mikhaellopez.circularimageview.CircularImageView imageView;
        LinearLayout layout;

        public RecylerViewHolder1(@NonNull View itemView) {
            super(itemView);
            layout=itemView.findViewById(R.id.linear1);
            title = itemView.findViewById(R.id.card_titleTV);
            content1 = itemView.findViewById(R.id.card_content1TV);
            content2 = itemView.findViewById(R.id.card_content2TV);
            imageView = itemView.findViewById(R.id.Image_View);
            bywhom = itemView.findViewById(R.id.by);
        }



    }
}
