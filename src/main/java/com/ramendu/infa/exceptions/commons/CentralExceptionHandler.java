package com.ramendu.infa.exceptions.commons;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import java.util.Date;

@ControllerAdvice
public class CentralExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers,
                                                                  HttpStatus status,
                                                                  WebRequest request) {
        return new ResponseEntity<>(ExceptionResponse.builder()
                .timeStamp(new Date())
                .message("Validation Failed")
                .details(ex.getBindingResult().toString())
                .build(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExceptions(Exception ex,
                                                            WebRequest webRequest) {
        return new ResponseEntity<>(ExceptionResponse.builder()
                .timeStamp(new Date())
                .message(ex.getMessage())
                .details(webRequest.getDescription(false))
                .build(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}