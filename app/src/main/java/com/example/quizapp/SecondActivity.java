package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvShow = findViewById(R.id.tvShow);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String roll = intent.getStringExtra("roll");
        String dept = intent.getStringExtra("dept");
        String blood = intent.getStringExtra("blood");
        String address = intent.getStringExtra("address");

        String info = "Name: " + name + "\n" +
                    "Roll: " + roll + "\n" +
                    "Department: " + dept + "\n" +
                    "Blood Group: " + blood + "\n" +
                    "Address: " + address + "\n";

        tvShow.setText(info);
    }
}