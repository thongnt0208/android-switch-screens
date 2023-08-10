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

public class Lab2SwitchScreens_SignIn extends AppCompatActivity implements View.OnClickListener {
    EditText etUsername, etPassword;
    TextView tvCreateAccount;
    Button btnSignIn;
    String REQUIRE = "Require";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab2_switch_screens_signin);

        btnSignIn = findViewById(R.id.buttonSignUp);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        tvCreateAccount = findViewById(R.id.tvLoginForm);

        btnSignIn.setOnClickListener(this);
        tvCreateAccount.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        //sign in
        if (v.getId() == R.id.buttonSignUp) {
            signIn();
        }
        //sign up
        if (v.getId() == R.id.tvLoginForm) {
            signUpForm();
        }
    }

    private boolean checkInputs() {
        //username
        if (TextUtils.isEmpty(etUsername.getText().toString())) {
            etUsername.setError(REQUIRE);
            return false;
        }
        //password
        if (TextUtils.isEmpty(etPassword.getText().toString())) {
            etPassword.setError(REQUIRE);
            return false;
        }
        //valid
        return true;
    }

    private void signIn() {
        //invalid
        if (!checkInputs()) {
            return;
        }
        //valid
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();//close current activity
    }

    private void signUpForm() {
        Intent intent = new Intent(this, Lab2SwitchScreens_SignUp.class);
        startActivity(intent);
        finish();//close current activity
    }
}

