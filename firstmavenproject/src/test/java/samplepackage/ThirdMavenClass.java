package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThirdMavenClass {
	
	@Test
	public void test3()
	{
		
	System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();   //constructor
		
		
		dr.manage().window().maximize();
		
	   dr.get("https://www.flipkart.com/");
		WebElement ele = dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		ele.click();
		
		
	}
	
	

}
