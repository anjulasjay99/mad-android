package com.example.temparaturecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnCalculate;
    EditText temp;
    TextView ans;
    RadioButton celcius;
    RadioButton fahrenhite;
    Calculations calculations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculate = (Button) findViewById(R.id.btnCalculate);
        temp = (EditText) findViewById(R.id.temp);
        ans = (TextView) findViewById(R.id.textView);
        celcius = (RadioButton) findViewById(R.id.celcius);
        fahrenhite = (RadioButton) findViewById(R.id.Fahrenhite);
        calculations = new Calculations();
    }

    @Override
    protected  void onResume() {
        super.onResume();

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateAnswer();
            }
        });
    }

    private void calculateAnswer() {
        Float result;
        if(TextUtils.isEmpty(temp.getText())) {
            Toast.makeText(this, "Please add a value", Toast.LENGTH_LONG).show();
        }
        else {
            if(celcius.isChecked()) {
                result = calculations.convertCelciusToFahrenhite(Float.parseFloat(temp.getText().toString()));
            }
            else if(fahrenhite.isChecked()) {
                result = calculations.convertFahrenhiteToCelcius(Float.parseFloat(temp.getText().toString()));
            }
            else {
                Toast.makeText(this, "Select Radio!", Toast.LENGTH_LONG).show();
                result = 0.0f;
            }
            ans.setText(result.toString());
        }
    }
}