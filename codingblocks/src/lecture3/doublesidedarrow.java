package lecture3;

import java.util.Scanner;

public class doublesidedarrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row,n,nsp1,csp1,nn1,cn1,csp2,nsp2,nn2,cn2;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		row=1;
		nsp1=n-1;
		nn1=1;
		nsp2=0;
		nn2=0;
		while(row<=n)
		{
			csp1=1;
			while(csp1<=nsp1)
			{
				System.out.print("  ");
				csp1++;
			}
			cn1=nn1;
			while(cn1>=1)
			{
				System.out.print(cn1+" ");
				cn1--;
			}
			csp2=1;
			while(csp2<=nsp2)
			{
				System.out.print("  ");
				csp2++;
			}
			cn2=1;
			while(cn2<=nn2)
			{
				System.out.print(cn2+" ");
				cn2++;
			}
			if(row==1)
			{
				nsp1=nsp1-2;
				nn1++;
				nsp2++;
				nn2=nn2+2;
			}
			else if(row==n-1)
			{
				nsp1=nsp1+2;
				nn1--;
				nsp2--;
				nn2=nn2-2;
				
			}
			else if(row<(n/2)+1)
			{
				nsp1=nsp1-2;
				nn1++;
				nsp2=nsp2+2;
				nn2++;
			}
			else 
			{
				nsp1=nsp1+2;
				nn1--;
				nsp2=nsp2-2;
				nn2--;
			}
			row++;
			System.out.println();
		}
		
		

	}

}
