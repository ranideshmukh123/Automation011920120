package TestNGAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automobile extends BaseClass {
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before test Automobile");
	}
	
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After test Automobie");
	}
	
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before class Automobile");
	}
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class Automobie");
	}
	
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before method Automobile");
	}
	
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After Method Automobie");
	}
	
	
	
	//******************************
	
	@Test(dependsOnMethods= {"login","verifyhomepage"})
	
	
	public void logout()
	
	{
		System.out.println("TestCase1");
		
		
		
	}
	

	
@Test(dependsOnMethods= {"login"})
	
	public void verifyhomepage()
	
	{
		System.out.println("TestCase2");
		
				
	}

@Test(priority=0)

public void login()

{
	System.out.println("TestCase3");
	
	System.out.println(10/0);

	
}


}
