package com.autumnImp.demo.exceptions.APIStatusExceptions;

public class NoDetailErrorsException extends RuntimeException{
    public NoDetailErrorsException() {
    }

    private NoDetailErrorsException(String var1) {
        super(var1);
    }

    public NoDetailErrorsException(Object var1) {
        this(String.valueOf(var1));
        if (var1 instanceof Throwable) {
            this.initCause((Throwable)var1);
        }

    }

    public NoDetailErrorsException(boolean var1) {
        this(String.valueOf(var1));
    }

    public NoDetailErrorsException(char var1) {
        this(String.valueOf(var1));
    }

    public NoDetailErrorsException(int var1) {
        this(String.valueOf(var1));
    }

    public NoDetailErrorsException(long var1) {
        this(String.valueOf(var1));
    }

    public NoDetailErrorsException(float var1) {
        this(String.valueOf(var1));
    }

    public NoDetailErrorsException(double var1) {
        this(String.valueOf(var1));
    }

    public NoDetailErrorsException(String var1, Throwable var2) {
        super(var1, var2);
    }
}
