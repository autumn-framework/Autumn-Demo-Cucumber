package com.autumnImp.demo.exceptions.common;

public class InvalidTokenException extends RuntimeException {

    private InvalidTokenException(String var1) {
        super(var1);
    }

    public InvalidTokenException(Object var1) {
        this(String.valueOf(var1));
        if (var1 instanceof Throwable) {
            this.initCause((Throwable)var1);
        }

    }

}
