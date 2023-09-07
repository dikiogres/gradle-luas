package com.example.luas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextLength;
    private EditText editTextWidth;
    private Button buttonCalculate;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextLength = findViewById(R.id.editTextLength);
        editTextWidth = findViewById(R.id.editTextWidth);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the length and width from the EditText fields
                double length = Double.parseDouble(editTextLength.getText().toString());
                double width = Double.parseDouble(editTextWidth.getText().toString());

                // Calculate the area of the rectangle
                double area = length * width;

                // Display the result in the textViewResult
                textViewResult.setText("Area: " + area);
            }
        });
    }
}

