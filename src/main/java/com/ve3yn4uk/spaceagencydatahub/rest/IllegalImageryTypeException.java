package com.ve3yn4uk.spaceagencydatahub.rest;

/**
 * Created by 8e3Yn4uK on 24.04.2019
 */

public class IllegalImageryTypeException extends RuntimeException {

    public IllegalImageryTypeException() {
    }

    public IllegalImageryTypeException(String message) {
        super(message);
    }

    public IllegalImageryTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalImageryTypeException(Throwable cause) {
        super(cause);
    }

    public IllegalImageryTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
