package pages;

import org.openqa.selenium.WebDriver;

public class Truck_Enter_VehicleData {
	
	
	//global variable
	
	WebDriver dr; 
	
	//Constructor to initilize webdriver
	
	public Truck_Enter_VehicleData (WebDriver dr)
	{
		this.dr = dr;
		
	}
	
	
	//Webelements
	
	
	
	//functions
	
	
	//Get title
	
	public String getTitle()
	{
		return dr.getTitle();
	}
	
	
	
	
	
	

}
