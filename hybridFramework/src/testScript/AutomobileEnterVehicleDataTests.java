package testScript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import configuration.Configuration;
import libraries.ApplicationLibrary;
import pages.Automobile_Enter_VehicleData;
import pages.Homepage;
import pages.Truck_Enter_VehicleData;

public class AutomobileEnterVehicleDataTests {
	
	//global variabls
	
	WebDriver dr;
	
	Homepage homepage;
	
	Automobile_Enter_VehicleData autoEnterVehData;
	
	Truck_Enter_VehicleData truckEnterVehData;
	
	ApplicationLibrary lib;
	
	@BeforeClass
	
	public void initialize()
	{
		lib = new ApplicationLibrary();
		
		dr=lib.launchBrowser("chrome");
		
		
		//navigate
		
		dr.get(Configuration.url);
		
		//initilize
		
		homepage = new Homepage(dr);
		
		Assert.assertEquals(homepage.getTitle(),"Tricentis Vehicle Insurance");
		
	}
	
	
	@AfterClass
	
	public void tearDown()
	{
		//dr.quit();
	}
	
	
	@Test
	public void testEnginPerformancefield()
	{
		//click on Automobile link
		
		
		autoEnterVehData = homepage.clickAutomobile();
		
		
		//validate
		
		Assert.assertEquals(autoEnterVehData.getTitle(),"Enter Vehicle Data");
		
		//enter data in engine performance textbox
		
		autoEnterVehData.enterEginePerformance("1200");
		
	}

	
	
	
	

}
