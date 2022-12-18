package com.boucetta.lotteryapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView draw1,draw2,draw3,draw4,draw5,draw6;
    Button draw;
    Integer[] lottery= new Integer[48];
    ArrayList<TextView> listTextView = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Lottery");
        for (int i = 0; i <48 ; i++) {
            lottery[i]=i+1;

        }
        draw = findViewById(R.id.draw);
        draw1 = findViewById(R.id.draw1);
        draw2 = findViewById(R.id.draw2);
        draw3 = findViewById(R.id.draw3);
        draw4 = findViewById(R.id.draw4);
        draw5 = findViewById(R.id.draw5);
        draw6 = findViewById(R.id.draw6);

            listTextView.add(draw1);
            listTextView.add(draw2);
            listTextView.add(draw3);
            listTextView.add(draw4);
            listTextView.add(draw5);
            listTextView.add(draw6);



        draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Integer> list = new ArrayList<>();
                Random random = new Random();
                Collections.addAll(list,lottery);
                for (int i = 0; i <6 ; i++) {
                   Integer m= list.get(random.nextInt(list.size()));
                   listTextView.get(i).setText(""+m);
                   list.remove(m);

                }
            }
        });


    }
}