package com.karpachoff.klt.presentation.views.activities;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.karpachoff.klt.R;

public class RestorePasswordActivity extends AppCompatActivity {

    TextInputLayout layoutEmail;

    Button btnSignInRestorePasswordActivity;
    Button btnRegistrationRestorePasswordActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restore_password);

        layoutEmail = findViewById(R.id.layoutEmail);

        btnSignInRestorePasswordActivity = findViewById(R.id.btnSignInRestorePasswordActivity);
        btnSignInRestorePasswordActivity.setOnClickListener(v -> {

        });

        btnRegistrationRestorePasswordActivity = findViewById(R.id.btnRegistrationRestorePasswordActivity);
        btnRegistrationRestorePasswordActivity.setOnClickListener(v -> {

        });
    }
}
