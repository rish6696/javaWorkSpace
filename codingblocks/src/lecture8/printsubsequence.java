package lecture8;

import java.util.ArrayList;
import java.util.Scanner;

public class printsubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String();
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		str=s.next();
		printss(str,"");
		
		

	}
	public static void printss(String str,String res)
	{
		
		 ArrayList<String> list=new ArrayList();
		if (str.length() == 0) {
			
			System.out.println(res+" ");
			
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		printss(ros, res);
		
		printss(ros, res + cc);
		
		
		

	}
	

}
