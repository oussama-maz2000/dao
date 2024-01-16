package com.lgali.common.exception;


public class GlobalException extends Exception{

    public GlobalException(final String message,final Throwable cause){
        super(message,cause);
    }

    public GlobalException(final String message){
        super(message);
    }
}
