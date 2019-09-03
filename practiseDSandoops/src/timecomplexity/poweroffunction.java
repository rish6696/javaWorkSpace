package timecomplexity;

import java.util.Scanner;

public class poweroffunction {
	
	
	public static long start;
	public static long end;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
//		long a=s.nextInt();
//		long b=s.nextInt();
//		startalgo();
//		System.out.println(powerc(a,b));
//		System.out.println("good function took time "+endalgo()+" milliseconds");
//		startalgo();
//		System.out.println(power(a, b));
//		System.out.println("bad function took time "+endalgo()+" milliseconds");
//		
		int n=10;
		int []arr =new int[n];
		for(int i=10;i>=n;i--)
		{
			arr[i]=n*10;
		}
		
		
		

	}
	public static long powerc(long a,long b) {
		
		if(b==0)
		{
			return 1;
		}
		if(b%2==1)
		{
			long temp=powerc(a, b/2);
			return temp*temp*a;
		}
		else
		{
			long temp=powerc(a, b/2);
			return temp*temp;
		}
	}
	public static long power(long a,long b) {
		long pow=1;
		if(b==0)
		{
			return 1;
		}
		for(int i=1;i<=b;i++)
		{
			pow=pow*a;
		}
		return pow;
		
		
	}
	public static void startalgo()
	{
		start=System.currentTimeMillis();
	}
	public static long endalgo()
	{
		end=System.currentTimeMillis();
		return end-start;
	}
public static int[] merge(int []arr1,int[]arr2) {
		
		int i=0;
		int j=0;
		int k=0;
		int[]ans=new int[arr1.length+arr2.length];
		while(i<arr1.length&&j<arr2.length)
		{
			if(arr1[i]<=arr2[j])
			{
				ans[k]=arr1[i];
				k++;
				i++;
			}
			else
			{
				ans[k]=arr2[j];
				k++;
				j++;
			}
		}
		while(j<arr2.length)
		{
			ans[k]=arr2[j];
			k++;
			j++;
		}
		while(i<arr1.length)
		{
			ans[k]=arr1[i];
			k++;
			i++;
		}
		return ans;
	}
    public static void bubblesort(int[]arr) {
	for(int i=0;i<=arr.length-2;i++)
	{
		for(int j=0;j<=arr.length-2-i;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
			}
		}
	}


}
