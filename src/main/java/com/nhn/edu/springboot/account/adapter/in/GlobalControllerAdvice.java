package com.nhn.edu.springboot.account.adapter.in;

import com.nhn.edu.springboot.account.domain.AccountAlreadyExistException;
import com.nhn.edu.springboot.account.domain.AccountNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalControllerAdvice {
    @ExceptionHandler(AccountNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public CommonResponse handleException(AccountNotFoundException exception) {
        return new CommonResponse("FAILED");
    }


    @ExceptionHandler(AccountAlreadyExistException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public CommonResponse handleException(AccountAlreadyExistException exception) {
        return new CommonResponse("FAILED");
    }
}
