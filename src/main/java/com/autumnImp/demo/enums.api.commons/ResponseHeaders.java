package com.autumnImp.demo.enums.api.commons;

public enum ResponseHeaders {
    X_RETRY_COUNT("X-RETRY-COUNT"),
    X_RETRY_INTERVAL("X-RETRY-INTERVAL"),
    X_TRANSACTION_ID("X-TRANSACTION-ID"),
    Cache_Control("Cache-Control"),
    X_TRACKING_ID("X-TRACKING-ID");

    private String value;

    ResponseHeaders(String value){
        this.value =value;
    }
    public String getValue(){
        return value;
    }

}
