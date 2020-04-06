package com.example.fest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;

public class CulturalGallery extends AppCompatActivity {
    private ListView listView;
    private ArrayList<String> culturalFestList, culturalFestImages;
    private ImageView imageView,leftButton,rightButton;
    StorageReference storageReference = FirebaseStorage.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_cultural_gallery);
        culturalFestList = new ArrayList<String>();
        culturalFestList.add("Jaathre");
        culturalFestList.add("Fiesta");
        culturalFestList.add("Civista");
        culturalFestList.add("Milagro");
        culturalFestList.add("Esportivo");
        listView = findViewById(R.id.cult_list);
        leftButton = findViewById(R.id.left);
        rightButton = findViewById(R.id.right);
        imageView = findViewById(R.id.gallery);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,culturalFestList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Toast.makeText(getApplicationContext(),culturalFestList.get(position).toString(),Toast.LENGTH_SHORT).show();
                        imageView.setVisibility(View.VISIBLE);
                        leftButton.setVisibility(View.VISIBLE);
                        rightButton.setVisibility(View.VISIBLE);
                        storageReference.child("Fiesta").child("IMG-20200330-WA0006.jpg");
                        Glide.with(getApplicationContext()).load(storageReference).into(imageView);


                    case 1:
                        Toast.makeText(getApplicationContext(),culturalFestList.get(position).toString(),Toast.LENGTH_SHORT).show();
                    case 2:
                        Toast.makeText(getApplicationContext(),culturalFestList.get(position).toString(),Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
