package com.lgali.common.enums;

public enum StatusRequest {
    PENDING(0),
    SUCCESS(1),
    FAILED(2);

    private final int code;

    StatusRequest(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
