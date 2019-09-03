package hackerblockques;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class highestfrequenecy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[]arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.nextInt();
		}
		HashMap<Integer, Integer> map=new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int m=arr[i];
			if(map.containsKey(m))
			{
				map.put(m, map.get(m)+1);
			}
			else
			{
				map.put(m, 1);
			}
		}
		int max=Integer.MIN_VALUE;
		int maxno=0;
		Set<Map.Entry<Integer, Integer>> entries=map.entrySet();
		for(Map.Entry<Integer, Integer> entry:entries)
		{
			if(entry.getValue()>max)
			{
				max=entry.getValue();
				maxno=entry.getKey();
			}
		}
		System.out.println(maxno);
		

	}

}
