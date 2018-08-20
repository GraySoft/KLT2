package com.karpachoff.klt.presentation.presenters;

import com.karpachoff.klt.presentation.contract.RestorePasswordContract;

public class RestorePasswordPresenter implements RestorePasswordContract.Presenter {

    RestorePasswordContract.View restorePasswordActivity;

    public RestorePasswordPresenter(RestorePasswordContract.View restorePasswordActivity) {
        this.restorePasswordActivity = restorePasswordActivity;
    }

    @Override
    public void onClickButtonLogin(String email) {
        validation(email);
    }

    public void validation(String email) {
        if (email.isEmpty()) restorePasswordActivity.showEmailErrorLength();
        else if (!email.contains("@")) restorePasswordActivity.showEmailErrorCharacter();
    }
}
