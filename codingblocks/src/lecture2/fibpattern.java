package lecture2;

import java.util.Scanner;

public class fibpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n,f=1,sec=1,next=0,k;
		System.out.println("enter number of rows");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			if(i==1)
			{
				System.out.println("0");
			}
			else if(i==2)
			{
				System.out.println("1\t1");
			}
			else {
				for(k=1;k<=i;k++)
				{
					next=f+sec;
					System.out.print(next+"\t");
					f=sec;
					sec=next;
					
					
				}
			}
			if(i>2&&i<=n) {
			System.out.println();

		}
		
		

	}

}
}
