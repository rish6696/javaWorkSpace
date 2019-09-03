package hackerblockques;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import lecture11.stackusingaarays;

public class nextgreaterelement {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		ArrayList<int[]> list=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		int test=s.nextInt();
		for(int i=1;i<=test;i++)
		{
			int size=s.nextInt();
			int[] arr=new int[size]; 
			list.add(arr);
			for(int j=0;j<=size-1;j++)
			{
				arr[j]=s.nextInt();
			}
		}
		
		for(int i=0;i<=list.size()-1;i++)
		{
			stackusingaarays stack=new stackusingaarays();
			int [] array=list.get(i);
			int in=0;
			while(in<=array.length-1)
			{
				int m=array[in];
				if(stack.IsEmpty()||m<stack.top())
				{
					stack.push(m);
					in++;
				}
				else
				{
					System.out.println(stack.top()+","+m);
					stack.pop();
				}
			}
			
			for(int k=stack.size()-1;k>=0;k--)
			{
				System.out.println(stack.get(k)+",-1");
			}
	   }

	}
}
