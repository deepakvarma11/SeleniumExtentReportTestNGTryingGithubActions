package Utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    ExtentReportManager extentReportManager;

    public void onStart(ITestContext context) {
        extentReportManager = new ExtentReportManager();
        extentReportManager.startReport();
    }

    public void onTestSuccess(ITestResult result) {
        extentReportManager.onSuccess(result);
    }

    public void onTestFailure(ITestResult result) {
        extentReportManager.onFailure(result);
    }

    public void onFinish(ITestContext context) {
        extentReportManager.flushReport();
    }
}
