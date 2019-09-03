package lecture3;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int n,cst,csp,row;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of n");
		n=s.nextInt();
		int nsp=0,nst=n;
		row=1;
		while(row<=2*n-1)
		{
			csp=1;
			while(csp<=nsp)
			{
				System.out.print("  ");
				csp++;
			}
			cst=1;
			while(cst<=nst){
				System.out.print("* ");
				cst++;
			}
			if(row>=n) {
			nsp=nsp-2;
			nst++;
			}
			else {
				nsp=nsp+2;
				nst--;
			}
			row++;
			System.out.println();
			
		}
		
		
		
		
		
		
	}

}
