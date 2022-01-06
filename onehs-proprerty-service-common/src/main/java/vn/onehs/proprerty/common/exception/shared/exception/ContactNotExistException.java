package vn.onehs.proprerty.common.exception.shared.exception;

public class ContactNotExistException extends HousingException{
    public ContactNotExistException(String message) {
        super(HousingErrors.CONTACT_NOT_EXIST,message);
    }
}
