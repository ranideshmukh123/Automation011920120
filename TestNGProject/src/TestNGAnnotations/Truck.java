package TestNGAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Truck extends BaseClass{
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before test Truck");
	}
	
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After test Truck");
	}
	
	
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before class Truck");
	}
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class Truck");
	}
	
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before method Truck");
	}
	
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After Method Truck");
	}
	
	
	
	
	
	@Test
	public void Test1()
	{
		System.out.println("Second test class test case 1");
	}
	
	
	
	@Test
	public void Test2()
	{
		System.out.println("Second test class test case 2");
	}
	
	
	
	
	@Test
	public void Test3()
	{
		System.out.println("Second test class test case 3");
	}
	
	
	

}
