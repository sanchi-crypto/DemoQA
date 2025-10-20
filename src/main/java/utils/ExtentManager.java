package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
            ExtentSparkReporter reporter = new ExtentSparkReporter("reports/ExtentReport.html");
            reporter.config().setReportName("DemoQA Automation Report");
            reporter.config().setDocumentTitle("Automation Execution Results");

            extent = new ExtentReports();
            extent.attachReporter(reporter);
            extent.setSystemInfo("Project", "DemoQA Login Test");
            extent.setSystemInfo("Tester", "Sanchi Chawla");
            extent.setSystemInfo("Environment", "QA");
        }
        return extent;
    }
}