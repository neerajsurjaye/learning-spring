package com.sepc.rest_controller.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException studentNotFoundException){
        StudentErrorResponse ser = new StudentErrorResponse();
        ser.setMessage(studentNotFoundException.getMessage());
        ser.setStatus(HttpStatus.NOT_FOUND.value());
        ser.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(ser, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception exception){
        StudentErrorResponse ser = new StudentErrorResponse();
        ser.setMessage(exception.getMessage());
        ser.setStatus(HttpStatus.BAD_REQUEST.value());
        ser.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(ser, HttpStatus.BAD_REQUEST);
    }

}
