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
    TextInputEditText email;

    Button btnSignInRestorePasswordActivity;
    Button btnRegistrationRestorePasswordActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restore_password);

        //one of the options
        layoutEmail = findViewById(R.id.layoutEmail);
        email = layoutEmail.findViewById(R.id.email);

        email = findViewById(R.id.email);

        btnSignInRestorePasswordActivity = findViewById(R.id.btnSignInRestorePasswordActivity);
        btnSignInRestorePasswordActivity.setOnClickListener(v -> {

        });

        btnRegistrationRestorePasswordActivity = findViewById(R.id.btnRegistrationRestorePasswordActivity);
        btnRegistrationRestorePasswordActivity.setOnClickListener(v -> {

        });
    }
}
