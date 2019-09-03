package lecture1;

import java.util.Scanner;

public class printreverseofanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=0;
		
		System.out.println("enter the number to reverse");
		Scanner s = new Scanner (System.in);
		int n=s.nextInt();
		
		while(n!=0)
		{
			int a=n%10;
			 r=r*10+a;
			 n=n/10;
			
		}
		System.out.println(r);
		
		

	}

}
