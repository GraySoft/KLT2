package com.karpachoff.klt.presentation.views.activities;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.karpachoff.klt.R;
import com.karpachoff.klt.domain.entity.models.LoginData;

public class LoginActivity extends AppCompatActivity {

    TextInputLayout layoutName;

    TextInputLayout layoutPassword;

    Button btnForgetPassword;
    Button btnRegistrationLogInActivity;
    Button btnSignInLogInActivity;

    TextInputEditText editTextName = findViewById(R.id.name);
    TextInputEditText editTextPassword = findViewById(R.id.password);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        layoutName = findViewById(R.id.layoutName);

        layoutPassword = findViewById(R.id.layoutPassword);

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

    public LoginData getUserData() {
        LoginData loginData = new LoginData();
        loginData.setName(editTextName.getText().toString());
        loginData.setPassword(editTextPassword.getText().toString());
        return loginData;
    }
}
