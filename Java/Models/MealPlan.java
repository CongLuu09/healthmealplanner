package com.example.healthmealplanner.Models;

public class MealPlan {
    private String breakfast;
    private String lunch;
    private String dinner;

    public MealPlan(String breakfast, String lunch, String dinner) {
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
    }

    public String getBreakfast() {
        return breakfast;
    }

    public String getLunch() {
        return lunch;
    }

    public String getDinner() {
        return dinner;
    }
}
