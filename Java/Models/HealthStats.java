package com.example.healthmealplanner.Models;

public class HealthStats {
    private int heartRate;
    private int steps;
    private int waterIntake;

    public HealthStats(int heartRate, int steps, int waterIntake) {
        this.heartRate = heartRate;
        this.steps = steps;
        this.waterIntake = waterIntake;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public int getWaterIntake() {
        return waterIntake;
    }

    public void setWaterIntake(int waterIntake) {
        this.waterIntake = waterIntake;
    }
}
