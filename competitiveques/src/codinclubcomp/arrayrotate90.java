package codinclubcomp;

import java.util.Scanner;

public class arrayrotate90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[][]arr=new int[n][n];
		
		
		for(int i=0;i<=n-1;i++)
		{
			for(int j=n-1;j>=0;j--)
			{
				arr[j][i]=s.nextInt();
			}
		}

		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<=n-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
