package Utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.WebDriver;
import Test.BaseTest;
import Utilities.ScreenshotUtililty;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportManager implements ITestListener {

    // Create ExtentReports instance
    ExtentReports extent = new ExtentReports();
    ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");
    {
        extent.attachReporter(spark);
    }

    ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        // Show failure reason
        test.fail(result.getThrowable());

        // Take screenshot and embed inline
        WebDriver driver = BaseTest.driver; // use static driver
        String base64 = ScreenshotUtililty.captureBase64(driver);

        try {
            test.fail("Screenshot on failure",
                MediaEntityBuilder.createScreenCaptureFromBase64String(base64).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onFinish(org.testng.ITestContext context) {
        extent.flush(); // Write the report to HTML
    }
}