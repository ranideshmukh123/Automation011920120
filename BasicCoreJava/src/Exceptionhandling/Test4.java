



package Exceptionhandling;

public class Test4 {



	public static void main(String[] args) {
		
		
		try{
			int o[] = new int[2];
			o[3]=23;
			o[1]=33;
			}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
			}

			
			System.out.println(o[1]);

		
		/*try{
			int o[] = new int[2];
			o[3]=23;
			
			}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();*/
			}


			

			

		
		
		
		
		
		
		
	}

}
