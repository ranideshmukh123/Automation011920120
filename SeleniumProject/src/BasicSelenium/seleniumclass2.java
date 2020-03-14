package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumclass2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();   
		
		
		dr.manage().window().maximize();
		
		dr.get("https://nextstep.tcs.com/campus/#/");
		WebElement ele=dr.findElement(By.xpath(""));
        ele.click();
        
        dr.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']")).sendKeys("tv");
        dr.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']")).sendKeys(Keys.ENTER);
    	
        
	}

}
