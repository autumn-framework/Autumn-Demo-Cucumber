package com.autumnImp.demo.global;

public class Constants {

    public static final Boolean JENKINSRUN = Boolean.parseBoolean(System.getProperty("JenkinsRun", "false"));

    //Values for now are regression, sanity, smoke
    public static final String TESTTYPE = System.getProperty("TestingType","sanity");

    public static final String Tag=System.getProperty("Tag","sanity");
    //Values can be methods, system, package, group, class
    public static final String SUITETYPE = System.getProperty("suiteType","group");
    public static final boolean FLAG_REMOVE_RETRIEDTESTS = true;
    public static final boolean FLAG_UPDATE_ZEPHYR = Boolean.parseBoolean(System.getProperty("ZEPHYR","false"));
    public static final boolean FLAG_UPDATE_SCREENSHOTS = false;

}
