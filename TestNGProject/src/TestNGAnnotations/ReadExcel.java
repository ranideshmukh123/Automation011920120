package TestNGAnnotations;

import java.io.IOException;

import org.testng.annotations.Test;

public class ReadExcel {
	
	@Test	
	public void readExcel() throws IOException
	{
		
		Xls_ReaderForXLSX xl = new Xls_ReaderForXLSX("D:\\Automation011920120\\TestNGProject\\src\\TestNGAnnotations\\Testdata.xlsx");
		
		//System.out.println(xl.getRowCount("sheet1"));
	
		int rows = xl.getRowCount("sheet1");
		int cols = xl.getColumnCount("sheet1");
		
		String[][] data = new String[rows][cols];
		
		for(int r=0; r<rows; r++)
		{
			
			for(int c=0; c<cols; c++)
				
			{
			//	System.out.println(xl.getCellData("sheet1", r, c));
				
				data[r][c] = xl.getCellData("sheet1", r, c);
			}
			
		}
		
		
		
		for(int r=0; r<rows; r++)
		{
			
			for(int c=0; c<cols; c++)
				
			{
			
				System.out.println(data[r][c]);
				
			}
			
		}
		
		
	}
	
	

}
