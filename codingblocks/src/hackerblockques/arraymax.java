package hackerblockques;

import java.util.Scanner;

public class arraymax {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n = s.nextInt();
		int arr[]=new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.nextInt();
		}
		int res=arraymax(arr,n);
		System.out.println(res);
		
	}
public static int  arraymax(int arr[], int n) {
	if(n==1)
	{
		return 0;
	}
	int rec=arraymax(arr,n-1);
	if(rec<arr[n-1])
	{
		return n-1;
	}
	else {
		return rec;
	}
	
}
}
