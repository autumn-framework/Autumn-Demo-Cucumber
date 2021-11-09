package com.autumnImp.demo.exceptions.APIStatusExceptions;

public class ErrorCodeException extends BasicAssertException {

    public ErrorCodeException() {
    }

    private ErrorCodeException(String var1) {
        super(var1);
    }

    public ErrorCodeException(Object var1) {
        this(String.valueOf(var1));
        if (var1 instanceof Throwable) {
            this.initCause((Throwable)var1);
        }

    }

    public ErrorCodeException(boolean var1) {
        this(String.valueOf(var1));
    }

    public ErrorCodeException(char var1) {
        this(String.valueOf(var1));
    }

    public ErrorCodeException(int var1) {
        this(String.valueOf(var1));
    }

    public ErrorCodeException(long var1) {
        this(String.valueOf(var1));
    }

    public ErrorCodeException(float var1) {
        this(String.valueOf(var1));
    }

    public ErrorCodeException(double var1) {
        this(String.valueOf(var1));
    }

    public ErrorCodeException(String var1, Throwable var2) {
        super(var1, var2);
    }


}
