package TestNGAnnotations;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotations {
	
	@Test(dataProvider="getData")
	public void test1(String username,String password)
	{
		String username1="rani";
		String password1="test1234";
		
		
		System.out.println("Test login with "+username1+" and "+password1+"");
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();   //constructor
		
		
		dr.manage().window().maximize();
		
		dr.get("https://www.flipkart.com/");
		
		dr.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys(username1);
				
		
		dr.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys(password1);
		
		dr.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		
		
		
		
		
		
	}	
		
	@DataProvider
	public String[][]getData() throws IOException{
	Xls_ReaderForXLSX xl = new Xls_ReaderForXLSX("D:\\Automation011920120\\TestNGProject\\src\\TestNGAnnotations\\Testdata.xlsx");
	
	//System.out.println(xl.getRowCount("sheet1"));

	int rows = xl.getRowCount("sheet1");
	int cols = xl.getColumnCount("sheet1");
	
	String[][] data = new String[rows][cols];
	
	for(int r=0; r<rows; r++)
	{
		
		for(int c=0; c<cols; c++)
			
		{
		
			
			data[r][c] = xl.getCellData("sheet1", r, c);
		}
		
	}
		return data;
		
		
		
	}
		
	
		
	
		
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
	
	
	
	


