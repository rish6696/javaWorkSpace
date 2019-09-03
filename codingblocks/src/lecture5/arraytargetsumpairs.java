package lecture5;

import java.util.Arrays;
import java.util.Scanner;

public class arraytargetsumpairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,m;
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of  array");
		n=s.nextInt();
		int arr[]= new int[n];
		for(i=0;i<=n-1;i++)
		{
			System.out.println("enter the value of "+i+"th elemnt");
			arr[i]=s.nextInt();
		}
		System.out.println("enter target");
		m=s.nextInt();
		Arrays.sort(arr);
		checkarray(arr,m);
		
		

	}
	public static void checkarray(int brr[],int m)
	{
		int i,j;
		for(i=0;i<=brr.length-1;i++)
		{
			for(j=i+1;j<=brr.length-1;j++)
			{
				if(brr[i]+brr[j]==m)
				{
					if(brr[i]>brr[j])
					{
					System.out.println(brr[j]+" and "+brr[i]);
					}
					else
					{
						System.out.println(brr[i]+" and "+brr[j]);
					}
				}
				
			}
		}
	}

}
