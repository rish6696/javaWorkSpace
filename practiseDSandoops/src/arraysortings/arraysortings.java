package arraysortings;

import java.util.Scanner;

public class arraysortings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=s.nextInt();
		}
		quicksort(arr,0	, arr.length-1);
		
		display(arr);
		
		
		

	}
	public static  void bubblesort(int[]arr)
	{
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
	public static  void selectionsort(int[]arr)
	{
		
		for(int j=0;j<=arr.length-2;j++)
		{
			int minvalue=Integer.MAX_VALUE;
			int si=-1;
		     for(int i=j;i<=arr.length-1;i++)
		     {
			     if(arr[i]<minvalue)
			     {
				   minvalue=arr[i];
				   si=i;
				  }
		    }
		     
		     int temp=arr[j];
		     arr[j]=arr[si];
		     arr[si]=temp;
		}
		
	}
	public static void insertionsort(int[]arr)
	{
		
		for(int i=1;i<=arr.length-1;i++)
		{
			int so=0;
			int val=arr[i];
			for(int j=i-1;j>=0;j--)
			{
				if(val<arr[j])
				{
					arr[j+1]=arr[j];
					so++;
				}
				
			}
			arr[i-so]=val;
			
			
			
		}
	}
	public static  void quicksort(int[]arr,int start,int end)
	{
		if(start>=end)
		{
			return;
		}
		
		int pindex=partition(arr,start,end);
		quicksort(arr, start, pindex-1);
		quicksort(arr, pindex+1,end);
	}
	public static int partition(int[]arr,int start,int end)
	{
		int pindex=start;
		int pivot=arr[end];
		for (int i = start; i<=end-1; i++) {
			if(arr[i]<=pivot)
			{
				int temp=arr[i];
				arr[i]=arr[pindex];
				arr[pindex]=temp;
				pindex++;
				
			}
		}
		int temp=arr[pindex];
		arr[pindex]=arr[end];
		arr[end]=temp;
		return pindex;
		
	}
	public static  void display(int[]arr)
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
