package ifelsestatements;

public class Nestedifelsestatement {

	public static void main(String[] args) {
		
		int a=50;
		int b=40;
		int c=60;
		
		if(a>b)
		{
			
		if(a>c)
		{
			System.out.println("a is greatest");
		}
		else{
			
		
		System.out.println("c is gretest");
		}
		}
		else if(b>c)
		{
		System.out.println("b is greatest");
		
		}else {
			System.out.println("c is greatest");
			
		}
		
		
		
	}

}
