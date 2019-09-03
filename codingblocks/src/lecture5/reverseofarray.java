package lecture5;

import java.util.Scanner;

public class reverseofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i;
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of arrray");
		n = s.nextInt();
		int arr[] = new int[n];
		for (i = 0; i <= arr.length - 1; i++) {
			System.out.println("enter the " + i + "th element");
			arr[i] = s.nextInt();
		}
		reverse(arr);
		display(arr);
		
	}
		
		public static void reverse(int arr[])
		{
		
		int i=0,j=arr.length-1,m=1,temp;
		while(m<=arr.length/2)
		{
			temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
			i++;
			j--;
			m++;
			}
		}
		public static void display(int arr[])
		{
			int i;
			for(i=0;i<=arr.length-1;i++)
			{
				System.out.println(arr[i]);
			}
			
		

}}
