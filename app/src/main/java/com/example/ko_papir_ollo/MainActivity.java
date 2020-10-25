package com.example.ko_papir_ollo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageView rock_player, rock_computer;
    private Button rock, paper, crissors;
    private TextView text_human, text_computer;
    private int eredmeny;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }






    private void init() {
        rock_player = findViewById(R.id.rock_player);
        rock_computer = findViewById(R.id.rock_computer);
        rock = findViewById(R.id.rock);
        paper = findViewById(R.id.paper);
        crissors = findViewById(R.id.scrissors);
        text_human = findViewById(R.id.text_human);
        text_computer = findViewById(R.id.text_computer);
        eredmeny = 0;
    }
}