package lecture2;

import java.util.Scanner;

public class patternhw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,n;
		System.out.println("enter the value of n");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			if(i==1||i==n)
			{
				for(j=1;j<=n;j++)
				{
					System.out.print("*");
				}
			}
			else {
				for(k=1;k<=n;k++)
				{
					if(k==1||k==n)
					{
						System.out.print("*");
					}
					else
						System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
