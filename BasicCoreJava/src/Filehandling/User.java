package Filehandling;

public class User {

	public static void main(String[] args) {
		
		ClassA wb= new ClassA();
		
		ClassB sheet=wb.temp();
		sheet.sum(10, 20);
		
		wb.temp().sum(10, 20);
		
	}

}
