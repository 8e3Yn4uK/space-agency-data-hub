package com.ve3yn4uk.spaceagencydatahub.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by 8e3Yn4uK on 23.04.2019
 */

@ControllerAdvice
public class CustomRestExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<CustomErrorResponse> handleException(MissionNotFoundException exc){

        CustomErrorResponse error = new CustomErrorResponse(HttpStatus.NOT_FOUND.value(),
                                                                exc.getMessage(), System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<CustomErrorResponse> handleException(IllegalImageryTypeException exc){

        CustomErrorResponse error = new CustomErrorResponse(HttpStatus.NOT_ACCEPTABLE.value(),
                exc.getMessage(), System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_ACCEPTABLE);
    }

    @ExceptionHandler
    public ResponseEntity<CustomErrorResponse> handleException(Exception exc){

        CustomErrorResponse error = new CustomErrorResponse(HttpStatus.BAD_REQUEST.value(),
                exc.getMessage(), System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }




}
