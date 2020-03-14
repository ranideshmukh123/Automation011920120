package Arrays;

public class Array1 {

	public static void main(String[] args) {
		
		String[] arr= new String[12];
		
		arr[0]="Apoorva";
		arr[1]="Rani";
		arr[2]="Pallavi";
		arr[3]="Prachi";
		arr[4]="Varsha";
		arr[5]="Sachin";
		arr[6]="Harshal";
		arr[7]="Abhishek";
		arr[8]="Yogesh";
		arr[9]="Deepika";
		arr[10]="Kalyani";
		arr[11]="Sneha";
		
		
		
		
		System.out.println(arr[5]);
		System.out.println(arr[6]);
		
		
		for(int i=0; i<=11;  i++)
		{
			System.out.println(arr[i]);
			
		}
		
		/*int i=0;
		 
		 while(i<=11)
		 {
		 
		 System.out.println(arr[i]);
		 i++;
		 }*/
		 
		
		/*for(int i=0; i<arr.length;  i++)
		{
			System.out.println(arr[i]);
			
		}*/

		//Enhanced for loop
		
		
		for(String a:arr)//a is variable
		{
			System.out.println(a);
		}		
		
		
		
		
		
		
	}

}
