package com.tahoo.common.exception.shared.exception;


public class ConstantNotFoundException extends HousingException {

    public ConstantNotFoundException(String message) {
        super(HousingErrors.CONSTANT_NOT_FOUND, message);
    }
}
