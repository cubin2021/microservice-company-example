package com.cmc.ciber.model;

public enum ErrorCodeMapper {
    SUCCESS("200", "Thành công", "SUCC"),
    FAIL("500","Thất bại", "FAIL")
    ;

    private final String errorCode;

    private final String message;

    private final String status;

    ErrorCodeMapper(String errorCode, String message, String status) {
        this.errorCode = errorCode;
        this.message = message;
        this.status = status;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }
}
