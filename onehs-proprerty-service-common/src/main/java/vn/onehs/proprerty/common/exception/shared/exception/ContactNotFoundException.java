package vn.onehs.proprerty.common.exception.shared.exception;


public class ContactNotFoundException extends HousingException{

    public ContactNotFoundException(String message) {
        super(HousingErrors.CONTACT_NOT_FOUND,message);
    }
}
