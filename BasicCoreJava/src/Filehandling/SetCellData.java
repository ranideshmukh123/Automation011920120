package Filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SetCellData {

	public static void main(String[] args) throws IOException {
     FileInputStream file= new FileInputStream("D:\\Automation011920120\\BasicCoreJava\\src\\Filehandling\\Testdata.xlsx");
		
		XSSFWorkbook wb= new XSSFWorkbook(file);

		XSSFSheet sheet= wb.getSheet("Sheet1");
		
		XSSFRow row=sheet.getRow(10);
		if(row==null)
			row=sheet.createRow(10);
		
		XSSFCell cell=row.getCell(10);
		if(cell==null)
			cell=row.createCell(10);
		
	    cell.setCellValue("Renuka");
	    
	    FileOutputStream file2= new FileOutputStream("D:\\Automation011920120\\BasicCoreJava\\src\\Filehandling\\Testdata.xlsx");
		  
		wb.write(file2);
		
		
	}

}
