package com.example.lab2hub;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Lab2Calculator extends AppCompatActivity {
    TextView txtNumber;
    Button btnRandom;

    EditText numMin, numMax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab2_calculator);
        txtNumber = (TextView) findViewById(R.id.textView);
        btnRandom = (Button) findViewById(R.id.button);
        numMin = (EditText) findViewById(R.id.numMin);
        numMax = (EditText) findViewById(R.id.numMax);

        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int minNum = Integer.parseInt(numMin.getText().toString()) ;
                int maxNum = Integer.parseInt(numMax.getText().toString()) ;

                //Tạo số ngẫu nhiên
                Random random = new Random();
                int number = random.nextInt(maxNum) - random.nextInt(minNum) + 1; //Điền vào một số nguyên bất kì
                //txtNumber.setText(number); --> lỗi do txtNumber là dạng string nhưng gán njmber dạng int vào
                txtNumber.setText(number + "");
            }
        });
    }
}