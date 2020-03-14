package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TCAutomobile {
	
    @Test   
   
	public void Test1() throws InterruptedException
	{
		
	   System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();   //constructor
		
		
		dr.manage().window().maximize();
		
	   dr.get("http://sampleapp.tricentis.com/101/");
		
	   dr.findElement(By.xpath("//a[text()='Automobile']")).click();
	   
	   
      dr.findElement(By.xpath("//select[@id='make']")).click();
	    
	   WebElement ele = dr.findElement(By.xpath("//select[@id='make']"));
	   
	   Select sel = new Select(ele);
			   
			   sel.selectByIndex(2);
	   
			   dr.findElement(By.xpath("//select[@id='make']")).click();
			   
			  
			   
			dr.findElement(By.xpath("//input[@id='engineperformance']")).sendKeys("1000");
			//dr.findElement(By.xpath("//input[@id='engineperformance']")).sendKeys(Keys.ENTER);
	

			dr.findElement(By.xpath("//input[@id='dateofmanufacture']")).sendKeys("11/09/2019");
			
			dr.findElement(By.xpath("//select[@id='numberofseats']")).click();
		    
			  WebElement ele1 = dr.findElement(By.xpath("//select[@id='numberofseats']"));
			   
			  Select sele = new Select(ele1);
			   
			   sele.selectByIndex(4);
	   
			   dr.findElement(By.xpath("//select[@id='numberofseats']")).click();
			    
			   
			//	Thread.sleep(5000);	
			   
			
				dr.findElement(By.xpath("//select[@id='fuel']")).click();
			    
				  WebElement ele2 = dr.findElement(By.xpath("//select[@id='fuel']"));
				   
				  Select se = new Select(ele2);
				   
				   se.selectByIndex(3);
		   
				   dr.findElement(By.xpath("//select[@id='fuel']")).click();
				    
			   
				   dr.findElement(By.xpath("//input[@id='listprice']")).sendKeys("100000");
		   
					   
			   
				   dr.findElement(By.xpath("//input[@id='licenseplatenumber']")).sendKeys("MH12KM6233");
				   
			
				   dr.findElement(By.xpath("//input[@id='annualmileage']")).sendKeys("40000");  			   
				   
				   dr.findElement(By.xpath("//button[@id='nextenterinsurantdata']")).click();
				    
				      
			//****************************************************************************	   
		
				//	Thread.sleep(5000);	

				   dr.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Rani");
				   
				   		   
				   dr.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Mane");
				   
				   dr.findElement(By.xpath("//input[@id='birthdate']")).sendKeys("11/08/1993");
				   
				   
				   dr.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]/span")).click();
				    
				   
				   
				   dr.findElement(By.xpath("//input[@id='streetaddress']")).sendKeys("Impluse resideny,B202,dhanori");
				   
				   
				   
		//		Thread.sleep(5000);   
				   
				   dr.findElement(By.xpath("//select[@id='country']")).click();
				    
				   
					  WebElement ele3 = dr.findElement(By.xpath("//select[@id='country']"));
					   
					  Select wb = new Select(ele3);
					   
					   wb.selectByIndex(60);
			   
					   dr.findElement(By.xpath("//select[@id='country']")).click();
					     
					   
					   dr.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("456001");
					   
					   
					   dr.findElement(By.xpath("//input[@id='city']")).sendKeys("pune");
					 
					   
					   
					   
					   dr.findElement(By.xpath("//select[@id='occupation']")).click();
					    
					   
						  WebElement ele4 = dr.findElement(By.xpath("//select[@id='occupation']"));
						   
						  Select wb1 = new Select(ele4);
						   
						   wb1.selectByIndex(2);
				   
						   dr.findElement(By.xpath("//select[@id='occupation']")).click();
						     
						   dr.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span")).click();
						 
						   
						   dr.findElement(By.xpath("//input[@id='website']")).sendKeys("http://sampleapp.tricentis.com/101/");   
							 
						   dr.findElement(By.xpath("//button[@id='nextenterproductdata']")).click();  
						   
	         // dr.findElement(By.xpath("//button[@id='preventervehicledata']")).click();  
	   
						   
	//	******************************************************************************************************				   
						   
						   
						   
        //	Thread.sleep(10000);		
        	
		  dr.findElement(By.xpath("//input[@id='startdate']")).sendKeys("09/10/2020");
						  		   
			
		  
		  
		  dr.findElement(By.xpath("//select[@id='insurancesum']")).click();
		    
		   
		  WebElement ele5 = dr.findElement(By.xpath("//select[@id='insurancesum']"));
		   
		  Select wb2 = new Select(ele5);
		   
		   wb2.selectByIndex(6);
   
		   dr.findElement(By.xpath("//select[@id='insurancesum']")).click();
		     
		   
		   
		//	Thread.sleep(5000);	   
		   
		   dr.findElement(By.xpath("//select[@id='meritrating']")).click();
		    
		   
			  WebElement ele6 = dr.findElement(By.xpath("//select[@id='meritrating']"));
			   
			  Select wb3 = new Select(ele6);
			   
			   wb3.selectByIndex(10);
	   
			   dr.findElement(By.xpath("//select[@id='meritrating']")).click();
			     
			   
			   
		//		Thread.sleep(5000);		   
			   
			   dr.findElement(By.xpath("//select[@id='damageinsurance']")).click();
			    
			   
				  WebElement ele7 = dr.findElement(By.xpath("//select[@id='damageinsurance']"));
				   
				  Select wb4 = new Select(ele7);
				   
				   wb4.selectByIndex(2);
		   
				   dr.findElement(By.xpath("//select[@id='damageinsurance']")).click();
				     
					
				   
				   dr.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span")).click();
				  
				   
				   
				//	Thread.sleep(5000);		   
					   
					   dr.findElement(By.xpath("//select[@id='courtesycar']")).click();
					    
					   
						  WebElement ele8 = dr.findElement(By.xpath("//select[@id='courtesycar']"));
						   
						  Select wb5 = new Select(ele8);
						   
						   wb5.selectByIndex(2);
				   
						   dr.findElement(By.xpath("//select[@id='courtesycar']")).click();  
						     
						   dr.findElement(By.xpath("//button[@id='nextselectpriceoption']")).click();
						     
						   
						   dr.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span")).click();
	
					Thread.sleep(1000);	   
						   dr.findElement(By.xpath("//*[@id=\"nextsendquote\"]")).click();
	
//       ****************************************************************************************************						 
						   
						   dr.findElement(By.xpath("//input[@id='email']")).sendKeys("deshmukhranisgr@gmail.com");
				  		   
						   
						   dr.findElement(By.xpath("//input[@id='phone']")).sendKeys("8788676812");
				  		   
						   
						   
						   dr.findElement(By.xpath("//input[@id='username']")).sendKeys("ranimane");
				  		   
						   
						   
						   dr.findElement(By.xpath("//input[@id='password']")).sendKeys("Rdeshmukh@93");
				  		   
						   
						   
						   
						   dr.findElement(By.xpath("//input[@id='confirmpassword']")).sendKeys("Rdeshmukh@93");
				  		   
						   
						   
						   
						   dr.findElement(By.xpath("//textarea[@id='Comments']")).sendKeys("vhajbnsbhavaxbanvhgvhabz avxxaa");
				  		   
						   
						   
						   
	}

}
