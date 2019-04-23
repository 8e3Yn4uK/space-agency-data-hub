package com.ve3yn4uk.spaceagencydatahub.rest;

/**
 * Created by 8e3Yn4uK on 23.04.2019
 */

public class MissionNotFoundException extends RuntimeException {

    public MissionNotFoundException() {
    }

    public MissionNotFoundException(String message) {
        super(message);
    }

    public MissionNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public MissionNotFoundException(Throwable cause) {
        super(cause);
    }

    public MissionNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
