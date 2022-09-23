package Listeners;

import org.testng.ITestNGListener;
import org.testng.ITestContext;
import org.testng.ITestResult;


public class TestNGListeners implements ITestNGListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println("******Test Started******" +result.getName());
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("******Test Successful******" +result.getName());
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("******Test Failed******" +result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("******Test SKipped******" +result.getName());
	}
	
	public void onStart(ITestContext context) {
		System.out.println("******Test is Started******" +context.getName());
	}
	public void onFinish(ITestContext context) {
		System.out.println("******Test Completed******" +context.getName());
	}
}
