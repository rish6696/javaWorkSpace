package lecture10;

import java.util.Scanner;

public class powerusingtimecomplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,ans;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of number");
		a=s.nextInt();
		System.out.println("enter the value of exponenet");
		b=s.nextInt();
		ans=power(a,b);
		

	}
	public static int power(int a,int b)
	{
		
	}
	public static int power(int a,int b)
	{
		int i,pow;

		i=1;
		while(i<=b)
		{
			pow=pow*a;
			i++;
			
		}
		return pow;
	}
	

}
