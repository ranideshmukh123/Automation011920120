package pages;

import org.openqa.selenium.WebDriver;

public class Camper_Enter_VehicleData {
	
	
	//global variable
	
	WebDriver dr; 
	
	//Constructor to initilize webdriver
	
	public Camper_Enter_VehicleData (WebDriver dr)
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
