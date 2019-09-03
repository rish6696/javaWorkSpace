package codinclubcomp;

import java.util.Scanner;

public class patternnumbersandstarscb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int nnum,cnum,ns,cs,row;
		row=0;
		nnum=1;
		ns=n-1;
		while(row<n)
		{
			cnum=1;
			while(cnum<=nnum)
			{
				System.out.print(cnum);
				cnum++;
			}
			cs=1;
			while(cs<=ns)
			{
				System.out.print("*");
				cs++;
			}
			System.out.println();
			row++;
			nnum++;
			ns--;
		}
		
		

	}

}
