package com.karpachoff.klt.presentation.contract;

import com.karpachoff.klt.domain.entity.models.LoginData;

public interface LoginContract {

    interface View {
        LoginData getLoginData();

        void showPasswordError();

        void showNameErrorLength();
    }

    interface Presenter {
        void onClickButtonForgotPassword();
        void onClickButtonLogin(String email, String password);
        void onClickButtonCreateAccount();
        void attachView(LoginContract.View view);
        void detachView();
    }
}
