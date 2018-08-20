package com.karpachoff.klt.presentation.presenters;

import com.karpachoff.klt.presentation.contract.LoginContract;
import com.karpachoff.klt.presentation.views.activities.LoginActivity;

public class LoginPresenter implements LoginContract.Presenter {
    LoginContract.View loginActivity;

    public LoginPresenter(LoginActivity loginActivity) {
        this.loginActivity = loginActivity;
    }

    @Override
    public void onClickButtonForgotPassword() {

    }

    @Override
    public void onClickButtonLogin(String email, String password) {
        validation(email, password);
    }

    @Override
    public void onClickButtonCreateAccount() {
    }

    public void validation(String email, String password) {
        if (email.isEmpty()) {
            loginActivity.showNameErrorLength();
        } else if (!email.contains("@")) {
            loginActivity.showNameErrorCharacter();
        }
        if (password.length() < 4) {
            loginActivity.showPasswordError();
        }
    }
}
