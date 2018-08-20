package com.karpachoff.klt.presentation.contract;

public interface LoginContract {

    interface View {
        void getLoginData();
    }

    interface Presenter {
        void onClickButtonForgotPassword();
        void onClickButtonLogin();
        void onClcikButtonCreateAccount();
    }

}
