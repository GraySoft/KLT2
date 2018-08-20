package com.karpachoff.klt.presentation.contract;

import com.karpachoff.klt.R;
import com.karpachoff.klt.domain.entity.models.*;
public interface LoginContract {

    interface View {
        LoginData getLoginData();
        void showErrorName();
        void showErrorPassword();
        void cleanErrors();
    }

    interface Presenter {
        void attachView(View view);
        void onClickButtonLogin();
    }

}
