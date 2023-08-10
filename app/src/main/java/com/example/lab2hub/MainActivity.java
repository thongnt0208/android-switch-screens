package com.example.lab2hub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCalculator, btnSwitchScreen, btnMath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculator = findViewById(R.id.btnCalculator);
        btnSwitchScreen = findViewById(R.id.btnSwitchScreen);
        btnMath = findViewById(R.id.btnMath);


        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Lab2Calculator.class);

                startActivity(intent);
            }
        });
        btnSwitchScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Lab2SwitchScreens_SignIn.class);

                startActivity(intent);
            }
        });
        btnMath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Lab2Math.class);

                startActivity(intent);
            }
        });
    }


}