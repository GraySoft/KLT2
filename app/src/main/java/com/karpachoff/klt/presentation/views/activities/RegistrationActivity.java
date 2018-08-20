package com.karpachoff.klt.presentation.views.activities;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.karpachoff.klt.R;
import com.karpachoff.klt.presentation.contract.RegistrationContract;
import com.karpachoff.klt.presentation.presenters.RegistrationPresenter;

public class RegistrationActivity extends AppCompatActivity implements RegistrationContract.View {

    ImageButton btnAddPhoto;
    Button btnRegistration;

    TextInputLayout editTextName;
    TextInputLayout editTextEmail;
    TextInputLayout editTextPassword;

    RegistrationPresenter registrationPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        editTextName = findViewById(R.id.layoutName);
        editTextEmail = findViewById(R.id.layoutEmail);
        editTextPassword = findViewById(R.id.layoutPassword);

        btnAddPhoto = findViewById(R.id.btnAddPhoto);
        btnAddPhoto.setOnClickListener(v -> Toast.makeText(this, "it's work", Toast.LENGTH_SHORT).show());

        btnRegistration = findViewById(R.id.btnRegistration);
        btnRegistration.setOnClickListener(v -> {
            editTextName.setError(null);
            editTextEmail.setError(null);
            editTextPassword.setError(null);
            registrationPresenter = new RegistrationPresenter(this);
            registrationPresenter.validation(
                    editTextName.getEditText().getText().toString(),
                    editTextEmail.getEditText().getText().toString(),
                    editTextPassword.getEditText().getText().toString());
        });
    }

    @Override
    public void showNameErrorLength() {
        editTextName.setError("Имя слишком короткое");
    }

    @Override
    public void showEmailErrorLength() {
        editTextEmail.setError("E-mail слишком короткий");
    }

    @Override
    public void showEmailErrorCharacter() {
        editTextEmail.setError("Вы не написали символ @");
    }

    @Override
    public void showPasswordError() {
        editTextPassword.setError("Пароль слишком короткий");
    }
}
