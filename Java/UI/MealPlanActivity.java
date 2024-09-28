package com.example.healthmealplanner.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.healthmealplanner.R;
import com.example.healthmealplanner.Services.MealService;

public class MealPlanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal_plan);

        MealService mealService = new MealService();
        
        mealService.getMealPlanForToday();

        
    }
}