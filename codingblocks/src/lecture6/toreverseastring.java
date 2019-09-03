package lecture6;

import java.util.Scanner;

public class toreverseastring {

	public static void main(String[] args) {
		int i;
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		StringBuilder sb=new StringBuilder(s.next());
		StringBuilder rev=new StringBuilder();
		for(i=sb.length()-1;i>=0;i--)
		{
			rev.append(sb.charAt(i));
		}
		if(sb.toString().equals(rev.toString()))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		
		

	}

}
