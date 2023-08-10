package com.example.lab2hub;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Lab2SwitchScreens_SignUp extends AppCompatActivity implements View.OnClickListener {
    EditText etUsername, etPassword, etPassword2;
    TextView tvLoginForm;
    Button buttonSignUp;
    String REQUIRE = "Require";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab2_switch_screens_signup);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        etPassword2 = findViewById(R.id.etPassword2);
        tvLoginForm = findViewById(R.id.tvLoginForm);
        buttonSignUp = findViewById(R.id.buttonSignUp);

        tvLoginForm.setOnClickListener(this);
        buttonSignUp.setOnClickListener(this);
    }

    public boolean checkInput() {
        if (etUsername.getText().toString().isEmpty()) {
            etUsername.setError(REQUIRE);
            return false;

        }
        if (etPassword.getText().toString().isEmpty()) {
            etPassword.setError(REQUIRE);
            return false;

        }
        if (etPassword2.getText().toString().isEmpty()) {
            etPassword2.setError(REQUIRE);
            return false;
        }
        if (!TextUtils.equals(etPassword.getText().toString(), etPassword2.getText().toString())) {
            Toast.makeText(this, "Password is not match!", Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }

    private void signUp() {
        if (!checkInput()) {
            return;
        } else {
            signInForm();
        }
    }

    private void signInForm() {
        Intent intent = new Intent(this, Lab2SwitchScreens_SignIn.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonSignUp) {
            signUp();
        }
        if (v.getId() == R.id.tvLoginForm) {
            signInForm();
        }
    }
}
