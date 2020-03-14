package Filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xssf.eventusermodel.XSSFReader;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ClassC {

	public static void main(String[] args) throws IOException {
		String filepath=null;
		
		
		public XSSFReader(file)
		{
			this.file=file;
		}
		
		
		FileInputStream file= new FileInputStream("D:\\Automation011920120\\BasicCoreJava\\src\\Filehandling\\Testdata.xlsx");
			
		XSSFWorkbook wb= new XSSFWorkbook(file);
		XSSFSheet sheet= wb.getSheet("Sheet1");
		
		XSSFRow row = sheet.getRow(0);
		
		XSSFCell cell = row.getCell(0);
		
		
		
		
	}

}
