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

public class RecylerAdapter2 extends RecyclerView.Adapter<RecylerAdapter2.RecylerViewHolder2> {
    private ArrayList<Fest> arrayList;
    public RecylerAdapter2 (ArrayList arrayList){
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RecylerViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.festcult_layout,parent,false);
        RecylerViewHolder2 rvh2 = new RecylerViewHolder2(v);
        return rvh2;
    }

    @Override
    public void onBindViewHolder(@NonNull RecylerViewHolder2 holder, int position) {
        Fest currentFest;
        holder.imageView.setAnimation(AnimationUtils.loadAnimation(holder.imageView.getContext(),R.anim.fade_transition));
        holder.layout.setAnimation(AnimationUtils.loadAnimation(holder.imageView.getContext(),R.anim.fade_transition));

        currentFest = arrayList.get(position);
        holder.title.setText(currentFest.getTitle());
        holder.content1.setText(currentFest.getContent1());
        holder.content2.setText(currentFest.getContent2());
        holder.imageView.setImageResource(currentFest.getImage());
        holder.by.setText(currentFest.getBy());

    }

    @Override
    public int getItemCount() {
        return  arrayList.size();

    }

    public class RecylerViewHolder2 extends RecyclerView.ViewHolder {
        public TextView content1,content2,title,by;
        public com.mikhaellopez.circularimageview.CircularImageView imageView;
        LinearLayout layout;

        public RecylerViewHolder2(@NonNull View itemView) {
            super(itemView);
            layout = itemView.findViewById(R.id.linear2);
            title = itemView.findViewById(R.id.cardcult_titleTV);
            content1 = itemView.findViewById(R.id.cultcard_content1TV);
            content2 = itemView.findViewById(R.id.cultcard_content2TV);
            imageView = itemView.findViewById(R.id.cultImage_View);
            by = itemView.findViewById(R.id.cultby);
        }

    }
}
