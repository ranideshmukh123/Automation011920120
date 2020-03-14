package Functions;

public class Function3 {

	public static void main(String[] args) {
		
	String a= eligiblity(28);	
	System.out.println(a);
			
		
		
		
	}
	
	public static String eligiblity(int age)
	{
	if (age>=18 && age<=30)
	{
		return "you are eligible";
	}else
	{
		return "you are not eligible";
	}
}
	
}