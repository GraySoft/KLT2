package com.karpachoff.klt.presentation.contract;


public interface RestorePasswordContract {

    interface View {
        void showEmailErrorLength();
        void showEmailErrorCharacter();
    }

    interface Presenter {
        void onClickButtonLogin(String email);
        void attachView(RestorePasswordContract.View view);
        void detachView();
    }
}
