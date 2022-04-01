package com.tahoo.common.exception.shared.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class HousingBusinessError {
    private int code;
    private String message;
    private HttpStatus httpStatus;

    public HousingBusinessError(String resource){
        this.code = 404;
        this.message = resource +" is not found";
        this.httpStatus = HttpStatus.NOT_FOUND;
    }
}
