package lecture3;

import java.util.Scanner;

public class series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,m=0,n=1,a;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of n1");
		n1=s.nextInt();
		System.out.println("enter the value of n1");
		n2=s.nextInt();
		
		while(m!=n1)
		{
			a=3*n+2;
			if(a%n2!=0)
			{
				System.out.println(a);
				m++;
			}
			n++;
		}

	}

}
