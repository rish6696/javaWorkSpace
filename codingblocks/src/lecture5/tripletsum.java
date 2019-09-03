package lecture5;

import java.util.Scanner;

public class tripletsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,m;
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of  array");
		n=s.nextInt();
		int arr[]= new int[n];
		for(i=0;i<=n-1;i++)
		{
			System.out.println("enter the value of "+(i+1)+"th elemnt");
			arr[i]=s.nextInt();
		}
		System.out.println("enter target");
		m=s.nextInt();
		checkarray(arr,m);


	}
	public static void checkarray(int arr[],int m)
	{
		int i,j,k,n;
		for(i=0;i<=arr.length-1;i++)
		{
			for(j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]+arr[j]<=m)
				{
					k=arr[i]+arr[j];
					for(n=j+1;n<=arr.length-1;n++)
					{
						if(k+arr[n]==m)
						{
							arrange(arr[i],arr[j],arr[n]);
						}
					}
				}
			}
		}
	}
	public static void  arrange(int a,int b,int c)
	{
		if(a>=b&&a>=c)
		{
			if(b>=c)
			{
				System.out.println(c+", "+b+" and "+a);
			}
			else
			{
				System.out.println(b+", "+c+" and "+a);
			}
		}
		else if(b>=a&&b>=c)
		{
			if(a>=c)
			{
				System.out.println(c+", "+a+" and "+b);
			}
			else
			{
				System.out.println(a+", "+c+" and "+b);
			}
		}
		else
		{
			if(b>=a)
			{
				System.out.println(a+", "+b+" and "+c);
			}
			else
			{
				System.out.println(b+", "+a+" and "+c);
			}
			
		}
		
	}

}
