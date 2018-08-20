package com.karpachoff.klt.domain.exception;

import android.support.annotation.StringRes;

public class SimpleException extends RuntimeException{
    protected @StringRes int textResId;
    protected String text;
}
