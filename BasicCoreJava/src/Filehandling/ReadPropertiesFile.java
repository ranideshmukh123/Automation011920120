package Filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		Properties p=new Properties();
		
		FileInputStream file= new FileInputStream("D:\\Automation011920120\\BasicCoreJava\\src\\Filehandling\\OR.properties");
		
		p.load(file);
		
		System.out.println(p.get("name"));

	}

}
