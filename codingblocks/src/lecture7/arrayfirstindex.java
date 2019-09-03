package lecture7;

import java.util.Scanner;

public class arrayfirstindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,m,ans;
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of array");
		n=s.nextInt();
		int arr[]=new int [n];
		System.out.println("enter elements of array");
		for(i=0;i<=arr.length-1;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("enter target");
		m=s.nextInt();
		ans=firstindex(arr,0,m);
		System.out.println(ans);

	}
	public static int firstindex(int arr[],int si,int data)
	{
		int m;
		if(si==arr.length)
		{
			return -1;
		}
		if(arr[si]==data)
		{
			return si;
		}
		else
		{
			m=firstindex(arr,si+1,data);
			return m;
		}
	}
	

}
