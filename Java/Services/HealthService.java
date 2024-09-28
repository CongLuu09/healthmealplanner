package com.example.healthmealplanner.Services;
import com.example.healthmealplanner.Models.HealthStats;

public class HealthService {
    public HealthStats getHealthStats(){
        return new HealthStats(75, 8000, 2000);
    }
}
