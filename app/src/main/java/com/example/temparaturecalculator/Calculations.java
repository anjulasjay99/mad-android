package com.example.temparaturecalculator;

public class Calculations {
    protected float convertCelciusToFahrenhite (Float value) {
        Float ans = ((9/5) * value) + 32;
        return ans;
    }

    protected float convertFahrenhiteToCelcius (Float value) {
        Float  ans = (value -32) * (5/9);
        return ans;
    }
}
