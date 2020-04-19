package com.example.fest;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddFestFragment extends Fragment {
    private EditText by,name,desc1,desc2;
    private Button submitButton;
    private Switch switcher;


    public AddFestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.add_fest_layout,container,false);
       by = view.findViewById(R.id.new_by);
       name = view.findViewById(R.id.new_festname);
       desc1 = view.findViewById(R.id.new_festdesc1);
       desc2 = view.findViewById(R.id.new_festdesc2);
       submitButton = view.findViewById(R.id.submit_button);
       switcher = view.findViewById(R.id.switcher);

       submitButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String byWhom = by.getText().toString();
               String festName = name.getText().toString();
               String descrip1 = desc1.getText().toString();
               String descrip2 = desc2.getText().toString();
               if(!festName.isEmpty() && !descrip1.isEmpty() && !descrip2.isEmpty() && !byWhom.isEmpty()){
                   Fest fest = new Fest(byWhom,festName,descrip1,descrip2);
                   if(switcher.isChecked()){



                   }else{

                   }

               }
           }
       });


       return view;
    }

}
