package lecture3;

import java.util.Scanner;

public class patternwithzeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,row,nnum,cnum;
		System.out.println("enter the value of n");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		nnum=1;
		row=1;
		while(row<=n)
		{
			cnum=1;
			while(cnum<=nnum)
			{
				if(cnum==1||cnum==nnum)
				{
					System.out.print(nnum+" ");
				}
				else {
					System.out.print("0 ");
				}
				cnum++;
			}
			nnum++;
			row++;
			System.out.println();
			
					
		}
		

	}

}
