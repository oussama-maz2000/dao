package com.lgali.common.enums;


public enum UserType {
    PARTICULAR(0),
    PROFESSIONAL(1);

    private final int code;
    UserType(int code) {
        this.code=code;
    }

    public int getCode() {
        return code;
    }
}
