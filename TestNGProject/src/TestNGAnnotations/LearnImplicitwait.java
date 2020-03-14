package TestNGAnnotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnImplicitwait {
	
	
	@Test
	
	public void test1()
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
			
			ChromeDriver dr = new ChromeDriver();   //constructor
			
			dr.manage().window().maximize();
			
			
			//Implicit wait
			dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
		    dr.get("http://sampleapp.tricentis.com/101/");
			
		    dr.findElement(By.xpath("//a[text()='Automobile']")).click();
		 
		    System.out.println("Testing");
		    
		    dr.findElement(By.xpath("//button[@id='opendateofmanufacturecalender1']")).click();
		   
		
	}
	

}
