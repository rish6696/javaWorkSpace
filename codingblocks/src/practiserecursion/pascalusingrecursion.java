package practiserecursion;

import java.util.Scanner;

public class pascalusingrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter number of rows");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		pattern(n,1,1);

	}

	public static void pattern(int n,int row,int col)
	{
		if(row>n)
		{
			return;
		}
		if(col>row)
		{
			System.out.println();
			pattern(n,row+1,1);
			return;
		}
		System.out.print(combi(row-1, col-1)+"  ");
		pattern(n,row,col+1);

	}
	public static int combi(int m, int n)
	{
		int p=(m-n),r;
		r=fact(m)/(fact(n)*fact(p));
		return r;
		
		
		
		
	}
	public static int fact(int n)
	{
		int i,fact=1;
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

}
