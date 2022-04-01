package com.tahoo.common.exception.shared.exception;


public class AccountNotFoundException extends HousingException{

    public AccountNotFoundException(String message) {
        super(HousingErrors.ACCOUNT_NOT_FOUND,message);
    }
}
