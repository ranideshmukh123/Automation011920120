package Stringclass;

public class StringFunctions {

	public static void main(String[] args) {
		
		String str="  your account number is 1234  ";
		String str2="your account number is 1234";
		//Function 1
		System.out.println(str.charAt(21));
		
		//Function 2
		
		System.out.println(str.length());
		
		//Function 3
		
		System.out.println(str.toUpperCase());
		
		//Function 4
		
		System.out.println(str.toLowerCase());
		
		//Funcion 5
		
		System.out.println(str.equals(str2));
		
		//Function 6
		
		System.out.println(str.equalsIgnoreCase(str2));
		
		//Function 7
		
		System.out.println(str.replace("1234", "3434"));
		
		//Function 8
		
		System.out.println(str.substring(23));
		
		//Function 9
		
		System.out.println(str.substring(23, 27));
		
		//Function 10
		
		System.out.println(str);
		System.out.println(str.trim());
		
		//Function 11
		String[] arr=str.split(" ");
		for(String s:arr)
		{
			System.out.println(s);
		}
		
		//Function 12
		
		System.out.println(str.contains("1234"));
	}

}
