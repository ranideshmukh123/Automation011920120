package TestNGAnnotations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FileUpload {
	
	
	@Test
	public void test1() throws AWTException, InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
			
			ChromeDriver dr = new ChromeDriver();   //constructor
			
			dr.manage().window().maximize();
			
			
			//Implicit wait
			dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
		    dr.get("http://sampleapp.tricentis.com/101/");
			
		    dr.findElement(By.xpath("//a[text()='Automobile']")).click();
		 
		   
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
