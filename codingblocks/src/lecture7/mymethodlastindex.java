package lecture7;

import java.util.Scanner;

public class mymethodlastindex {

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
		ans=lastindex(arr,m,n);
		System.out.println(ans);

	}
	public static int lastindex (int arr[],int m,int n )
	{
		int ans;
		if(n==0)
		{
			return -1;
		}
		if(m!=arr[n-1])
		{
			ans=lastindex(arr,m,n-1);
			return ans;
		}
		else {
			return n-1;
		}
	}
	

}
