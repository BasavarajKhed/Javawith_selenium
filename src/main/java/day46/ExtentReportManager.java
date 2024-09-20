package day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {
	public ExtentSparkReporter sparkReporter; // UI of the report
	public ExtentReports extent; // populate comman information of the report
	public ExtentTest test; // creating test case entries in the report and update status of the test methods
							

	public void onStart(ITestContext context) {
		sparkReporter = new ExtentSparkReporter(System.getenv("user.dir")+"/reports/myReport.html");
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("Functional testing");
		sparkReporter.config().setTheme(Theme.DARK);
		
		
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		
		extent.setSystemInfo("Computer Name ", "localhost");
		extent.setSystemInfo("Environment", "SIT");
		extent.setSystemInfo("Tester Name ", "Basavaraj");
		extent.setSystemInfo("os", "Windows");
		extent.setSystemInfo("Browser Name ", "Chrome");

	}

	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.PASS, "Test case Failed is : " + result.getName());

	}

	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case Failed is : " + result.getName());
		test.log(Status.FAIL, "Test case Failed cause is :" + result.getThrowable());
	}

	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case Skipped is : " + result.getName());
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}

}
