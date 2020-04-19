package com.example.fest;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.github.chrisbanes.photoview.PhotoView;

import java.util.ArrayList;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.GalleryViewHolder> {
    private Context context;
    private ArrayList<Photo>arrayList;


    public GalleryAdapter(Context context, ArrayList arrayList) {
        this.arrayList = arrayList;
        this.context = context;
    }
    public class GalleryViewHolder extends RecyclerView.ViewHolder  {
        public ImageView image,exit;

        public LinearLayout photoLayout;

        public GalleryViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_hold);




        }

    }



    @NonNull
    @Override
    public GalleryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.single_image,parent,false);
       GalleryViewHolder gvh = new GalleryViewHolder(view);
       return gvh;
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryViewHolder holder, int position) {
            Photo current = arrayList.get(position);
            holder.image.setImageResource(current.getPicture());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }




}



