package com.example.fest;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.ArrayList;

public class WelcomeActivity extends AppCompatActivity {
    boolean onWelcomeScreen = true;
    ArrayList<ImageView> dashes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        ImageView one = findViewById(R.id.one);
        final ImageView two = findViewById(R.id.two);
        ImageView three = findViewById(R.id.three);
        ImageView four = findViewById(R.id.four);
        ImageView five = findViewById(R.id.five);
        ImageView six = findViewById(R.id.six);
        ImageView seven = findViewById(R.id.seven);
        ImageView eight = findViewById(R.id.eight);
        ImageView nine = findViewById(R.id.nine);
        ImageView ten = findViewById(R.id.ten);
        ImageView eleven = findViewById(R.id.eleven);
        ImageView twelve = findViewById(R.id.twelve);


        dashes.add(one);
        dashes.add(two);
        dashes.add(three);
        dashes.add(four);
        dashes.add(five);
        dashes.add(six);
        dashes.add(seven);
        dashes.add(eight);
        dashes.add(nine);
        dashes.add(ten);
        dashes.add(eleven);
        dashes.add(twelve);


        ConnectAnimation1(dashes);
        ConnectAnimation1(dashes);


//        nextButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
//                startActivity(intent);
//
//            }
//       });
//
//    }
    }
    void ConnectAnimation1(ArrayList<ImageView>list) {


        for(int i=0;i<list.size();i++){
            list.get(i).setAlpha(0f);
        }

        for(int i=0;i<list.size();i++) {

            list.get(i).animate().alpha(1f).setDuration(100).setStartDelay(i*100).setListener(new Animator.AnimatorListener() {
                @Override
                public void onAnimationStart(Animator animation) {

                }

                @Override
                public void onAnimationEnd(Animator animation) {



                }

                @Override
                public void onAnimationCancel(Animator animation) {

                }

                @Override
                public void onAnimationRepeat(Animator animation) {

                }
            });
        }



    }
}