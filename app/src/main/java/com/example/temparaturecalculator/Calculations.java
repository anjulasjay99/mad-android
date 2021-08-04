package com.example.temparaturecalculator;

public class Calculations {
    protected float convertCelciusToFahrenhite (Float value) {
        Float answer = ((9/5) * value) + 32;
        return answer;
    }

    protected float convertFahrenhiteToCelcius (Float value) {
        Float  answer = (value -32) * (5/9);
        return answer;
    }
}
