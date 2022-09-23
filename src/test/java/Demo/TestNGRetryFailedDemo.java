package Demo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Listeners.RetryAnalyzer;

public class TestNGRetryFailedDemo {
	
	@Test
	public void test1()
	{
		System.out.println("Inside Test1");
	}
	
	@Test
	public void test2()
	{
		int i=1/0;
		System.out.println("Inside Test2");
	}
	
	@Test(retryAnalyzer =RetryAnalyzer.class)
	public void test3()
	{
		Assert.assertTrue(false);
		System.out.println("Inside Test3");
	}
}
