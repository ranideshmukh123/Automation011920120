package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {
		//List<Integer> list=
		
		List<String> list = new ArrayList<>();
		
		list.add("Rani");
		list.add("Ram");
		list.add("Sneha");
		list.add("Rani");
		list.add("Ram");
		list.add("Sneha");
		
		for(String s:list)
		{
			System.out.println(s);
		}
		
		System.out.println("*****************");
		
		 list = new LinkedList<>();
			
			list.add("Rani");
			list.add("Ram");
			list.add("Sneha");
			list.add("Rani");
			list.add("Ram");
			list.add("Sneha");
			
			for(String s:list)
			{
				System.out.println(s);
			}
			
			
			System.out.println("*****************");
			
			 list = new Vector<>();
				
				list.add("Rani");
				list.add("Ram");
				list.add("Sneha");
				list.add("Rani");
				list.add("Ram");
				list.add("Sneha");
				
				for(String s:list)
				{
					System.out.println(s);
				}
	}

}
