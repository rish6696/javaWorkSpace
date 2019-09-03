package codingclubhack;

import java.util.Scanner;

public class forminggroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[]arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.nextInt();
			
		}
		forminggroups(arr,n);
		

	}
	public static void forminggroups(int[]arr,int n) {
		int i=1;
		while(i<=n)
		{
			int in=i-1;
			int p1=arr[in];
			int p2=arr[p1-1];
			int p3=arr[p2-1];
			if(p3==i)
			{
				System.out.println("YES");
				return;
			}
			i++;
		}
		System.out.println("NO");
		
	}

}
