package TestNGAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleIFramework {
	
	@Test
	
	public void test1() throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();   //constructor
		
		
		dr.manage().window().maximize();
		
		dr.get("https://www.paytm.com/");
		
		
		Thread.sleep(5000);
		
		dr.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		
		Thread.sleep(3000);
		
		dr.switchTo().frame(0);
		
		dr.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();
		
		dr.switchTo().defaultContent();
		
		dr.findElement(By.xpath("//a[text()='x']")).click();
		
		
		
	}
	
	
	

}
