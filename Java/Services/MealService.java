package com.example.healthmealplanner.Services;
import com.example.healthmealplanner.Models.MealPlan;

public class MealService {
    public MealPlan getMealPlanForToday(){
        return new MealPlan("Oats","Salad", "Grilled Chicken");
    }
}
