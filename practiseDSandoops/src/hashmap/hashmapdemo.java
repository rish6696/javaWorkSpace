package hashmap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> table=new HashMap<>();
		table.put("india", 100);
		table.put("pak", 200);
		table.put("banladesh", 300);
		table.put("china", 400);
		table.put("nepal", 500);
		System.out.println(table.remove("pak"));
		System.out.println(table.get("india"));
		System.out.println(table.containsKey("australia"));
		System.out.println(table);
		
		Set<String> keys=table.keySet();
		for(String m:keys)
		{
			System.out.println(m);
		}
		Collection<Integer> values=table.values();
		for(Integer m:values)
		{
			System.out.println(m);
		}
		
		System.out.println(table);
		Set<Map.Entry<String, Integer>> entries=table.entrySet();
		for(Map.Entry<String, Integer>entry:entries)
		{
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
		

	}

}
