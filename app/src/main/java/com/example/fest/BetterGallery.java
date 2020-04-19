package com.example.fest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.github.chrisbanes.photoview.PhotoView;

import java.util.ArrayList;

public class BetterGallery extends AppCompatActivity {
    private ImageView nextButton,prevButton,Image;
    PhotoView photo;
    ArrayList<Photo> imageList1;
    ArrayList<Photo> imageList;
    Photo temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_better_gallery);
        nextButton = findViewById(R.id.next);
        prevButton = findViewById(R.id.prev);
        photo = (PhotoView)findViewById(R.id.photo_view);
        imageList = new ArrayList<>();


        imageList.add(new Photo(R.drawable.picc,0));
        imageList.add(new Photo(R.drawable.picd,1));
        imageList.add(new Photo(R.drawable.pici,2));
        imageList.add(new Photo(R.drawable.picg,3));

        imageList.add(new Photo(R.drawable.pich,4));
        imageList.add(new Photo(R.drawable.picf,5));
        imageList.add(new Photo(R.drawable.picb,6));
        imageList.add(new Photo(R.drawable.pich,7));
        imageList.add(new Photo(R.drawable.repcom,8));
        imageList.add(new Photo(R.drawable.pica,9));



      //  imageList1 = (ArrayList<Photo>)getIntent().getSerializableExtra("list");

         temp = imageList.get(0);

        photo.setImageResource(imageList.get(0).getPicture());

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = temp.getNumber();
                if(position!=imageList.size()) {
                    position++;
                    photo.setImageResource(imageList.get(position).getPicture());
                    temp.setNumber(position);
                }
                else{
                    photo.setImageResource(imageList.get(position).getPicture());
                }



            }
        });
        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = temp.getNumber();
                if(position!=0) {
                    --position;
                    photo.setImageResource(imageList.get(--position).getPicture());
                    temp.setNumber(position);
                }else{
                    photo.setImageResource(imageList.get(position).getPicture());
                }

            }
        });




    }
}
