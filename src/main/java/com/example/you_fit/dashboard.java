package com.example.you_fit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dashboard extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btn = findViewById(R.id.exercise_cat);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    public void food(View view) {

        Intent i = new Intent(getApplicationContext(), diet.class);
        startActivity(i);

    }

    public void bf(View view) {

        Intent i = new Intent(getApplicationContext(), workout.class);
        startActivity(i);
    }

    public void onBClick(View view) {

        Intent i = new Intent(getApplicationContext(), workout.class);
        startActivity(i);
    }
}