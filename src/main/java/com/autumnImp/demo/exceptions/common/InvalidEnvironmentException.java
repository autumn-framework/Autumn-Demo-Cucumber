package com.autumnImp.demo.exceptions.common;

public class InvalidEnvironmentException extends RuntimeException {

    private InvalidEnvironmentException(String var1) {
        super(var1);
    }

    public InvalidEnvironmentException(Object var1) {
        this(String.valueOf(var1));
        if (var1 instanceof Throwable) {
            this.initCause((Throwable)var1);
        }

    }

}
