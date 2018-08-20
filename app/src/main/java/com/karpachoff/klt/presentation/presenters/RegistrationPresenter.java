package com.karpachoff.klt.presentation.presenters;

import com.karpachoff.klt.presentation.contract.RegistrationContract;

public class RegistrationPresenter implements RegistrationContract.Presenter {

    RegistrationContract.View registrationActivity;

    public RegistrationPresenter (RegistrationContract.View registrationActivity) {
        this.registrationActivity = registrationActivity;
    }

    @Override
    public void onClickButtonAddPhoto() {

    }

    @Override
    public void onClickButtonRegistration(String name, String email, String password) {
        validation(name, email, password);
    }

    public void validation(String name, String email, String password) {
        if (name.isEmpty()) registrationActivity.showNameErrorLength();
        if (email.isEmpty()) registrationActivity.showEmailErrorLength();
            else if (!email.contains("@")) registrationActivity.showEmailErrorCharacter();
        if (password.length() < 4) registrationActivity.showPasswordError();
    }
}
