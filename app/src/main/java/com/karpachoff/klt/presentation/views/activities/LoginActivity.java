package com.karpachoff.klt.presentation.views.activities;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.karpachoff.klt.R;
import com.karpachoff.klt.domain.entity.models.LoginData;
import com.karpachoff.klt.presentation.contract.LoginContract;
import com.karpachoff.klt.presentation.presenters.LoginPresenter;

public class LoginActivity extends AppCompatActivity implements LoginContract.View {

    Button btnForgetPassword;
    Button btnRegistrationLogInActivity;
    Button btnSignInLogInActivity;

    TextInputLayout editTextName;
    TextInputLayout editTextPassword;

    LoginContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextName = findViewById(R.id.layoutName);
        editTextPassword = findViewById(R.id.layoutPassword);

        presenter = new LoginPresenter();
        presenter.attachView(this);

        btnForgetPassword = findViewById(R.id.btnForgetPassword);
        btnForgetPassword.setOnClickListener(v -> {

        });

        btnSignInLogInActivity = findViewById(R.id.btnSignInLogInActivity);
        btnSignInLogInActivity.setOnClickListener(v -> {
            editTextName.setError(null);
            editTextPassword.setError(null);
            presenter.onClickButtonLogin(
                    editTextName.getEditText().getText().toString(),
                    editTextPassword.getEditText().getText().toString());
        });

        btnRegistrationLogInActivity = findViewById(R.id.btnRegistrationLogInActivity);
        btnRegistrationLogInActivity.setOnClickListener(v -> {

        });
    }

    public LoginData getLoginData() {
        LoginData loginData = new LoginData();
        loginData.setName(editTextName.getEditText().getText().toString());
        loginData.setPassword(editTextPassword.getEditText().getText().toString());
        return loginData;
    }

    @Override
    public void showNameErrorLength() {
        editTextName.setError("Имя слишком короткое");
    }

    @Override
    public void showPasswordError() {
        editTextPassword.setError("Пароль слишком короткий");
    }
}
