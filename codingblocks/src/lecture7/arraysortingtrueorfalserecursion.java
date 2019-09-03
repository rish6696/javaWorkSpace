package lecture7;

import java.util.Scanner;

public class arraysortingtrueorfalserecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		boolean m;
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of array");
		n=s.nextInt();
		int arr[]=new int [n];
		System.out.println("enter elements of array");
		for(i=0;i<=arr.length-1;i++)
		{
			arr[i]=s.nextInt();
		}
		m=sorting(arr,n-1);
		System.out.println(m);
		
}
	
	public static boolean sorting(int arr[],int n)
	{
		if(n==1)
		{
			return true     ;
		}
		if(sorting(arr,n-1)==true)
		{
			if(arr[n]>arr[n-1])
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		else
		{
			return false;
		}
			
	}

}
