package practiserecursion;

import java.util.Scanner;

public class firstindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.nextInt();
			
		}
		int data=s.nextInt();
		int ans=lastindex(arr,n,data);
		System.out.println(ans);

	}
	public static int lastindex(int[]arr,int n,int data) {
		if(n==0)
		{
			return -1;
		}
		int rec=lastindex(arr, n-1, data);
		if(arr[n-1]==data)
		{
			return n-1;
		}
		else
		{
			return rec;
		}
			

	}

}
