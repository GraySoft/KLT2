package com.karpachoff.klt.presentation.presenters;

import com.karpachoff.klt.presentation.contract.RestorePasswordContract;

public class RestorePasswordPresenter implements RestorePasswordContract.Presenter {

    RestorePasswordContract.View view;

    @Override
    public void onClickButtonLogin(String email) {
        validation(email);
    }

    @Override
    public void attachView(RestorePasswordContract.View view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        view = null;
    }

    public void validation(String email) {
        if (email.isEmpty()) view.showEmailErrorLength();
        else if (!email.contains("@")) view.showEmailErrorCharacter();
    }
}
