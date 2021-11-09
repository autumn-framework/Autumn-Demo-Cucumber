package com.autumnImp.demo.exceptions.common;

public class InvalidRequestContentException extends RuntimeException {

    private InvalidRequestContentException(String var1) {
        super(var1);
    }

    public InvalidRequestContentException(Object var1) {
        this(String.valueOf(var1));
        if (var1 instanceof Throwable) {
            this.initCause((Throwable)var1);
        }

    }

}
