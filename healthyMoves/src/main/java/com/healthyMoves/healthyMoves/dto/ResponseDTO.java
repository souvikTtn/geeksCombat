package com.healthyMoves.healthyMoves.dto;

import org.springframework.util.StringUtils;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;


@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ResponseDTO<T> {

    Boolean status = true;
    String message;
    T data;

    Long count;

    public ResponseDTO() {
    }

    public ResponseDTO(Boolean status, String message) {
        this.status = status;
        this.message = message;
    }

    public ResponseDTO(Boolean status, String message, T data, Object error) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public ResponseDTO(Boolean status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }


    public ResponseDTO(Boolean status, String message, T data, Long count) {
        this.status = status;
        this.message = message;
        this.data = data;
        this.count = count;
    }


    void setErrorResponse(Throwable e, String message) {
        this.message = StringUtils.isEmpty(message)
                       ? e.getMessage()
                       : message;
        this.status = false;
    }

    public void setFailureResponse(String message) {
        this.message = message;
        this.status = false;
    }

    public void setSuccessResponse(T data, String message) {
        this.message = message;
        this.data = data;
        this.status = true;
    }

}
