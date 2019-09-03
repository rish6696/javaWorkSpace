package lecture1practise;

import java.util.Scanner;

public class patternstar0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,k;
		System.out.println("enter the number of rows");
		Scanner s= new Scanner (System.in);
		n=s.nextInt();
		i=0;
		while(i<n)
		{
			k=0;
			while(k<n)
			{
				System.out.print("* ");
				k++;
			}
			
			System.out.println();
			i++;
			
			
			
		}

	}

}
