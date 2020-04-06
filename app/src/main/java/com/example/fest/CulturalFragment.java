package com.example.fest;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class CulturalFragment extends Fragment {
    FirebaseFirestore database = FirebaseFirestore.getInstance();
    FloatingActionButton galleryButton;



    public CulturalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final ArrayList <Fest> culturalFests = new ArrayList<>();
        RecyclerView recyclerView;
     //   RecyclerView.Adapter adapter;
        RecyclerView.Adapter adapter;
        RecyclerView.LayoutManager manager;

         View view = inflater.inflate(R.layout.recycler_view1, container, false);
        inflater.inflate(R.layout.fragment_cultural, container, false);
        recyclerView = view.findViewById(R.id.recyler_viewOne);




        galleryButton = view.findViewById(R.id.gallery_fab);
        galleryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),CulturalGallery.class);
               startActivity(intent);
              //  Toast.makeText(getContext(),"yes",Toast.LENGTH_SHORT).show();
            }
        });




//        database.collection("Cultural").get().addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
//            @Override
//            public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
//                if(queryDocumentSnapshots.isEmpty()){
//                  Toast.makeText(getContext(),"Empty list",Toast.LENGTH_SHORT).show();
//                    return;
//                }else{
//                    List<Fest> cultFests = queryDocumentSnapshots.toObjects(Fest.class);
//                    culturalFests.addAll(cultFests);
//
//                }
//
//            }
//        }).addOnFailureListener(new OnFailureListener() {
//            @Override
//            public void onFailure(@NonNull Exception e) {
//                Toast.makeText(getContext(),"Error loading list",Toast.LENGTH_SHORT).show();
//            }
//        });
        culturalFests.add(new Fest("2nd years","Jaathre","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE."));
        culturalFests.add(new Fest("3rd years","Fiesta","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE."));
        culturalFests.add(new Fest("Civil Department","Civista","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE."));
        culturalFests.add(new Fest("UVCE","Esportivo","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE."));
        culturalFests.add(new Fest("4th years","Milagro","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE."));
        culturalFests.add(new Fest("2nd years","Jaathre","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE."));
        culturalFests.add(new Fest("3rd years","Fiesta","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE."));
        culturalFests.add(new Fest("Civil Department","Civista","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE."));
        culturalFests.add(new Fest("UVCE","Esportivo","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE."));
        culturalFests.add(new Fest("4th years","Milagro","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE."));


        culturalFests.add(new Fest("2nd years","Jaathre","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE."));
        culturalFests.add(new Fest("3rd years","Fiesta","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE."));
        culturalFests.add(new Fest("Civil Department","Civista","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE."));
        culturalFests.add(new Fest("UVCE","Esportivo","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE."));
        culturalFests.add(new Fest("4th years","Milagro","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE."));

        adapter = new RecyclerAdapter1(culturalFests);
        recyclerView.setAdapter(adapter);
    //    adapter.notifyDataSetChanged();


        manager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(manager);

        adapter = new RecyclerAdapter1(culturalFests);
        recyclerView.setAdapter(adapter);








        return view;


    }


//    @Override
//    public void onStart() {
//        super.onStart();
//        database.collection("Cultural").get().addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
//            @Override
//            public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
//                if(!queryDocumentSnapshots.isEmpty()) {
//                    for(QueryDocumentSnapshot fests : queryDocumentSnapshots) {
//                        String festName = fests.getString("Name");
//                        String festBy = fests.getString("By");
//                        String festDesc1 = fests.getString("Desc1");
//                        String festDesc2 = fests.getString("Desc2");
//                        Fest fest = new Fest(festBy,festName,festDesc1,festDesc2);
//                        culturalFests.add(fest);
//
//                    }
//                }
//            }
//        }).addOnFailureListener(new OnFailureListener() {
//            @Override
//            public void onFailure(@NonNull Exception e) {
//                Toast.makeText(getContext(),"Failed",Toast.LENGTH_SHORT).show();
//            }
//        });


    }

