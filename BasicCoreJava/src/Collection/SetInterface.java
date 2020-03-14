package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		
		Set<String> set= new HashSet<>();
		
		set.add("Rani");
		set.add("Ram");
		set.add("Sneha");
		set.add("Rani");
		set.add("Ram");
		set.add("Sneha");
		
		Iterator<String> it=set.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("****************");
		
		
		
		
       set= new LinkedHashSet<>();
		
		set.add("Rani");
		set.add("Ram");
		set.add("Sneha");
		set.add("Rani");
		set.add("Ram");
		set.add("Sneha");
		
         it=set.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("****************");
		
		
		  set= new TreeSet<>();
			
			set.add("Rani");
			set.add("Ram");
			set.add("Sneha");
			set.add("Rani");
			set.add("Ram");
			set.add("Sneha");
			
	         it=set.iterator();
			
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			System.out.println("****************");
	}

}
