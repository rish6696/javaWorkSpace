package practiserecursion;

import java.util.Scanner;

public class firstindexrecrsion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.nextInt();
			
		}
		int data=s.nextInt();
		int ans=firstindex(arr,n,data);
		System.out.println(ans);

	}
	public static int firstindex(int[]arr,int n,int data) {
		if(n==0)
		{
			return -1;
		}
		int rec=firstindex(arr, n-1, data);
		if(rec==-1)
		{
			if(arr[n-1]==data)
			{
				return n-1;
			}
			else
			{
				return -1;
			}
		}
		else
		{
			return rec;
		}
			
		
	}

}
