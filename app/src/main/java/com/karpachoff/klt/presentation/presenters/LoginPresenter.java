package com.karpachoff.klt.presentation.presenters;

import com.karpachoff.klt.presentation.contract.LoginContract;
import com.karpachoff.klt.presentation.views.activities.LoginActivity;

public class LoginPresenter implements LoginContract.Presenter {
    LoginContract.View view;

    @Override
    public void onClickButtonForgotPassword() {

    }

    @Override
    public void onClickButtonLogin(String name, String password) {
        validation(name, password);
    }

    @Override
    public void onClickButtonCreateAccount() {
    }

    @Override
    public void attachView(LoginContract.View view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        view = null;
    }

    public void validation(String name, String password) {
        if (name.isEmpty()) {
            view.showNameErrorLength();
        }
        if (password.length() < 4) {
            view.showPasswordError();
        }
    }
}
