package com.karpachoff.klt.presentation.views.activities;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.karpachoff.klt.R;
import com.karpachoff.klt.presentation.contract.RestorePasswordContract;
import com.karpachoff.klt.presentation.presenters.RestorePasswordPresenter;

public class RestorePasswordActivity extends AppCompatActivity implements RestorePasswordContract.View {

    TextInputLayout editTextEmail;

    Button btnLogin;
    Button btnRegistration;

    RestorePasswordContract.Presenter restorePasswordPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restore_password);

        editTextEmail = findViewById(R.id.layoutEmail);

        btnLogin = findViewById(R.id.btnSignInRestorePasswordActivity);
        btnLogin.setOnClickListener(v -> {
            restorePasswordPresenter = new RestorePasswordPresenter(this);
            restorePasswordPresenter.onClickButtonLogin(editTextEmail.getEditText().getText().toString());
        });

        btnRegistration = findViewById(R.id.btnRegistrationRestorePasswordActivity);
        btnRegistration.setOnClickListener(v -> {

        });
    }

    @Override
    public void showEmailErrorLength() {
        editTextEmail.setError("E-mail слишком короткий");
    }

    @Override
    public void showEmailErrorCharacter() {
        editTextEmail.setError("Вы не написали символ @");
    }
}
