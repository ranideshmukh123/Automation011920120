package TestNGAnnotations;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Mouseover {
	
	@Test
	public void Test1() throws InterruptedException
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
		
		Thread.sleep(2000);
		dr.findElement(By.xpath("//a[text()='Shirts']")).click();
		
		Thread.sleep(10000);
		
		act.dragAndDropBy(dr.findElement(By.xpath("//div[@class='_3G9WVX oVjMho']/div[@class='_3aQU3C']")), 50, 0).build().perform();
		
		Thread.sleep(10000);
		//Dropdown
		
		ele = dr.findElement(By.xpath("//select[@class='fPjUPw']"));
		
		Select sel = new Select(ele);
		
		
		sel.selectByIndex(3);

		Thread.sleep(10000);
		//checkbox
		
		dr.findElement(By.xpath("//div[@class='_1p7h2j _2irnD_']")).click();
		
		
		Thread.sleep(10000);

		dr.findElement(By.xpath("//img[@class='_3togXc']")).click();
		
		//Switch window
		
		String parent = dr.getWindowHandle();
		
		Set<String> wins = dr.getWindowHandles();
		
		for(String w:wins)
		{
			
			if(!w.equals(parent))
			dr.switchTo().window(w);
			
			
			
			
			
			
			
			
		}
		
		
		System.out.println(dr.findElement(By.xpath("//div[text()='Available offers']")).getText());
		
		//dr.findElement(By.xpath("//a[text()='40']")).click();
		
		dr.close();
		
		dr.switchTo().window(parent);
		
		dr.findElement(By.xpath("//img[@class='_3togXc']")).click();
		
		
	}
	
	
	

}
