package day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {
	public void onStart(ITestContext context) {
System.out.println("Test execution started...");
	}

	public void onTestStart(ITestResult result) {
		System.out.println("Test started...");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passes..");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed...");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped..");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test Finished...");
	}
}
