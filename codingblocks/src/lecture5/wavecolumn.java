package lecture5;

import java.util.Scanner;

public class wavecolumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of rows");
		m=s.nextInt();
		System.out.println("enter number of columns");
		n=s.nextInt();
		int arr[][]= new int [m][n];
		takeinput(arr,m,n);
		print(arr,m,n);

	}
	public static void takeinput(int arr[][],int m,int n)
	{
		int i,j;
		Scanner s=new Scanner(System.in);
		
		for(i=0;i<=m-1;i++)
		{
			for(j=0;j<=n-1;j++)
			{
				System.out.println("enter the value for "+i+" row and "+j+" coloumn");
				arr[i][j]=s.nextInt();
			}
		}
		
	}
	public static void print(int arr[][],int m, int n)
	{
		int i,j;
		for(i=0;i<=n-1;i++)
		{
			if(i%2==0)
			{
				for(j=0;j<=m-1;j++)
				{
					System.out.print(arr[j][i]+", ");
				}
			}
			else
			{

				for(j=m-1;j>=0;j--)
				{
					System.out.print(arr[j][i]+", ");
				}
				
			}
			
		}
		System.out.print("END");
	}

	}


