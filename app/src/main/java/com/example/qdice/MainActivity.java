package com.example.qdice;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    private EditText numDice, numSides;
    private Button roll;
    private TextView displayDice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }
    public void addListenerOnButton(){
        numDice=(EditText) findViewById(R.id.numDice);
        numSides=(EditText) findViewById(R.id.numSides);
        roll=(Button) findViewById(R.id.roll);
        final TextView displayRoll = findViewById(R.id.displayDice);

        roll.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String dice=numDice.getText().toString();
                String sides=numSides.getText().toString();
                int a = Integer.parseInt(dice);
                int b = Integer.parseInt(sides);

                Random randomGenerator = new Random();
                int randomInt = randomGenerator.nextInt(b) + 1;
// new experiemnt to test list array
                ArrayList<Integer> myCoords;
                myCoords = new ArrayList<>();
                myCoords.add(10);
                myCoords.add(20);
                myCoords.add(30);
                myCoords.add(40);
                myCoords.add(randomInt);

                Iterator<Integer> myListIterator = myCoords.iterator();
                while (myListIterator.hasNext()) {
                    Integer coord = myListIterator.next();
                    displayRoll.setText(Integer.toString(coord));
                }

                //displayRoll.setText(Integer.toString(randomInt)); un commment to revert to original
            }
        });
    }
}
