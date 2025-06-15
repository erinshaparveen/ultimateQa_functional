package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    public static ExtentReports extent;

    public static ExtentReports getReportInstance() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("reports/ExtentReports.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);
        return extent;
    }
}
