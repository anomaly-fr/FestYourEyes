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
public class TechnicalFragment extends Fragment {


    public TechnicalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.recyler_view2, container, false);
        ArrayList<Fest> techFests = new ArrayList<>();
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        RecyclerView.LayoutManager manager;

        techFests.add(new Fest("Kagada", "Kagada is a national level technical symposium organised by team IEEE UVCE.Students accross the country take part in this event.",
                "They get to showcase their technical knowledge and research by means of paper and poster.", R.drawable.commpy,"IEEE UVCE"));
        techFests.add(new Fest("Inspiron", "Kagada is a national level technical symposium organised by team IEEE UVCE.Students accross the country take part in this event.",
                "They get to showcase their technical knowledge and research by means of paper and poster.", R.drawable.commpy,"TPO"));

        techFests.add(new Fest("Impetus", "Kagada is a national level technical symposium organised by team IEEE UVCE.Students accross the country take part in this event.",
                "They get to showcase their technical knowledge and research by means of paper and poster.", R.drawable.commpy,"IEEE UVCE"));


        techFests.add(new Fest("Kagada", "Kagada is a national level technical symposium organised by team IEEE UVCE.Students accross the country take part in this event.",
                "They get to showcase their technical knowledge and research by means of paper and poster.", R.drawable.commpy,"IEEE UVCE"));
        techFests.add(new Fest("Inspiron", "Kagada is a national level technical symposium organised by team IEEE UVCE.Students accross the country take part in this event.",
                "They get to showcase their technical knowledge and research by means of paper and poster.", R.drawable.commpy,"TPO"));

        techFests.add(new Fest("Impetus", "Kagada is a national level technical symposium organised by team IEEE UVCE.Students accross the country take part in this event.",
                "They get to showcase their technical knowledge and research by means of paper and poster.", R.drawable.commpy,"IEEE UVCE"));

        techFests.add(new Fest("Kagada", "Kagada is a national level technical symposium organised by team IEEE UVCE.Students accross the country take part in this event.",
                "They get to showcase their technical knowledge and research by means of paper and poster.", R.drawable.commpy,"IEEE UVCE"));
        techFests.add(new Fest("Inspiron", "Kagada is a national level technical symposium organised by team IEEE UVCE.Students accross the country take part in this event.",
                "They get to showcase their technical knowledge and research by means of paper and poster.", R.drawable.commpy,"TPO"));

        techFests.add(new Fest("Impetus", "Kagada is a national level technical symposium organised by team IEEE UVCE.Students accross the country take part in this event.",
                "They get to showcase their technical knowledge and research by means of paper and poster.", R.drawable.commpy,"IEEE UVCE"));

        techFests.add(new Fest("Kagada", "Kagada is a national level technical symposium organised by team IEEE UVCE.Students accross the country take part in this event.",
                "They get to showcase their technical knowledge and research by means of paper and poster.", R.drawable.commpy,"IEEE UVCE"));
        techFests.add(new Fest("Inspiron", "Kagada is a national level technical symposium organised by team IEEE UVCE.Students accross the country take part in this event.",
                "They get to showcase their technical knowledge and research by means of paper and poster.", R.drawable.commpy,"TPO"));

        techFests.add(new Fest("Impetus", "Kagada is a national level technical symposium organised by team IEEE UVCE.Students accross the country take part in this event.",
                "They get to showcase their technical knowledge and research by means of paper and poster.", R.drawable.commpy,"IEEE UVCE"));
        techFests.add(new Fest("Kagada", "Kagada is a national level technical symposium organised by team IEEE UVCE.Students accross the country take part in this event.",
                "They get to showcase their technical knowledge and research by means of paper and poster.", R.drawable.commpy,"IEEE UVCE"));
        techFests.add(new Fest("Inspiron", "Kagada is a national level technical symposium organised by team IEEE UVCE.Students accross the country take part in this event.",
                "They get to showcase their technical knowledge and research by means of paper and poster.", R.drawable.commpy,"TPO"));

        techFests.add(new Fest("Impetus", "Kagada is a national level technical symposium organised by team IEEE UVCE.Students accross the country take part in this event.",
                "They get to showcase their technical knowledge and research by means of paper and poster.", R.drawable.commpy,"IEEE UVCE"));
        techFests.add(new Fest("Kagada", "Kagada is a national level technical symposium organised by team IEEE UVCE.Students accross the country take part in this event.",
                "They get to showcase their technical knowledge and research by means of paper and poster.", R.drawable.commpy,"IEEE UVCE"));
        techFests.add(new Fest("Inspiron", "Kagada is a national level technical symposium organised by team IEEE UVCE.Students accross the country take part in this event.",
                "They get to showcase their technical knowledge and research by means of paper and poster.", R.drawable.commpy,"TPO"));

        techFests.add(new Fest("Impetus", "Kagada is a national level technical symposium organised by team IEEE UVCE.Students accross the country take part in this event.",
                "They get to showcase their technical knowledge and research by means of paper and poster.", R.drawable.commpy,"IEEE UVCE"));
        techFests.add(new Fest("Kagada", "Kagada is a national level technical symposium organised by team IEEE UVCE.Students accross the country take part in this event.",
                "They get to showcase their technical knowledge and research by means of paper and poster.", R.drawable.commpy,"IEEE UVCE"));
        techFests.add(new Fest("Inspiron", "Kagada is a national level technical symposium organised by team IEEE UVCE.Students accross the country take part in this event.",
                "They get to showcase their technical knowledge and research by means of paper and poster.", R.drawable.commpy,"TPO"));

        techFests.add(new Fest("Impetus", "Kagada is a national level technical symposium organised by team IEEE UVCE.Students accross the country take part in this event.",
                "They get to showcase their technical knowledge and research by means of paper and poster.", R.drawable.commpy,"IEEE UVCE"));

        recyclerView = view.findViewById(R.id.recyler_viewTwo);
        manager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(manager);

        adapter = new RecylerAdapter2(techFests);
        recyclerView.setAdapter(adapter);


        return view;


    }
    }
