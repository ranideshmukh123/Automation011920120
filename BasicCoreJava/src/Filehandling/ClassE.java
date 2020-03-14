package Filehandling;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ClassE {
	
	
	
	public class ClassE
	{
		String filepath=null;
		
		public ClassE(String filepath)
		{
			this.filepath=filepath;
		}
	
	
	}

	public static void main(String[] args) throws IOException  { 
		
		
/*		    FileInputStream file = new FileInputStream("D:\\Automation011920120\\BasicCoreJava\\src\\Filehandling\\Testdata.xlsx");

		      XSSFWorkbook wb = new XSSFWorkbook(file);
		      
		      XSSFSheet sheet = wb.getSheet("sheet1");
		      
		      String str =sheet.getRow(1).getCell(1).getStringCellValue();
				
				System.out.println(str);  */
				
			
				
				
				int getColumnCount(String sheetName) throws IOException
				{
					FileInputStream file= new FileInputStream("D:\\\\Automation011920120\\\\BasicCoreJava\\\\src\\\\Filehandling\\\\Testdata.xlsx");
					
					//Workbook
					XSSFWorkbook wb= new XSSFWorkbook(file);
					
					//work sheet
					XSSFSheet sheet=wb.getSheet("sheet1");
					
					return sheet.getRow(0).getLastCellNum();
				}

 
				
		       
		
		
				
		
		
		      
	}

}
