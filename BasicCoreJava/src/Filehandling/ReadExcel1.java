package Filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file= new FileInputStream("D:\\Automation011920120\\BasicCoreJava\\src\\Filehandling\\Testdata.xlsx");
		
		XSSFWorkbook wb= new XSSFWorkbook(file);

		XSSFSheet sheet= wb.getSheet("Sheet1");
		
	int rows = sheet.getPhysicalNumberOfRows();
		
	System.out.println(rows);
	
	int cols = sheet.getRow(0).getLastCellNum();
		
			System.out.println(cols);
		
			
			
			
			//String[][] data = new String[rows][cols];
			
			for(int r=0; r<rows; r++)
			{
				for(int c=0; c<cols; c++)
				{
					
					String str1 =sheet.getRow(r).getCell(c).getStringCellValue();
					System.out.print(str1+" ");
					
				}
				System.out.println();
			}

	}
}
