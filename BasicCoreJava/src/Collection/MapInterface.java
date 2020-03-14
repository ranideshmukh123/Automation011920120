package Collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) {
		
		Map<Integer, String> data = new Hashtable<>();  // null key allow hashmap
		
		data.put(1, "Rani");
		data.put(2, "Puja");
		data.put(3, "Prachi");
		data.put(1, "Ram");
		data.put(null, "varsha");
		System.out.println(data.get(null));
		
      //  System.out.println(data.get(1));      //only one value read
		
		
		/*Set<Integer> set = data.keySet();
		
		for(int key:set)
		{
			System.out.println(data.get(key));
		}*/
		
		
		
	}

}
