package com.autumnImp.demo.exceptions.APIStatusExceptions.FieldDetails;


import com.autumnImp.demo.exceptions.APIStatusExceptions.BasicAssertException;

public class FieldNameException extends BasicAssertException {

    public FieldNameException() {
    }

    private FieldNameException(String var1) {
        super(var1);
    }

    public FieldNameException(Object var1) {
        this(String.valueOf(var1));
        if (var1 instanceof Throwable) {
            this.initCause((Throwable)var1);
        }

    }

    public FieldNameException(boolean var1) {
        this(String.valueOf(var1));
    }

    public FieldNameException(char var1) {
        this(String.valueOf(var1));
    }

    public FieldNameException(int var1) {
        this(String.valueOf(var1));
    }

    public FieldNameException(long var1) {
        this(String.valueOf(var1));
    }

    public FieldNameException(float var1) {
        this(String.valueOf(var1));
    }

    public FieldNameException(double var1) {
        this(String.valueOf(var1));
    }

    public FieldNameException(String var1, Throwable var2) {
        super(var1, var2);
    }


}
