package basePackage;

import com.autumn.jira.generics.JiraGenericFunctions;
import com.autumn.jira.listeners.JiraCucumberListener;
import com.autumn.reporting.generics.ReportingGenericFunctions;
import com.autumn.reporting.listeners.ReportingCucumberListener;
import com.autumn.utils.commonUtil.DateTimeModifierUtil;
import com.autumnImp.demo.global.Constants;
import com.autumnImp.demo.global.LocalConfig;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.autumnImp.demo.global.GlobalData.*;

@Listeners({ReportingCucumberListener.class, JiraCucumberListener.class})
public class DpsSetup {

    @BeforeSuite
    public synchronized void beforeSuite() {
        setServerReportDetails();
        System.out.println("Setting Extent reports configurations");
//        initKlovReporter();
        initExtentReporter();
        initZephyrReporter();
        addExecutionDetails_ExtentReport();
        initLog4j();
    }

    @Before(order = 0)
    public void beforeAa3(Scenario scenario) {
        System.out.println("Running Scenario is :" + scenario.getName());
        System.out.println("Running Scenario Id is :" + scenario.getId());
        System.out.println("Running thread id is :" + Thread.currentThread().getId());
    }

    @AfterSuite
    public synchronized void afterSuite() {
        System.out.println("This is after suite of testNG");
        initAPIPerfReporter();
        initEmailReport();
        initMicrosoftTeamsNotification();
        initSlackNotification();
    }

    public synchronized void initEmailReport() {
        if (Constants.JENKINSRUN) {
            ReportingGenericFunctions.setSMTPDetails_Email(SMTP_HOST, SMTP_PORT, SENDER_EMAIL_ID, SENDER_EMAIL_PASSWORD, SENDMAILTOGROUP);
            ReportingGenericFunctions.initEmailReport(REPORT_TITLE, LocalConfig.ENVIRONMENT, EMAIL_REPORT_TITLE, "", "");
        }
    }

    public synchronized void initExtentReporter() {
        ReportingGenericFunctions.initExtentReporter(Constants.FLAG_REMOVE_RETRIEDTESTS, Constants.FLAG_UPDATE_SCREENSHOTS, FILE_NAME_REPORT, REPORT_TITLE);
    }

    public synchronized void initKlovReporter() {
        if(Constants.JENKINSRUN) {
            ReportingGenericFunctions.initKlovReporter(REPORT_TITLE, KLOV_SERVER_URL, KLOV_MONGO_DB_IP, KLOV_MONGO_DB_PORT);
        }
    }

    public synchronized void initAPIPerfReporter() {
        ReportingGenericFunctions.initAPIPerfReporter(PERF_REPORT_FILE_NAME,PERF_REPORT_TITLE);
    }

    public synchronized void initLog4j(){
        ReportingGenericFunctions.initLogger("loggerFile");
    }

    public synchronized void addExecutionDetails_ExtentReport() {
        Map<String, String> addSystemInfo = new LinkedHashMap<>();
        addSystemInfo.put("Environment", LocalConfig.ENVIRONMENT);
        addSystemInfo.put("ExecutionType", Constants.SUITETYPE);
        if (!Constants.SUITETYPE.equalsIgnoreCase("System"))
            addSystemInfo.put("Groups", Constants.Tag);
        ReportingGenericFunctions.addExecutionDetails(addSystemInfo);
    }

    @After(order = 0)
    public void after(Scenario scenario) {
        System.out.println("This is after scenario hook");
    }

    public synchronized void setServerReportDetails() {
        if (Constants.JENKINSRUN) {
            ReportingGenericFunctions.setReportLoc(REPORT_FOLDER_NAME, JENKINS_REPORT_LOC, REPORT_SERVER_IP);
        }else{
            ReportingGenericFunctions.setReportLoc(REPORT_FOLDER_NAME, OUTPUT_FOLDER_REPORT, null);
        }
    }

    public synchronized void initZephyrReporter() {
        try {
            if (Constants.FLAG_UPDATE_ZEPHYR) {
                JiraGenericFunctions.setJiraDetails(JIRA_URL, JIRA_USER_NAME, JIRA_PASSWORD, JIRA_PROJECT_NAME);
//                JiraGenericFunctions.setMongoZephyrTCDBDetails(QA_MONGODB_URL,ZEPHYR_TC_MAPPING_COLLECTION);
                String JIRA_RELEASE_NAME = "v1";
                String JIRA_NEW_CYCLE_NAME = JIRA_NEW_CYCLE_NAME_PREFIX + DateTimeModifierUtil.getInstance().getCurrentDateTime("yyyy-MM-dd");
                JiraGenericFunctions.initZephyrReporter(JIRA_RELEASE_NAME, JIRA_TEST_REPO_RELEASE_NAME, JIRA_TEST_REPO_CYCLE_NAME, JIRA_NEW_CYCLE_NAME);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public synchronized void initMicrosoftTeamsNotification() {
        if (Constants.JENKINSRUN) {
            ReportingGenericFunctions.initMicrosoftTeamsNotification(LocalConfig.MICROSOFT_TEAMS_URI, LocalConfig.ENVIRONMENT, "RDK" + " Test Results");
        }
    }

    public synchronized void initSlackNotification() {
        if (Constants.JENKINSRUN) {
            ReportingGenericFunctions.initSlackNotification(LocalConfig.SLACK_URL, LocalConfig.ENVIRONMENT, "Test Results");
        }
    }


}
