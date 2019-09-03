package lecture3;

import java.util.Scanner;

public class pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,row,cbs,nbs,cst1,nst1,cas,nas,nst2,cst2;
		System.out.println("enter the value of");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		nbs=0;
		
		nst1=1;
		nas=n-2;
		nst2=1;
		row=1;
		while(row<=n)
		{
			cbs=1;
			while(cbs<=nbs)
			{
				System.out.print(" ");
				cbs++;
			}
			cst1=1;
			while(cst1<=nst1)
			{
				System.out.print("*");
				cst1++;
			}
			cas=1;
			while(cas<=nas) {
				System.out.print(" ");
				cas++;
			}
			cst2=1;
			while(cst2<=nst2)
			{
				System.out.print("*");
				cst2++;
			}
			if(row==n/2)
			{
		       nbs++;
		       nas=0;
		       nst2=0;
			}
			else if(row<n/2)
			{
				nbs++;
				nas=nas-2;
				
			}
			else if(row==n/2+1)
			{
				nbs--;
				nas++;
				nst2++;
			}
			else {
				nbs--;
				nas=nas+2;
			}
			row++;
			System.out.println();
			
			
		}
		
		

	}

}
