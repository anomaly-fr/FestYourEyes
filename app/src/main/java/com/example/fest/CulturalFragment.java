package com.example.fest;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class CulturalFragment extends Fragment {



    public CulturalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ArrayList <Fest> culturalFests = new ArrayList<>();
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        RecyclerView.LayoutManager manager;


         View view = inflater.inflate(R.layout.recycler_view1, container, false);
        inflater.inflate(R.layout.fragment_cultural, container, false);


        culturalFests.add(new Fest("Jaathre","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE.",R.drawable.dance,"2nd Years"));
        culturalFests.add(new Fest("Fiesta","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE.",R.drawable.dance,"3rd years"));
        culturalFests.add(new Fest("Civista","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE.",R.drawable.dance,"Civil Department"));
        culturalFests.add(new Fest("Esportivo","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE.",R.drawable.dance,"UVCE"));
        culturalFests.add(new Fest("Milagro","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE.",R.drawable.dance,"4th years"));
        culturalFests.add(new Fest("Jaathre","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE.",R.drawable.dance,"2nd Years"));
        culturalFests.add(new Fest("Fiesta","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE.",R.drawable.dance,"3rd years"));
        culturalFests.add(new Fest("Civista","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE.",R.drawable.dance,"Civil Department"));
        culturalFests.add(new Fest("Esportivo","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE.",R.drawable.dance,"UVCE"));
        culturalFests.add(new Fest("Milagro","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE.",R.drawable.dance,"4th years"));
        culturalFests.add(new Fest("Jaathre","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE.",R.drawable.dance,"2nd Years"));
        culturalFests.add(new Fest("Fiesta","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE.",R.drawable.dance,"3rd years"));
        culturalFests.add(new Fest("Civista","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE.",R.drawable.dance,"Civil Department"));
        culturalFests.add(new Fest("Esportivo","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE.",R.drawable.dance,"UVCE"));
        culturalFests.add(new Fest("Milagro","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE.",R.drawable.dance,"4th years"));
        culturalFests.add(new Fest("Jaathre","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE.",R.drawable.dance,"2nd Years"));
        culturalFests.add(new Fest("Fiesta","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE.",R.drawable.dance,"3rd years"));
        culturalFests.add(new Fest("Civista","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE.",R.drawable.dance,"Civil Department"));
        culturalFests.add(new Fest("Esportivo","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE.",R.drawable.dance,"UVCE"));
        culturalFests.add(new Fest("Milagro","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE.",R.drawable.dance,"4th years"));
        culturalFests.add(new Fest("Jaathre","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE.",R.drawable.dance,"2nd Years"));
        culturalFests.add(new Fest("Fiesta","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE.",R.drawable.dance,"3rd years"));
        culturalFests.add(new Fest("Civista","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE.",R.drawable.dance,"Civil Department"));
        culturalFests.add(new Fest("Esportivo","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE.",R.drawable.dance,"UVCE"));
        culturalFests.add(new Fest("Milagro","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE.",R.drawable.dance,"4th years"));
        culturalFests.add(new Fest("Jaathre","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE.",R.drawable.dance,"2nd Years"));
        culturalFests.add(new Fest("Fiesta","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE.",R.drawable.dance,"3rd years"));
        culturalFests.add(new Fest("Civista","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE.",R.drawable.dance,"Civil Department"));
        culturalFests.add(new Fest("Esportivo","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE.",R.drawable.dance,"UVCE"));
        culturalFests.add(new Fest("Milagro","As the name indicates, it's a " +
                "colourful one day event organised by 2nd years" +
                "during the month of October. Various collegiate clubs set up their stalls in the quadrangle.","Fun games are conducted " +
                "thereby enabling freshers to know more about UVCE.",R.drawable.dance,"4th years"));


        recyclerView = view.findViewById(R.id.recyler_viewOne);
        manager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(manager);

        adapter = new RecyclerAdapter1(culturalFests);
        recyclerView.setAdapter(adapter);










        return view;


    }

}
