package com.tahoo.common.exception.shared.exception;

public class AccountNotExistException extends HousingException {
    public AccountNotExistException(String message) {
        super(HousingErrors.ACCOUNT_NOT_EXIST, message);
    }
}
