package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Automobile_Enter_VehicleData {
	
	
	//global variable
	
	WebDriver dr; 
	
	//Constructor to initilize webdriver
	
	public Automobile_Enter_VehicleData (WebDriver dr)
	{
		this.dr = dr;
		
	}
	
	
	//Webelements
	
	By engineperformance = By.id("engineperformance");
	
	
	//functions
	
	
	//Get title
	
	public String getTitle()
	{
		return dr.getTitle();
	}
	
	public void enterEginePerformance(String data)
	{
		
		dr.findElement(engineperformance).sendKeys(data);
	}
	
	
	
	

}
