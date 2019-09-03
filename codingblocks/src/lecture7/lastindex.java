package lecture7;

import java.util.Scanner;

public class lastindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6,i,m=8,ans;
		int arr[]=new int [6];
		Scanner s=new Scanner(System.in);
		for(i=0;i<=arr.length-1;i++)
		{
			arr[i]=s.nextInt();
		}
		ans=lastindex(arr,0,m);
		System.out.println(ans);

	}
	public static int lastindex(int arr[],int si,int m)
	{
		
	
	}

}
