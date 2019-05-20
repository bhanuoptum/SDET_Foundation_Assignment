package assignment_Question2;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNG_Listeners implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On Test Start");
		}
	
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On Success " + result.getName());
	}
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On Failure " + result.getStatus());
	}
	
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On Skipped " + result.getTestName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On Test failed but within success % " + result.getInstanceName());
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("On Start " + context.getName());
	}
	
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("On Finish "+ context.getName());
	}
	
}