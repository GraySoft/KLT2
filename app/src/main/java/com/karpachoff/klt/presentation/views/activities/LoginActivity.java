package com.karpachoff.klt.presentation.views.activities;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.karpachoff.klt.R;

public class LoginActivity extends AppCompatActivity {

    TextInputLayout layoutName;
    TextInputEditText name;

    TextInputLayout layoutPassword;
    TextInputEditText password;

    Button btnForgetPassword;
    Button btnRegistrationLogInActivity;
    Button btnSignInLogInActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //choose one of the options
        layoutName = findViewById(R.id.layoutName);
        name = layoutName.findViewById(R.id.name);

        name = findViewById(R.id.email);

        //choose one of the options
        layoutPassword = findViewById(R.id.layoutPassword);
        password = layoutPassword.findViewById(R.id.password);

        password = findViewById(R.id.password);

        btnForgetPassword = findViewById(R.id.btnForgetPassword);
        btnForgetPassword.setOnClickListener(v -> {

        });

        btnSignInLogInActivity = findViewById(R.id.btnSignInLogInActivity);
        btnSignInLogInActivity.setOnClickListener(v -> {

        });

        btnRegistrationLogInActivity = findViewById(R.id.btnRegistrationLogInActivity);
        btnRegistrationLogInActivity.setOnClickListener(v -> {

        });
    }
}
