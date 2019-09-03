package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class mostfrequentcharacterusinghashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		HashMap<Character, Integer> map=new HashMap<>();
		String str=s.next();
		for(int i=0;i<=str.length()-1;i++)
		{
			char m=str.charAt(i);
			if(map.containsKey(m))
			{
				int val=map.get(m);
				map.remove(m);
				map.put(m, val+1);
			}
			else
			{
				map.put(m, 1);
			}
		}
		System.out.println(map);
		Set<Map.Entry<Character, Integer>> entries=map.entrySet();
		char max='/';
		int maxf=0;
		for(Map.Entry<Character, Integer>entry:entries)
		{
		   if(entry.getValue()>maxf)
		   {
			   maxf=entry.getValue();
			   max=entry.getKey();
		   }
		}
		System.out.println(max);
		System.out.println(maxf);
		
		
				
	

	}

}
