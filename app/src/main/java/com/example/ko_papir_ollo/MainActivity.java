package com.example.ko_papir_ollo;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView rock_player, rock_computer;
    private Button rock, paper, scissors;
    private TextView text_human, text_computer;
    private Random rng;
    private int eredmenyHuman,eredmenyComputer, randomSzam, dontes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dontes = 1;
                rock_player.setImageResource(R.drawable.rock);
                randomComputer();
                jatek(dontes);
            }
        });
        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dontes = 2;
                rock_player.setImageResource(R.drawable.paper);
                randomComputer();
                jatek(dontes);
            }
        });
        scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dontes = 3;
                rock_player.setImageResource(R.drawable.scissors);
                randomComputer();
                jatek(dontes);
            }
        });
    }

    private void randomComputer(){
        randomSzam = rng.nextInt(3)+1;
        switch (randomSzam){
            case 1: rock_computer.setImageResource(R.drawable.rock);break;
            case 2: rock_computer.setImageResource(R.drawable.paper);break;
            case 3: rock_computer.setImageResource(R.drawable.scissors);break;
        }
    }
    private void jatek(int dontes){
        if (randomSzam == dontes){
            Context context = getApplicationContext();
            CharSequence text = "Döntetlen";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        } else if (dontes == 1 && randomSzam == 3 || dontes == 2 && randomSzam == 1 || dontes == 3 && randomSzam == 2) {
            eredmenyHuman++;
            text_human.setText("Eredmény: Ember: "+eredmenyHuman);
        }
        else if(dontes == 3 && randomSzam == 1 || dontes == 1 && randomSzam == 2 || dontes == 2 && randomSzam == 3){
            eredmenyComputer++;
            text_computer.setText(" Computer: "+eredmenyComputer);
        }
    }


    private void init() {
        rock_player = findViewById(R.id.rock_player);
        rock_computer = findViewById(R.id.rock_computer);
        rock = findViewById(R.id.rock);
        paper = findViewById(R.id.paper);
        scissors = findViewById(R.id.scrissors);
        text_human = findViewById(R.id.text_human);
        text_computer = findViewById(R.id.text_computer);
        dontes = 0;
        rng = new Random();
    }
}