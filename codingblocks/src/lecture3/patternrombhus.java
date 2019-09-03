package lecture3;

import java.util.Scanner;

public class patternrombhus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row, nsp1, csp1, nn1, cn1, nn2,cn2,nn3,cn3,n,p,q,m;
		System.out.println("enter the value of number of rows");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		row = 1;
		nsp1=n-1;
		nn1=0;
		nn2=1;
		nn3=0;
		m=1;
		while (row <= 2 * n - 1)
		{
			csp1 = 1;
			while (csp1 <= nsp1)
			{
				System.out.print("  ");
				csp1++;
			}
			cn1 = 1;
			p=nn1;
			while (cn1 <= nn1) 
			{
				
				System.out.print((p+1)+" ");
				p++;
				cn1++;
				
			}
			cn2=1;
			while(cn2<=nn2)
			{
				System.out.print(m+" ");
				cn2++;
			}
			cn3=1;
			q=2*nn3;
			while(cn3<=nn3)
			{
				System.out.print(q+" ");
				q--;
				cn3++;
			}
			if(row==1)
			{
				nsp1--;
				nn1++;
				nn3++;
			}
			else if(row==2*n-2)
			{
				nsp1++;
				nn1--;
				nn3--;
			}
			else if(row<n)
			{
				nsp1--;
				nn1++;
				nn3++;
			}
			else 
			{
				nsp1++;
				nn1--;
				nn3--;
			}
			if(row<n)
			{
				m=m+2;
			}
			else
			{
				m=m-2;
			}
			
			row++;
			
			System.out.println();
		}

	}

}
