package com.autumnImp.demo.exceptions.APIStatusExceptions;

public class MessageException extends BasicAssertException {

    public MessageException() {
    }

    private MessageException(String var1) {
        super(var1);
    }

    public MessageException(Object var1) {
        this(String.valueOf(var1));
        if (var1 instanceof Throwable) {
            this.initCause((Throwable)var1);
        }

    }

    public MessageException(boolean var1) {
        this(String.valueOf(var1));
    }

    public MessageException(char var1) {
        this(String.valueOf(var1));
    }

    public MessageException(int var1) {
        this(String.valueOf(var1));
    }

    public MessageException(long var1) {
        this(String.valueOf(var1));
    }

    public MessageException(float var1) {
        this(String.valueOf(var1));
    }

    public MessageException(double var1) {
        this(String.valueOf(var1));
    }

    public MessageException(String var1, Throwable var2) {
        super(var1, var2);
    }


}
