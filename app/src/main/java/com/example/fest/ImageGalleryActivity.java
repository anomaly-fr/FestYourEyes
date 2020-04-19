package com.example.fest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.storage.FirebaseStorage;

import java.util.ArrayList;

public class ImageGalleryActivity extends AppCompatActivity {
    private RecyclerView galleryRecyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager manager;
    private ImageView wayBetter;

    private FirebaseFirestore database = FirebaseFirestore.getInstance();
    public ArrayList<Photo>imageList;
    //private ArrayList<Upload>imageList;
    private DatabaseReference mdatabaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_gallery);
        imageList = new ArrayList<>();
        wayBetter = findViewById(R.id.way_better);
        wayBetter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(ImageGalleryActivity.this,BetterGallery.class);
               startActivity(intent);
            }
        });
        galleryRecyclerView = findViewById(R.id.gallery_recycler);
        galleryRecyclerView.setHasFixedSize(true);
//       mdatabaseReference = FirebaseDatabase.getInstance().getReference("Uploads");
//       mdatabaseReference.addValueEventListener(new ValueEventListener() {
//           @Override
//           public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//               for(DataSnapshot snapshot : dataSnapshot.getChildren()) {
//                   Upload upload = snapshot.getValue(Upload.class);
//                   imageList.add(upload);
//               }
//           }
//
//           @Override
//           public void onCancelled(@NonNull DatabaseError databaseError) {
//               Toast.makeText(getApplicationContext(),"Failed",Toast.LENGTH_SHORT).show();
//
//           }
//       });
//

//
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

        manager = new GridLayoutManager(this,2);
      adapter = new GalleryAdapter(getApplicationContext(),imageList);
      galleryRecyclerView.setLayoutManager(manager);
      galleryRecyclerView.addItemDecoration(new GridSpacing(2,1,false));
      galleryRecyclerView.setAdapter(adapter);

    }
}
