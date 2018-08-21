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

    RestorePasswordContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restore_password);

        editTextEmail = findViewById(R.id.layoutEmail);

        presenter = new RestorePasswordPresenter();
        presenter.attachView(this);

        btnLogin = findViewById(R.id.btnSignInRestorePasswordActivity);
        btnLogin.setOnClickListener(v -> {
            editTextEmail.setError(null);
            presenter.onClickButtonLogin(editTextEmail.getEditText().getText().toString());
        });

        btnRegistration = findViewById(R.id.btnRegistrationRestorePasswordActivity);
        btnRegistration.setOnClickListener(v -> {

        });
    }

    @Override
    public void showEmailErrorLength() {
        editTextEmail.setError(getString(R.string.errorEmailLength));
    }

    @Override
    public void showEmailErrorCharacter() {
        editTextEmail.setError(getString(R.string.errorEmailCharacter));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
}
