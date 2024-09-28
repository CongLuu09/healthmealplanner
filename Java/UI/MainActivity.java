package com.example.healthmealplanner.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.healthmealplanner.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button healthButton = findViewById(R.id.button_health);
        Button mealPlanButton = findViewById(R.id.button_meal_plan);

        healthButton.setOnClickListener(v ->{
            Intent intent = new Intent(MainActivity.this, HealthActivity.class);
            startActivity(intent);
        });

        mealPlanButton.setOnClickListener(v ->{
            Intent intent = new Intent(MainActivity.this, MealPlanActivity.class);
            startActivity(intent);
        });
    }
}