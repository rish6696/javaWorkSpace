package hackerblockques;

import java.util.Scanner;

public class swapusingaddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.print(a+" ");
		System.out.println(b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print(a+" ");
		System.out.println(b);
		
	}

}
