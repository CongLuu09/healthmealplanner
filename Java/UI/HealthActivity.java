package com.example.healthmealplanner.UI;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.healthmealplanner.R;
import com.example.healthmealplanner.Models.HealthStats;
import com.example.healthmealplanner.Services.HealthService;

public class HealthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

        
        TextView heartRateView = findViewById(R.id.heart_rate);
        TextView stepsView = findViewById(R.id.steps);
        TextView waterIntakeView = findViewById(R.id.water_intake);

       
        HealthService healthService = new HealthService();
        HealthStats stats = healthService.getHealthStats();

        
        heartRateView.setText("Heart Rate: " + stats.getHeartRate() + " bpm");
        stepsView.setText("Steps: " + stats.getSteps());
        waterIntakeView.setText("Water Intake: " + stats.getWaterIntake() + " ml");
    }
}