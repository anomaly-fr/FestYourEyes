package com.example.fest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecylerAdapter2 extends RecyclerView.Adapter<RecylerAdapter2.RecylerViewHolder2> {
    private ArrayList<Fest> arrayList;
    public RecylerAdapter2 (ArrayList arrayList){
        this.arrayList = arrayList;
    }
    private int Position;

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
        Position = position;
     //   holder.imageView.setAnimation(AnimationUtils.loadAnimation(holder.imageView.getContext(),R.anim.fade_transition));
        holder.cardFront.setAnimation(AnimationUtils.loadAnimation(holder.imageView.getContext(),R.anim.fade_transition));

        currentFest = arrayList.get(position);
        holder.title.setText(currentFest.getTitle());
        holder.content1.setText(currentFest.getContent1());
        holder.content2.setText(currentFest.getContent2());

        holder.bywhom.setText(currentFest.getBy());

    }

    @Override
    public int getItemCount() {
        return  arrayList.size();

    }

    public class RecylerViewHolder2 extends RecyclerView.ViewHolder {
        public TextView content1,content2,title,bywhom,backby,backtitle;
        CardView cardFront,cardBack;
        public com.mikhaellopez.circularimageview.CircularImageView imageView;
        private boolean front;

        public RecylerViewHolder2(@NonNull View itemView) {
            super(itemView);
            backby = itemView.findViewById(R.id.backbyy);
            backtitle =itemView.findViewById(R.id.backcardd_titleTV);
            title = itemView.findViewById(R.id.cardcult_titleTV);
            content1 = itemView.findViewById(R.id.cultcard_content1TV);
            content2 = itemView.findViewById(R.id.cultcard_content2TV);
            imageView = itemView.findViewById(R.id.cultImage_View);
            bywhom = itemView.findViewById(R.id.cultby);
            cardFront=itemView.findViewById(R.id.card_frontt);
            cardBack=itemView.findViewById(R.id.card_backk);
            front = true;
            cardFront.setOnClickListener(new View.OnClickListener() {
                @Override

                public void onClick(View v) {
                    // cardFront.setVisibility(View.INVISIBLE);
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