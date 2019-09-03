package lecture7;

import java.util.Scanner;

public class fibousingrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,ans;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		n=s.nextInt();
		ans=fib(n);
		System.out.println(ans);
		

	}
	public static int fib(int n)
	{
		int next;
		if(n==0)
		{
			return 0;
		}
		else if(n==1)
		{
			return 1;
		}
		else
		{
			next=fib(n-1)+fib(n-2);
			return next;
		}
		
	}

}
