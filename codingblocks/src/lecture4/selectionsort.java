package lecture4;

import java.util.Scanner;

public class selectionsort {

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
		
		
		selectionsortsort(arr);
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
	public static void selectionsortsort(int []arr)
	{
		int i,min,temp,j;
		for(i=0;i<arr.length-1;i++)
		{
			min=i;
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			
				
			}
			
		}
		
		
		
	}


}
for(j=0;j<=n-1;j++)
{
	System.out.print(arr[i][j]+" ,");
}
