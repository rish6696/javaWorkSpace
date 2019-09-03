package lecture16;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class maxcharusinghashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap<Character,Integer> map=new HashMap<>();
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.next();
		char ans=getmaxchar(str);
		System.out.println(ans);
		
		
		

	}
	public static char getmaxchar(String str) {
		HashMap<Character,Integer> map=new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char m=str.charAt(i);
			if(map.containsKey(m))
			{
				int val=map.get(m);
				val++;
				map.put(m, val);
			}
			else
			{
				map.put(m, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> entries=map.entrySet();
		int max=Integer.MIN_VALUE;
		char ans='\0';
		for(Map.Entry<Character, Integer>entry:entries)
		{
			if(entry.getValue()>max)
			{
				max=entry.getValue();
				ans=entry.getKey();
			}
		}
		return ans;
		
		
		
	}

}
