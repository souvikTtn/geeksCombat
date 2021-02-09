package com.healthyMoves.healthyMoves.controller;

import com.healthyMoves.healthyMoves.dto.ResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@ControllerAdvice
public class ExceptionController extends ResponseEntityExceptionHandler {

    @Autowired
    private MessageSource messageSource;

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        List<String> errorMessageList = ex.getBindingResult().getAllErrors().stream().map((e) -> {
            if (e instanceof FieldError) {
                FieldError fieldError = (FieldError) e;
                return messageSource.getMessage(fieldError, null);
            } else {
                return e.getDefaultMessage();
            }
        }).collect(Collectors.toList());

        log.error("MethodArgumentNotValidException occurred in Web Request: " + request.getDescription(true));

        ResponseDTO responseDTO = new ResponseDTO(false, String.join(
                ",", errorMessageList));
        return ResponseEntity.badRequest().body(responseDTO);
    }
}
