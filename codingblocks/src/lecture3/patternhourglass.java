package lecture3;

import java.util.Scanner;

public class patternhourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row,n,nsp,csp,nn1,cn1,nz,cz,nn2,cn2;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value for row");
		n=s.nextInt();
		row=1;
		nsp=0;
		nn1=n;
		nn2=n;
		nz=1;
		while(row<=2*n+1)
		{
			csp=1;
			while(csp<=nsp)
			{
				System.out.print("  ");
				csp++;
			}
			cn1=nn1;
			while(cn1>=1)
			{
				System.out.print(cn1+" ");
				cn1--;	
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
				System.out.print(cn2+" ");
				cn2++;
			}
			if(row<n+1)
			{
				nsp++;
				nn1--;
				nn2--;
			}
			else 
			{
				nsp--;
				nn1++;
				nn2++;
				
				
			}
			row++;
			System.out.println();
			
		}
		

	}

}
