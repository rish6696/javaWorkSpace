package lecture1practise;

import java.util.Scanner;

public class prime2ton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,k,p=0,m=0;
		System.out.println("enter the value of n");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=2;i<=n;i++)
		{
			m=i/2;
			p=0;
			for(k=2;k<=m;k++)
			{
				if(i%k==0)
				{
					p++;
					break;
					
				}
				
			}
			if(p==0)
			{
				System.out.print(i);
			}
			
		}
		

	}

}
