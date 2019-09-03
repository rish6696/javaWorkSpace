package lecture2;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,i,sp,st;
		System.out.println("enter the value of n");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();   		
		for(i=1;i<=n;i++)
		{
				
			for(sp=1;sp<=2*i-2;sp++)
			{
				System.out.print(" ");
			}
			for(st=n;st>=i;st--)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
		
		

	}

}

