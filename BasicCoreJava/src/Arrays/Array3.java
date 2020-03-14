package Arrays;

public class Array3 {

	public static void main(String[] args) {
		
		int[] arr= {10,20,30,140,50,60,70,80,90,100};
		
		for(int i:arr) 
		{
			System.out.println(i);
		}
		
		for(int i=0; i<10;  i++ )
		{
			for(int j=i+1; j<10; j++)
			{
				if(arr[i]>arr[j])
				{
					arr[i]=arr[i];
					arr[i]=arr[j];
					arr[j]=arr[i];
					{
						System.out.println((10));
					}
				}
			}
			
		}
		
			
		
		
		
		
	}

}
