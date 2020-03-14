package Arrays;

public class TwodiametionalArrays {

	public static void main(String[] args) {
		
		
		String[][] arr= new String[3][2];
		
		//Row 1
		
		arr[0][0]="Sneha";
		arr[0][1]="Apoorva";
		
		//Row 2
		
		arr[1][0]="Rani";
		arr[1][1]="sachin";
		
		
		
		//Row 3
		
		arr[2][0]="Snehal";
		arr[2][1]="Abhishek";
		
		for(int r=0; r<arr.length; r++)//r<=2
		{
			for(int c=0; c<arr[r].length; c++)//c<=1
			{
				System.out.print(arr[r][c]+"  ");
			}
			System.out.println();
		}
		
	}

}
