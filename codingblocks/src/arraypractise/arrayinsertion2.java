package arraypractise;

import java.util.Scanner;

public class arrayinsertion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int []arr=new int[n+1];
		for (int i = 0; i < arr.length-1; i++) {
			arr[i]=s.nextInt();
			
		}
		int pos=s.nextInt();
		int ele=s.nextInt();
		insertion(arr,pos,ele);
		

	}
public static void insertion(int[]arr,int pos,int ele) {
		
		for(int i=arr.length-2;i>=pos;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[pos]=ele;
		print(arr);
		
	}
public static void print(int[]arr) {
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}

}}
