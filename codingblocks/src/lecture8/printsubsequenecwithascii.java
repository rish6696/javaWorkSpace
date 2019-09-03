package lecture8;

import java.util.Scanner;

public class printsubsequenecwithascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String();
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		str=s.next();
		System.out.println((int)(Math.pow(3, str.length())));
		printss(str,"");
		
		

	}
	public static void printss(String str,String res)
	{
		int k=0;
		if (str.length() == 0) {
			System.out.print(res+" ");
			
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		printss(ros, res);
		printss(ros, res + cc);
		printss(ros,res+(int)(cc));
		

	}

	}


