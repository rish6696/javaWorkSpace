package codinclubcomp;

import java.util.Scanner;

public class removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			int temp=s.nextInt();
			sum=sum+temp;
		}
		int tempsum=(n*(n-1))/2;
		System.out.println(sum-tempsum);
		
		

	}

}
