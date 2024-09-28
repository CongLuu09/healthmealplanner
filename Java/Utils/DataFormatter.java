package com.example.healthmealplanner.Utils;
import java.text.DecimalFormat;

public class DataFormatter {
    public static String formatDouble(double value){
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(value);
    }
}
