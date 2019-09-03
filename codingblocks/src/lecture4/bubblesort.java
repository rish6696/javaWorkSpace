package lecture4;

import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,i,m,p=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array");
		n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements of array");
		for(i=0;i<=n-1;i++)
		{
			arr[i]=s.nextInt();
		}
		for(m=0;m<=n-1;m++)
		{	
		      if(arr[m]<0)
		      {
			     p++;
		      }
		}
		if(p>1)
		{
			bubblesort1(arr);
		}
		else
		{
			bubblesort(arr);
		}
		
		bubblesort(arr);
		show(arr,n);
		
	
	}
	public static void show(int[] arr,int n)
	{
		int i;
		for(i=0;i<=n-1;i++)
		{
		     System.out.println(arr[i]);
		}
		
	}
	public static void bubblesort(int []arr)
	{
		int i,j,temp;
		for(i=1;i<arr.length-1;i++)
		{
			for(j=0;j<arr.length-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;	
				}
			}
			
		}
		
		
	}
	public static void bubblesort1(int []arr)
	{
		int i,j,temp;
		for(i=1;i<arr.length-1;i++)
		{
			for(j=0;j<arr.length-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;	
				}
			}
			
		}
		temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		
		
	}

}
