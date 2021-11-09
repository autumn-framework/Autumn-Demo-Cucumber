package com.autumnImp.demo.exceptions.APIStatusExceptions;

public class ErrorMessageException extends BasicAssertException {

    public ErrorMessageException() {
    }

    private ErrorMessageException(String var1) {
        super(var1);
    }

    public ErrorMessageException(Object var1) {
        this(String.valueOf(var1));
        if (var1 instanceof Throwable) {
            this.initCause((Throwable)var1);
        }

    }

    public ErrorMessageException(boolean var1) {
        this(String.valueOf(var1));
    }

    public ErrorMessageException(char var1) {
        this(String.valueOf(var1));
    }

    public ErrorMessageException(int var1) {
        this(String.valueOf(var1));
    }

    public ErrorMessageException(long var1) {
        this(String.valueOf(var1));
    }

    public ErrorMessageException(float var1) {
        this(String.valueOf(var1));
    }

    public ErrorMessageException(double var1) {
        this(String.valueOf(var1));
    }

    public ErrorMessageException(String var1, Throwable var2) {
        super(var1, var2);
    }


}
