package TestNGAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleCalenderAndWebtable {
	  @Test   
	   
		public void Test1() throws InterruptedException
		{
		
	  System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		
			ChromeDriver dr = new ChromeDriver();   //constructor
			
			
			dr.manage().window().maximize();
			
		   dr.get("http://sampleapp.tricentis.com/101/");
			
		   dr.findElement(By.xpath("//a[text()='Automobile']")).click();
		 
		   dr.findElement(By.xpath("//button[@id='opendateofmanufacturecalender']")).click();
		   
		   String year="2018";
		   String month="March";
		   String date= "4";
		   
		   String actyear = dr.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		   
		   while(!year.equals(actyear))
		   {
			 //Thread.sleep(2000);  
			   dr.findElement(By.xpath("//a[@title='Prev']")).click();
			   actyear = dr.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			   
		   }
		   
		   //select month
		   
		   String actmonth = dr.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		   
		   while(!month.equals(actmonth))
		   {
			 //Thread.sleep(2000);  
			   dr.findElement(By.xpath("//a[@title='Prev']")).click();
			   actmonth = dr.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); 
		   }
		   
		   
		   
		   
		   
		   
	/*	 //span[@class='ui-datepicker-year']
		 //span[@class='ui-datepicker-month']
		 //span[text()='Prev']    */
		   
		   
		int rows =  dr.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr")).size();
		   
	       for(int r=1; r<=rows; r++)
	       {
	    	   String xpath ="//table[@class='ui-datepicker-calendar']/tbody/tr["+r+"]/td";
	    	   
	    	int cols =    dr.findElements(By.xpath(xpath)).size();
	    	
	    	
	    	for(int c=1; c<=cols; c++)
	    	{
	    		String datexpath="//table[@class='ui-datepicker-calendar']/tbody/tr["+r+"]/td["+c+"]";
	    		
	    		String Date = dr.findElement(By.xpath(datexpath)).getText();
	    		
	    		if(date.equals(Date))
	    		{
	    			 dr.findElement(By.xpath(datexpath)).click();
	 	    	      break;	
	    		}
	    		
	    		
	    		
	    		//System.out.print(data+" ");
	    		
	    		
	    	}
	    	   
	    	System.out.println();
	       }
	
		}	

}
