package com.autumnImp.demo.exceptions.APIStatusExceptions.FieldDetails;


import com.autumnImp.demo.exceptions.APIStatusExceptions.BasicAssertException;

public class FieldMessageException extends BasicAssertException {

    public FieldMessageException() {
    }

    private FieldMessageException(String var1) {
        super(var1);
    }

    public FieldMessageException(Object var1) {
        this(String.valueOf(var1));
        if (var1 instanceof Throwable) {
            this.initCause((Throwable)var1);
        }

    }

    public FieldMessageException(boolean var1) {
        this(String.valueOf(var1));
    }

    public FieldMessageException(char var1) {
        this(String.valueOf(var1));
    }

    public FieldMessageException(int var1) {
        this(String.valueOf(var1));
    }

    public FieldMessageException(long var1) {
        this(String.valueOf(var1));
    }

    public FieldMessageException(float var1) {
        this(String.valueOf(var1));
    }

    public FieldMessageException(double var1) {
        this(String.valueOf(var1));
    }

    public FieldMessageException(String var1, Throwable var2) {
        super(var1, var2);
    }


}
