package samplepackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstMavenClass {
	
	@Test
	public void test1() throws AWTException, InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
			
			ChromeDriver dr = new ChromeDriver();   //constructor
			
			
			dr.manage().window().maximize();
			
		   dr.get("http://sampleapp.tricentis.com/101/");
			
		   dr.findElement(By.xpath("//a[text()='Automobile']")).click();
		 
		//   dr.findElement(By.xpath("//button[@id='opendateofmanufacturecalender']")).click();
		   
		   dr.findElement(By.id("enterinsurantdata")).click();
		     
		    
		   dr.findElement(By.id("open")).click();
		   
		   Robot robot= new Robot();
		   
			StringSelection cb = new StringSelection("D:\\Images\\Sagar\\20120526_201701.jpg");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(cb,null);

			Thread.sleep(3000);		
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.delay(2000);
			robot.keyPress(KeyEvent.VK_ENTER);		
			robot.keyRelease(KeyEvent.VK_ENTER);   
			
	}
	
	

}
