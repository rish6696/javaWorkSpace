package lecture5;

import java.util.Scanner;

public class insertionsorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of first array");
		n=s.nextInt();
		int arr[]= new int[n];
		takeinput(arr);
		selectsort(arr);
		display(arr);

	}
	public static void takeinput(int arr[])
	{
		int i;
		Scanner s=new Scanner(System.in);
		for(i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter the value of "+i+"th elemnt");
			arr[i]=s.nextInt();
		}
	}
	public static void selectsort(int[]arr)
	{
		int i,j,temp;
		for(i=1;i<=arr.length-1;i++)
		{
			for(j=i;j>0&&arr[j]<arr[j-1];j--)
			{
				temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				
			}
		}
	}
	public static void display(int arr[])
	{
		int i;
		for(i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
	
	
}
	

}
