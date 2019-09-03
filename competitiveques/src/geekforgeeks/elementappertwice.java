package geekforgeeks;

import java.util.ArrayList;
import java.util.Scanner;

public class elementappertwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[]arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.nextInt();
		}
		ansprint(arr);
		

	}
	public static void ansprint(int[]arr)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			int temp=arr[i];
			int otemp=temp-arr.length;
			if(otemp<0)
			{
				arr[temp]=arr[temp]+arr.length;	
			}
			else
			{
				System.out.print(temp-arr.length+" ");
				break;
			}
			
			
		}
		
	}
	public static void ansprint()
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			int temp=arr[i];
			int otemp=temp-arr.length;
			if(otemp<0)
			{
				arr[temp]=arr[temp]+arr.length;	
			}
			else
			{
				System.out.print(temp-arr.length+" ");
				break;
			}
			
			
		}
		
	}
	public int repeatedNumber(ArrayList<Integer>a) {
		for(int i=0;i<=arr.length-1;i++)
		{
			int temp=arr[i];
			int otemp=temp-arr.length;
			if(otemp<0)
			{
				arr[temp]=arr[temp]+arr.length;	
			}
			else
			{
				System.out.print(temp-arr.length+" ");
				break;
			}
			
			
		}
		
		
		
		
	}
	


}
