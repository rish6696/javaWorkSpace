package hackerrank;

import java.util.Scanner;

public class arrayleftrotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[]arr=new int[n];
		int d=s.nextInt();
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.nextInt();
		}
		d=d%n;
		for(int i=1;i<=d;i++)
		{
			int temp=arr[0];
			for(int j=1;j<=arr.length-1;j++)
			{
				arr[j-1]=arr[j];
			}
			arr[arr.length-1]=temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
