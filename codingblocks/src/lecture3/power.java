package lecture3;

import java.util.Scanner;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,i,pow=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of number");
		a=s.nextInt();
		System.out.println("enter the value of exponenet");
		b=s.nextInt();
		
		i=1;
		while(i<=b)
		{
			pow=pow*a;
			i++;
			
		}
		System.out.println(pow);

	}

}
