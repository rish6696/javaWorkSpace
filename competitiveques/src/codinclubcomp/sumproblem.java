package codinclubcomp;

import java.util.Scanner;

public class sumproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+power(-1, i)*i;
		}
		System.out.println(sum);

	}
	public static  int power(int a,int b)
	{
		int i=1,pow=1;
		while(i<=b)
		{
			pow=pow*a;
			i++;
			
		}
		return pow;

	}

}
