package lecture4;

import java.util.Arrays;
import java.util.Scanner;

public class maxvalueinarray {

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
	    Arrays.sort(arr);
        System.out.println(arr[n-1]);
		
	}
	}