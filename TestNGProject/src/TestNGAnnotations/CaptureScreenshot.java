package TestNGAnnotations;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class CaptureScreenshot {
	
	@Test
	
	public void test1() throws IOException
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
			
			ChromeDriver dr = new ChromeDriver();   //constructor
			
			dr.manage().window().maximize();
			
			
			//Implicit wait
			dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
		    dr.get("http://sampleapp.tricentis.com/101/");
			
		    dr.findElement(By.xpath("//a[text()='Automobile']")).click();
		 
		TakesScreenshot srcshot =(TakesScreenshot) dr;
		
		File SrcFile = srcshot.getScreenshotAs(OutputType.FILE);
		
		File Destfile = new File("D:\\Image.jpg");
		FileHandler.copy(SrcFile, Destfile);
	}
	
	
	

}
