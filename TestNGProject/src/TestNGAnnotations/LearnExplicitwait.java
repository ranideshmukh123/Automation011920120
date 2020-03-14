package TestNGAnnotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LearnExplicitwait {
	@Test
	
	public void test2()
	{

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();   //constructor
		
		
		dr.manage().window().maximize();
		
	   dr.get("https://www.flipkart.com/");
		WebElement ele = dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		ele.click();
		
		
		Actions act = new Actions(dr);
		
		 ele = dr.findElement(By.xpath("//span[text()='Men']"));
		
		act.moveToElement(ele).build().perform();
		
	//	Explicit wait
		
		WebDriverWait wait = new WebDriverWait(dr,10);
		
		wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//a[text()='Shirts']"))));
		dr.findElement(By.xpath("//a[text()='Shirts']")).click();
		
		
	}
	
	

}
