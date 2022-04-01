package com.tahoo.common.exception.shared.exception;

import org.springframework.http.HttpStatus;


public class HousingErrors {

    private HousingErrors() {}

    /**
     * 400
     */
    public static final HousingBusinessError INVALID_PARAMETERS = new HousingBusinessError(400004, "Invalid parameters", HttpStatus.BAD_REQUEST);
    public static final HousingBusinessError MAX_FILE_SIZE = new HousingBusinessError(400, "File size exceeded the maximum size", HttpStatus.BAD_REQUEST);
    public static final HousingBusinessError SALE_PIPELINE_NOT_FOUND = new HousingBusinessError(400, "sale pipeline not found", HttpStatus.BAD_REQUEST);
    public static final HousingBusinessError ACCOUNT_NOT_EXIST = new HousingBusinessError(400, "account not exist", HttpStatus.BAD_REQUEST);
    public static final HousingBusinessError CONTACT_NOT_EXIST = new HousingBusinessError(400, "contact not exist", HttpStatus.BAD_REQUEST);
    public static final HousingBusinessError INVALID_PARAMS = new HousingBusinessError(400, "invalid params", HttpStatus.BAD_REQUEST);

    /**
     * 401
     */
    public static final HousingBusinessError USER_NOT_UNAUTHORIZED = new HousingBusinessError(401, "User is unauthorized", HttpStatus.UNAUTHORIZED);

    /**
     * 403
     */
    public static final HousingBusinessError FORBIDDEN_ERROR = new HousingBusinessError(403003, "You don not have any permissions to access this resource", HttpStatus.FORBIDDEN);

    /**
     * 404
     */
    public static final HousingBusinessError STORAGE_OBJECT_NOT_FOUND = new HousingBusinessError(404001, "Storage Object is not found", HttpStatus.NOT_FOUND);
    public static final HousingBusinessError ACCOUNT_NOT_FOUND = new HousingBusinessError(404, "account not found", HttpStatus.NOT_FOUND);
    public static final HousingBusinessError CONTACT_NOT_FOUND = new HousingBusinessError(404, "contact not found", HttpStatus.NOT_FOUND);
    public static final HousingBusinessError CONSTANT_NOT_FOUND = new HousingBusinessError(404, "constant not found", HttpStatus.NOT_FOUND);
    public static final HousingBusinessError CONSTANT_VALUE_DUPLICATED = new HousingBusinessError(400, "constant values duplicated", HttpStatus.BAD_REQUEST);
    public static final HousingBusinessError CONSTANT_KEY_DUPLICATED = new HousingBusinessError(400, "constant keys duplicated", HttpStatus.BAD_REQUEST);
    public static final HousingBusinessError CONSTANT_NAME_DUPLICATED = new HousingBusinessError(400, "constant name duplicated", HttpStatus.BAD_REQUEST);
    public static final HousingBusinessError PROJECT_NOT_FOUND = new HousingBusinessError(404, "project not found", HttpStatus.NOT_FOUND);
    public static final HousingBusinessError PROJECT_NAME_DUPLICATED = new HousingBusinessError(400, "project name duplicated", HttpStatus.BAD_REQUEST);
    public static final HousingBusinessError PROJECT_CODE_DUPLICATED = new HousingBusinessError(400, "project code duplicated", HttpStatus.BAD_REQUEST);
    public static final HousingBusinessError SECTOR_NOT_FOUND = new HousingBusinessError(404, "sector not found", HttpStatus.NOT_FOUND);
    public static final HousingBusinessError SECTOR_NAME_DUPLICATED = new HousingBusinessError(400, "sector name duplicated", HttpStatus.BAD_REQUEST);
    public static final HousingBusinessError SECTOR_CODE_DUPLICATED = new HousingBusinessError(400, "sector code duplicated", HttpStatus.BAD_REQUEST);
    public static final HousingBusinessError SECTOR_HAS_LOCAL_PARK_DUPLICATED = new HousingBusinessError(400, "sector name duplicated", HttpStatus.BAD_REQUEST);
    public static final HousingBusinessError SECTOR_HAS_LAND_SCAPE_HUT_DUPLICATED = new HousingBusinessError(400, "sector name duplicated", HttpStatus.BAD_REQUEST);
    public static final HousingBusinessError SECTOR_QUALITY_INDEXES_DUPLICATED = new HousingBusinessError(400, "sector name duplicated", HttpStatus.BAD_REQUEST);
    public static final HousingBusinessError BLOCK_NOT_FOUND = new HousingBusinessError(404, "block not found", HttpStatus.NOT_FOUND);
    public static final HousingBusinessError BLOCK_NAME_DUPLICATED = new HousingBusinessError(400, "block name duplicated", HttpStatus.BAD_REQUEST);
    public static final HousingBusinessError BLOCK_CODE_DUPLICATED = new HousingBusinessError(400, "block code duplicated", HttpStatus.BAD_REQUEST);

//    public static final HousingBusinessError CONSTANT_VALUE_ID_NOT_FOUND = new HousingBusinessError(400, "constant value id not found", HttpStatus.BAD_REQUEST);


    /**
     * 500
     */
    public static final HousingBusinessError INTERNAL_SERVER_ERROR = new HousingBusinessError(500002, "Internal server error", HttpStatus.INTERNAL_SERVER_ERROR);

}
