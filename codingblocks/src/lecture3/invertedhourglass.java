package lecture3;

import java.util.Scanner;

public class invertedhourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row,n,nn1,cn1,nsp,csp,nz,cz,nn2,cn2,m,p;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		row=1;
		nn1=1;
		nsp=2*n-1;
		nz=0;
		nn2=1;
		m=n;
		p=n;
		while(row<=2*n+1)
		{
			cn1=1;
			while(cn1<=nn1)
			{
				System.out.print(m+" ");
				m--;
				cn1++;
			}
			csp=1;
			while(csp<=nsp)
			{
				System.out.print("  ");
				csp++;		
			}
			cz=1;
			while(cz<=nz)
			{
				System.out.print("0 ");
				cz++;
			}
			cn2=1;
			while(cn2<=nn2)
			{
				System.out.print(p+" ");
				p++;
				cn2++;
			}
			if(row==n)
			{
				nsp--;
				nz++;
			}
			else if(row==n+1)
			{
				nsp++;
				nz--;
				
			}
			else if(row<n)
			{
				nn1++;
				nsp=nsp-2;
				nn2++;
			}
			else
			{
				nn1--;
				nsp=nsp+2;
				nn2--;
			}
			row++;
			m=n;
			if(row<=n)
			{	
			p=n-(row-1);
			}
			else if(row==n+1||row==n+2)
			{
				p=1;
				
			}
			else
			{
				p=row-1-n;
			}
			
			System.out.println();
			
		}
			
			
		
		
		
		

	}

}
