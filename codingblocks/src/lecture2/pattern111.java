package lecture2;

import java.util.Scanner;

public class pattern111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,k,p=1;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(k=1;k<=i;k++)
			{
				System.out.print(p+"\t");
				p++;
				
				
			}
			System.out.println();
	
		}

	}




	}


