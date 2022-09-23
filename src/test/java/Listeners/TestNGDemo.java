package Listeners;
import org.testng.annotations.Test;


import static org.testng.Assert.assertTrue;

import org.testng.SkipException;
import org.testng.annotations.Listeners;

//@Listeners(TestNGListeners.class)
public class TestNGDemo {
	
	@Test
	public void test1()
	{
		System.out.println("Inside Test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Inside Test2");
		assertTrue(false);
	}

	@Test
	public void test3()
	{
		System.out.println("Inside Test3");
		throw new SkipException("THis is skipped");
	}

}
