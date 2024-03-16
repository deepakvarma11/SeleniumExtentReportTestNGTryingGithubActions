package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestResult;

public class ExtentReportManager {

    private ExtentReports extentReports;
    private ExtentSparkReporter extentSparkReporter;
    private ExtentTest extentTest;


    public void startReport() {
        extentReports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter("target/extentReport/Spark.html");
        extentReports.attachReporter(extentSparkReporter);
        extentSparkReporter.config().setReportName("TestNG extent report");
        extentSparkReporter.config().setTheme(Theme.STANDARD);
    }

    public void onSuccess(ITestResult result) {
        extentTest = extentReports.createTest(result.getName());
        extentTest.log(Status.PASS, MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
    }

    public void onFailure(ITestResult result) {
        extentTest = extentReports.createTest(result.getName());
        extentTest.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
    }

    public void flushReport(){
        extentReports.flush();
    }

}
