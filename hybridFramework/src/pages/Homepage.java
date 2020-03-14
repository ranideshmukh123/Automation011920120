package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

	// global variable

	WebDriver dr;

	// Constructor to initilize webdriver

	public Homepage(WebDriver dr) {
		this.dr = dr;

	}

	// Webelements

	By automobile = By.id("nav_automobile");

	By truck = By.id("nav_truck");

	By motorCycle = By.id("nav_motorcycle");

	By camper = By.id("nav_camper");

	// functions

	public Automobile_Enter_VehicleData clickAutomobile() {
		dr.findElement(automobile).click();

		return new Automobile_Enter_VehicleData(dr);
	}
	
	
	public Truck_Enter_VehicleData clickTruck()
	{
		dr.findElement(truck).click();
		
		return new Truck_Enter_VehicleData(dr);
		
	}
	

	// Get title

	public String getTitle() {
		return dr.getTitle();
	}

	// create class for truck,motorcycle,camper

	// cerate function other functions in this ciass(click truck......and return the
	// object of Trucl_enter_vehicle_data)

}
