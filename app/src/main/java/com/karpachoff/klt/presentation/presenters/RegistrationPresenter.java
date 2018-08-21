package com.karpachoff.klt.presentation.presenters;

import com.karpachoff.klt.presentation.contract.RegistrationContract;

public class RegistrationPresenter implements RegistrationContract.Presenter {

    RegistrationContract.View view;

    @Override
    public void onClickButtonAddPhoto() {

    }

    @Override
    public void onClickButtonRegistration(String name, String email, String password) {
        validation(name, email, password);
    }

    @Override
    public void attachView(RegistrationContract.View view) {
        this.view = view;
    }

    @Override
    public void detachView() {

    }

    public void validation(String name, String email, String password) {
        if (name.isEmpty()) view.showNameErrorLength();
        if (email.isEmpty()) view.showEmailErrorLength();
            else if (!email.contains("@")) view.showEmailErrorCharacter();
        if (password.length() < 4) view.showPasswordError();
    }
}
