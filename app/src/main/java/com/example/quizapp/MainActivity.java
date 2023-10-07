package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtName, edtRoll, edtDept, edtBlood, edtAddress;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edtName);
        edtRoll = findViewById(R.id.edtRoll);
        edtDept = findViewById(R.id.edtDepartment);
        edtBlood = findViewById(R.id.edtBlood);
        edtAddress = findViewById(R.id.edtAddress);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("name", edtName.getText().toString().trim());
                intent.putExtra("roll", edtRoll.getText().toString().trim());
                intent.putExtra("dept", edtDept.getText().toString().trim());
                intent.putExtra("blood", edtBlood.getText().toString().trim());
                intent.putExtra("address", edtAddress.getText().toString().trim());
                startActivity(intent);

            }
        });

    }
}