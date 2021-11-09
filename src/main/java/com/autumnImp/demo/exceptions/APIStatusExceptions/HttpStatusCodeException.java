package com.autumnImp.demo.exceptions.APIStatusExceptions;

public class HttpStatusCodeException extends BasicAssertException {

    public HttpStatusCodeException() {
    }

    private HttpStatusCodeException(String var1) {
        super(var1);
    }

    public HttpStatusCodeException(Object var1) {
        this(String.valueOf(var1));
        if (var1 instanceof Throwable) {
            this.initCause((Throwable)var1);
        }

    }

    public HttpStatusCodeException(boolean var1) {
        this(String.valueOf(var1));
    }

    public HttpStatusCodeException(char var1) {
        this(String.valueOf(var1));
    }

    public HttpStatusCodeException(int var1) {
        this(String.valueOf(var1));
    }

    public HttpStatusCodeException(long var1) {
        this(String.valueOf(var1));
    }

    public HttpStatusCodeException(float var1) {
        this(String.valueOf(var1));
    }

    public HttpStatusCodeException(double var1) {
        this(String.valueOf(var1));
    }

    public HttpStatusCodeException(String var1, Throwable var2) {
        super(var1, var2);
    }


}
