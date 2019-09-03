package lecture13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class kreverselinkedlist {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n =s.nextInt();
		int k=s.nextInt();
		 linkedlistmyself list=new linkedlistmyself();
		 for (int i = 1; i <=n; i++) {
			 list.addlast(s.nextInt());
			 
			
		}
		
		 ArrayList<Integer> reclist=new ArrayList<>();
		int m=0;
		int i=0;
		
		while(m<=list.size()-1)
		{
			int[]arr=new int[k];
			for(int j=0;j<=arr.length-1;j++)
			{
				arr[j]=list.getAt(m);
				
				m++;
				if(m>list.size()-1)
				{
					break;
				}
				
				
			}
			for(int x=arr.length-1;x>=0;x--)
			{
				reclist.add(arr[x]);
			}
			
			
		}
		for(int x=0;x<=reclist.size()-1;x++)
		{
			System.out.print(reclist.get(x)+" ");
		}
		

	}

}
