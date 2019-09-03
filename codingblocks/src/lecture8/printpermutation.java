package lecture8;

import java.util.Scanner;

public class printpermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String();
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		str=s.next();
		printper(str,"");
	}
	public static void printper(String str,String res)
	{
		if (str.length() == 0) {
			System.out.print(res+" ");
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			printper(ros, res + cc);
		}

	}
	

}
