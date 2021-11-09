package com.autumnImp.demo.dataManager;


import java.util.*;

public class TestDataManager {

    private static TestDataManager instance;

    private static LinkedHashMap<String, Integer> dataproviderCount = new LinkedHashMap<>();
    private static ThreadLocal<String> methodNameThread = new ThreadLocal<>();

    public static TestDataManager getInstance() {
        if (instance == null) {
            synchronized (TestDataManager.class) {
                if (instance == null) {
                    instance = new TestDataManager();
                }
            }
        }
        return instance;
    }

    public String getMethodNameThread() {
        return methodNameThread.get();
    }

    public void setMethodNameThread(String methodName) {
        methodNameThread.set(methodName);
    }

}

