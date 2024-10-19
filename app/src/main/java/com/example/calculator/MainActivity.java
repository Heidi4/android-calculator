package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2;
    TextView result;
    Button b1, b2, b3, b4, reset;
    String pleaseEnterBothNumbers = "Please enter both numbers";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.firstVal);
        et2 = findViewById(R.id.secondVal);
        b1 = findViewById(R.id.add);
        b2 = findViewById(R.id.sub);
        b3 = findViewById(R.id.div);
        b4 = findViewById(R.id.mul);
        reset = findViewById(R.id.reset);
        result = findViewById(R.id.result);
        
        // Set click listeners for each operation
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sub();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                div();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mul();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });
    }

    // Method to perform addition
    public void add() {
        String firstVal = et1.getText().toString();
        String secondVal = et2.getText().toString();
        if (!firstVal.isEmpty() && !secondVal.isEmpty()) {
            double x = Double.parseDouble(firstVal);
            double y = Double.parseDouble(secondVal);
            result.setText(String.valueOf(x + y));
        } else {
           
            result.setText(pleaseEnterBothNumbers);
        }
    }

    // Method to perform subtractionpleaseEnterBothNumbers
    public void sub() {
        String firstVal = et1.getText().toString();
        String secondVal = et2.getText().toString();
        if (!firstVal.isEmpty() && !secondVal.isEmpty()) {
            double x = Double.parseDouble(firstVal);
            double y = Double.parseDouble(secondVal);
            result.setText(String.valueOf(x - y));
        } else {
            result.setText(pleaseEnterBothNumbers);
        }
    }

    // Method to perform division
    public void div() {
        String firstVal = et1.getText().toString();
        String secondVal = et2.getText().toString();
        if (!firstVal.isEmpty() && !secondVal.isEmpty()) {
            double x = Double.parseDouble(firstVal);
            double y = Double.parseDouble(secondVal);
            if (y != 0) {
                result.setText(String.valueOf(x / y));
            } else {
                result.setText("Cannot divide by zero");
            }
        } else {
            result.setText(pleaseEnterBothNumbers);
        }
    }

    // Method to perform multiplication
    public void mul() {
        String firstVal = et1.getText().toString();
        String secondVal = et2.getText().toString();
        if (!firstVal.isEmpty() && !secondVal.isEmpty()) {
            double x = Double.parseDouble(firstVal);
            double y = Double.parseDouble(secondVal);
            result.setText(String.valueOf(x * y));
        } else {
            result.setText(pleaseEnterBothNumbers);
        }
    }

    // Method to reset input fields and result
    public void reset() {
        et1.setText(null);
        et2.setText(null);
        result.setText(null);
    }
}
