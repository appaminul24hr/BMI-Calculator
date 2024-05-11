package com.aisoft.bmicalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    TextView tvDisplay;
    EditText edWeight,edFeet,edInch;
    Button calculateBtn;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //find===================================
        tvDisplay = findViewById(R.id.tvDisplay);
        edWeight = findViewById(R.id.edWeight);
        edFeet = findViewById(R.id.edFeet);
        edInch = findViewById(R.id.edInch);
        calculateBtn = findViewById(R.id.calculateBtn);







        //calculateBtn Onclick Here======================================
        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sWeight = edWeight.getText().toString();
                String sFeet = edFeet.getText().toString();
                String sInch = edInch.getText().toString();


                float weight = Float.parseFloat(sWeight);
                float feet = Float.parseFloat(sFeet);
                float inch = Float.parseFloat(sInch);

                float height = (float) (feet*0.3048 + inch*0.0254);
                float bmiIndex = weight/height/height;

                tvDisplay.setText("Your BMI Index is: "+bmiIndex);


            }
        });








    }
}