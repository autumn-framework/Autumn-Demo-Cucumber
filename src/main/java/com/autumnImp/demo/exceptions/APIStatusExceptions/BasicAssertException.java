package com.autumnImp.demo.exceptions.APIStatusExceptions;

public class BasicAssertException extends AssertionError {

    public BasicAssertException() {
    }

    private BasicAssertException(String var1) {
        super(var1);
    }

    public BasicAssertException(Object var1) {
        this(String.valueOf(var1));
        if (var1 instanceof Throwable) {
            this.initCause((Throwable)var1);
        }

    }

    public BasicAssertException(boolean var1) {
        this(String.valueOf(var1));
    }

    public BasicAssertException(char var1) {
        this(String.valueOf(var1));
    }

    public BasicAssertException(int var1) {
        this(String.valueOf(var1));
    }

    public BasicAssertException(long var1) {
        this(String.valueOf(var1));
    }

    public BasicAssertException(float var1) {
        this(String.valueOf(var1));
    }

    public BasicAssertException(double var1) {
        this(String.valueOf(var1));
    }

    public BasicAssertException(String var1, Throwable var2) {
        super(var1, var2);
    }


}
