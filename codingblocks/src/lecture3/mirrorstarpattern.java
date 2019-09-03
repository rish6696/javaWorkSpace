package lecture3;

import java.util.Scanner;

public class mirrorstarpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row,nsp,csp,nst,cst,n;
		System.out.println("enter the value of number of rows");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		row=1;
		nsp=n/2;
		nst=1;
		while(row<=n)
		{
			csp=1;
			while(csp<=nsp)
			{
				System.out.print("  ");
				csp++;
			}
			cst=1;
			while(cst<=nst)
			{
				System.out.print("* ");
				cst++;
			}
			if(row<n/2+1)
			{
				nsp--;
				nst=nst+2;
			}
			else {
				nsp++;
				nst=nst-2;
			}
			row++;
			System.out.println();
				
		}
		

	}

}
