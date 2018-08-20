package com.karpachoff.klt.presentation.contract;

public interface RegistrationContract {

    interface View {
        void showNameErrorLength();

        void showEmailErrorLength();
        void showEmailErrorCharacter();

        void showPasswordError();
    }

    interface Presenter {
        void onClickButtonAddPhoto();
        void onClickButtonRegistration(String name, String email, String password);
    }
}
