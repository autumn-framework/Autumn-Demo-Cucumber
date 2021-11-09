package com.autumnImp.demo.exceptions.common;

public class TokenNotVerifiedException extends RuntimeException {

    private TokenNotVerifiedException(String var1) {
        super(var1);
    }

    public TokenNotVerifiedException(Object var1) {
        this(String.valueOf(var1));
        if (var1 instanceof Throwable) {
            this.initCause((Throwable)var1);
        }

    }

}
