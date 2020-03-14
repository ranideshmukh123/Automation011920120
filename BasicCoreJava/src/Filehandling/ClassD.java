package Filehandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ClassD  {
	
	
	
	
	 public static void main(String[] args) {
		 
		 class Xls_ReaderForXLSX
			{
				String filepath=null;
				
				
				public void Xls_ReaderForXLSX(String filepath)
				{
					this.filepath=filepath;
				}
		
					
			//getCellData
			
			public String getCellData(String sheetName, int rowNum, int colNum) throws IOException {
				FileInputStream file= new FileInputStream("D:\\\\Automation011920120\\\\BasicCoreJava\\\\src\\\\Filehandling\\\\Testdata.xlsx");
				
				//Workbook
				XSSFWorkbook wb= new XSSFWorkbook(file);
				
				//work sheet
				XSSFSheet sheet=wb.getSheet("sheet1");
				
				//Row
				XSSFRow row=sheet.getRow(1);
				
				//Cell
				XSSFCell cell=row.getCell(1);
				
				String value=cell.getStringCellValue();
				
				return value;
				
				// RowCount
				
				public int getRowCount(String sheetname) throws IOException
				
				{
					FileInputStream file= new FileInputStream("D:\\\\Automation011920120\\\\BasicCoreJava\\\\src\\\\Filehandling\\\\Testdata.xlsx");
					
					//Workbook
					XSSFWorkbook wb= new XSSFWorkbook(file);
					
					//work sheet
					XSSFSheet sheet1=wb.getSheet("sheet1");
					
					return sheet1.getPhysicalNumberOfRows();    
					
			  //Coloumn count
					
					public int getColumnCount(String sheetName) throws IOException
					{
						FileInputStream file= new FileInputStream("D:\\\\Automation011920120\\\\BasicCoreJava\\\\src\\\\Filehandling\\\\Testdata.xlsx");
						
						//Workbook
						XSSFWorkbook wb= new XSSFWorkbook(file);
						
						//work sheet
						XSSFSheet sheet=wb.getSheet("sheet1");
						
						return sheet.getRow(0).getLastCellNum();
					}
					
				
			
			
		
	


		

	


