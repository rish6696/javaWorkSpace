package lecture18;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class demosetandadvanceforllop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map=new HashMap<>();
		map.put("india", 100);
		map.put("aus", 200);
		map.put("pak", 300);
		map.put("china", 400);
		map.put("nepal", 500);
		map.put("bhutan", 800);
		System.out.println(map);
		System.out.println("***************************");
//		demoadvance for loop
		int arr[]=new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i*10;
		}
		for(Integer value:arr)
		{
			System.out.println(value);
		}
		
		System.out.println("*********************************");
		Set<Map.Entry<String, Integer>> entries=map.entrySet();
	
		
		
		

	}

}
