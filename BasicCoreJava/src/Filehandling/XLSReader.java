package Filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSReader 
{
	String filepath=null;
	
	public XLSReader(String filepath)
	{
		this.filepath=filepath;
	}

		
		
	
	public String getCellData(String sheetName, int rowNum, int colNum) throws IOException {
		FileInputStream file= new FileInputStream(filepath);
		
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
		
	}
	
	public void setCellData(String sheetName, int rowNum, int colNum, String value) throws IOException
	{
		FileInputStream file= new FileInputStream(filepath);
		
		//Workbook
		XSSFWorkbook wb= new XSSFWorkbook(file);
		
		//work sheet
		XSSFSheet sheet=wb.getSheet("sheet1");
		
		//Row
		XSSFRow row=sheet.getRow(1);
		if(row==null)
			row=sheet.createRow(1);
		
		//Cell
		XSSFCell cell=row.getCell(1);
		if(cell==null)
			cell=row.createCell(0);
		
		cell.setCellValue(value);		

		FileOutputStream fileOut = new FileOutputStream(filepath);

		wb.write(fileOut);
	}
	
	public int getRowCount(String sheetName) throws IOException
	{
		FileInputStream file= new FileInputStream(filepath);
		
		//Workbook
		XSSFWorkbook wb= new XSSFWorkbook(file);
		
		//work sheet
		XSSFSheet sheet=wb.getSheet("sheet1");
		
		return sheet.getPhysicalNumberOfRows();
	}
	
	public int getColumnCount(String sheetName) throws IOException
	{
		FileInputStream file= new FileInputStream("D:\\\\Automation011920120\\\\BasicCoreJava\\\\src\\\\Filehandling\\\\Testdata.xlsx");
		
		//Workbook
		XSSFWorkbook wb= new XSSFWorkbook(file);
		
		//work sheet
		XSSFSheet sheet=wb.getSheet("sheet1");
		
		return sheet.getRow(0).getLastCellNum();
	}

}