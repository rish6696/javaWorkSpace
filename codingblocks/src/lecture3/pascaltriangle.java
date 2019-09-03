package lecture3;

import java.util.Scanner;

public class pascaltriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows,n,nst,cst,m;
		System.out.println(" enter the value of rows");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		nst=1;
		rows=1;
		
		while(rows<=n)
		{
			cst=1;
			while(cst<=nst)
			{
				m=combi(rows-1,cst-1);
				System.out.print(m+" ");
				cst++;
			}
			nst++;
			rows++;
			System.out.println();
		}
		

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
