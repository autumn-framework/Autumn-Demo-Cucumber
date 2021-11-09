package com.autumnImp.demo.global;

public class GlobalData {


    public static final String FILE_NAME_REPORT = "Cucumber";
    public static final String OUTPUT_FOLDER_REPORT = "reports/";
    public static final String REPORT_TITLE = "API Automation";

    //Zephyr Details
    public static final String JIRA_URL="https://jira.com/rest/";
    public static final String JIRA_USER_NAME="JIRA_USER_NAME";
    public static final String JIRA_PASSWORD="JIRA_PASSWORD";
    public static final String JIRA_PROJECT_NAME="JIRA_PROJECT_NAME";
    public static final String JIRA_TEST_REPO_RELEASE_NAME = "JIRA_TEST_REPO_RELEASE_NAME";
    public static final String JIRA_TEST_REPO_CYCLE_NAME = "JIRA_TEST_REPO_CYCLE_NAME";
    public static final String JIRA_NEW_CYCLE_NAME_PREFIX = "JIRA_NEW_CYCLE_NAME_PREFIX";

    //Jenkins Server Details
    public static final String REPORT_FOLDER_NAME = "AUTOMATION_REPORT";
    public static final String JENKINS_REPORT_LOC = "/var/lib/jenkins/automation-reports/";
    public static final String REPORT_SERVER_IP = "http://testing.test.com/server/";

    //Klov Reporter
    public static final String KLOV_SERVER_URL = "http://klov-report.url.com/";
    public static final String KLOV_MONGO_DB_IP = "KLOV_MONGO_DB_IP";
    public static final int KLOV_MONGO_DB_PORT = 12345;

    //Email Report
    public static final String SENDER_EMAIL_ID = "SENDER_EMAIL_ID";
    public static final String SENDER_EMAIL_PASSWORD = "SENDER_EMAIL_PASSWORD";
    public static final String SMTP_HOST = "smtp.gmail.com";
    //public static final String SMTP_HOST = "smtp.office365.com";
    public static final String SMTP_PORT = "587";
    public static final String SENDMAILTOGROUP= System.getProperty("SendEmailToGroup", "SENDMAILTOGROUP");
    public static final String EMAIL_REPORT_TITLE="API Automation";

    //API perf report details
    public static final String PERF_REPORT_TITLE="API Performance Report";
    public static final String PERF_REPORT_FILE_NAME="APIPerformance";



}