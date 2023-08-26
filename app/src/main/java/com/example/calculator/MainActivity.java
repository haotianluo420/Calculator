package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText firstNumber = findViewById(R.id.firstNumber);
        EditText secondNumber = findViewById(R.id.secondNumber);
        Button addButton = findViewById(R.id.addButton);
        Button minusButton = findViewById(R.id.minusButton);
        Button multiplyButton = findViewById(R.id.multiplyButton);
        Button divideButton = findViewById(R.id.divideButton);
        TextView result = findViewById(R.id.resultView);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double i = Double.parseDouble(firstNumber.getText().toString());
                    double j = Double.parseDouble(secondNumber.getText().toString());
                    double sum = i+j;
                    result.setText(String.valueOf(sum));
                }
                catch(Exception e)
                {
                    result.setText("Adding function not working");
                }
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double i = Double.parseDouble(firstNumber.getText().toString());
                    double j = Double.parseDouble(secondNumber.getText().toString());
                    double sum = i-j;
                    result.setText(String.valueOf(sum));
                }
                catch(Exception e)
                {
                    result.setText("Subtracting function not working");
                }
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double i = Double.parseDouble(firstNumber.getText().toString());
                    double j = Double.parseDouble(secondNumber.getText().toString());
                    double sum = i*j;
                    result.setText(String.valueOf(sum));
                }
                catch(Exception e)
                {
                    result.setText("Multiplying function not Working");
                }
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double i = Double.parseDouble(firstNumber.getText().toString());
                    double j = Double.parseDouble(secondNumber.getText().toString());
                    if (j==0){
                        result.setText("Unable to divide by 0");
                    }
                    else {
                        double sum = i / j;
                        result.setText(String.valueOf(sum));
                    }
                }
                catch(Exception e)
                {
                    result.setText("Dividing function not Working");
                }
            }
        });

    }
}