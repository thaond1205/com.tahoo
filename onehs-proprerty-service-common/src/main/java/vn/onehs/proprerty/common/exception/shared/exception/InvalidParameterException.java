package vn.onehs.proprerty.common.exception.shared.exception;

public class InvalidParameterException extends HousingException{
    public InvalidParameterException(String message) {
        super(HousingErrors.INVALID_PARAMETERS,message);
    }
}
