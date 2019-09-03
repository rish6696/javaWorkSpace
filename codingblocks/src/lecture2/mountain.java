package lecture2;

import java.util.Scanner;

public class mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" enter the value of n");
		int n,i,j,m,l,p,nth,k;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		nth=2*n-1;
		for(i=1;i<=n;i++)
		{
			if(i==n)
			{
				for(l=1;l<=n;l++)
				{
					System.out.print(l+" ");
				}
				for(p=n-1;p>=1;p--)
				{
					System.out.print(p+" ");
				}
			}
			else
			{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			for(k=1;k<=nth-2*i;k++)
			{
				System.out.print("  ");
			}
			for(m=i;m>=1;m--)
			{
				System.out.print(m+" ");
			}
			System.out.println();
		}
		

	}

}
}