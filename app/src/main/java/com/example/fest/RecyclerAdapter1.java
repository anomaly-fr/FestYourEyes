package com.example.fest;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter1 extends RecyclerView.Adapter<RecyclerAdapter1.RecylerViewHolder1> {
    private ArrayList<Fest> arrayList;
    private int Position;

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
        Position = position;


      //  holder.imageView.setAnimation(AnimationUtils.loadAnimation(holder.imageView.getContext(),R.anim.fade_transition));
        holder.cardFront.setAnimation(AnimationUtils.loadAnimation(holder.imageView.getContext(),R.anim.fade_transition));
        Fest currentFest;
        currentFest = arrayList.get(position);
        holder.title.setText(currentFest.getTitle());
        holder.content1.setText(currentFest.getContent1());
        holder.content2.setText(currentFest.getContent2());

        holder.bywhom.setText(currentFest.getBy());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class RecylerViewHolder1 extends RecyclerView.ViewHolder {
        public TextView content1,content2,title,bywhom,backby,backtitle;
        public com.mikhaellopez.circularimageview.CircularImageView imageView;

        CardView cardFront,cardBack;
        private boolean front;

        public RecylerViewHolder1(@NonNull final View itemView) {
            super(itemView);

            backby = itemView.findViewById(R.id.backby);
            backtitle =itemView.findViewById(R.id.backcard_titleTV);
            title = itemView.findViewById(R.id.card_titleTV);
            content1 = itemView.findViewById(R.id.card_content1TV);
            content2 = itemView.findViewById(R.id.card_content2TV);
            imageView = itemView.findViewById(R.id.Image_View);
            bywhom = itemView.findViewById(R.id.by);
            cardFront=itemView.findViewById(R.id.card_front);
            cardBack=itemView.findViewById(R.id.card_back);
           front = true; final int pos = 0;
            cardFront.setOnClickListener(new View.OnClickListener() {
                @Override

                public void onClick(View v) {

                   if (!arrayList.get(Position).isTapped()) {
                        cardBack.setAlpha(0f);
                        backby.setText(bywhom.getText().toString());
                        backtitle.setText(title.getText().toString());
                        cardBack.setVisibility(View.VISIBLE);

                        cardBack.animate().alpha(1f).setDuration(350).setListener(null);
                        arrayList.get(Position).setTapped(true);



                    } else {

                        cardBack.setVisibility(View.GONE);
                        cardBack.animate().alpha(0f).setDuration(400).setListener(null);
                       arrayList.get(Position).setTapped(false);

                        //back = true;
                    }
                }
            });





                }

        }



    }

