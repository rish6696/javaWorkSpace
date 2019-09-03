package dynamicprograming;

import java.util.Scanner;

public class fibonacciseries {
	public static long start;
	public static long end;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int[]arr=new int[n+1];
//		int fib=fibonacciRS(n, arr);
//		System.out.println(fib);
		 startAlgo();
				 System.out.println(fibonacci(n));
				 System.out.println("Fib Normal took time" + endAlgo());
				
				 startAlgo();
				 System.out.println(fibonacciRS(n, arr));
				 System.out.println("FibRS took time" + endAlgo());

	}
	public static int fibonacci(int n)
	{
		if(n==1||n==2)
		{
			return 1;
		}
				
		
		
		int f=fibonacci(n-2);
		int s=fibonacci(n-1);
		return f+s;
	}
	public static int fibonacciRS(int n,int[]arr)
	{
		
		if(n==1||n==2)
		{
			return 1;
		}
		if(arr[n]!=0)
		{
			return arr[n];
		}
		
		
		int f=fibonacciRS(n-2, arr);
		int s=fibonacciRS(n-1,arr);
		arr[n]=f+s;
		return f+s;
	}
	public static void startAlgo() {
		start = System.currentTimeMillis();
	}

	public static long endAlgo() {
		end = System.currentTimeMillis();
		return end - start;
	}

}
