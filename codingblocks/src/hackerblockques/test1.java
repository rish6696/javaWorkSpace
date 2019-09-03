package hackerblockques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		
		ArrayList<String> list=new ArrayList<>();
		for(int i=1;i<=n;i++)
		{
			String sim=s.next();
			list.add(sim);
		}
		Collections.sort(list);
		System.out.println(list);
			
		 
		
		

	}

}
