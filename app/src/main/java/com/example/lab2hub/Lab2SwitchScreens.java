package com.example.lab2hub;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lab2SwitchScreens extends AppCompatActivity {

    EditText etFirstNum, etSecondNum;
    TextView tvSign, tvResult;

    String require = "Trường này không được trống";

    Button btnAdd, btnMinus, btnMultiple, btnDivide;

    public boolean checkInputs() {
        if (TextUtils.isEmpty(etFirstNum.getText().toString())) {
            etFirstNum.setError(require);
            return false;
        }
        if (TextUtils.isEmpty(etSecondNum.getText().toString())) {
            etSecondNum.setError(require);
            return false;
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab2_switch_screens);

        etFirstNum = findViewById(R.id.etFirstNum);
        etSecondNum = findViewById(R.id.etSecondNum);
        btnAdd = findViewById(R.id.btnAdd);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiple = findViewById(R.id.btnMultiple);
        btnDivide = findViewById(R.id.btnDivide);
        tvResult = findViewById(R.id.tvResult);
        tvSign = findViewById(R.id.tvSign);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            double result;

            @Override
            public void onClick(View v) {
                if (checkInputs()) {
                    result = Double.parseDouble(etFirstNum.getText().toString()) + Double.parseDouble(etSecondNum.getText().toString());
                    tvSign.setText("+");
                    tvResult.setText(result + "");
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            double result;

            @Override
            public void onClick(View v) {
                if (checkInputs()) {
                    result = Double.parseDouble(etFirstNum.getText().toString()) - Double.parseDouble(etSecondNum.getText().toString());
                    tvSign.setText("-");
                    tvResult.setText(result + "");
                }
            }
        });

        btnMultiple.setOnClickListener(new View.OnClickListener() {
            double result;

            @Override
            public void onClick(View v) {
                if (checkInputs()) {
                    result = Double.parseDouble(etFirstNum.getText().toString()) * Double.parseDouble(etSecondNum.getText().toString());
                    tvSign.setText("*");
                    tvResult.setText(result + "");
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            double result;

            @Override
            public void onClick(View v) {
                if (checkInputs()) {
                    if (Double.parseDouble(etSecondNum.getText().toString()) == 0) {
                        etSecondNum.setError("Số chia phải khác 0");
                    } else {
                        result = Double.parseDouble(etFirstNum.getText().toString()) / Double.parseDouble(etSecondNum.getText().toString());
                        tvSign.setText("/");
                        tvResult.setText(result + "");
                    }

                }
            }
        });

    }
}
