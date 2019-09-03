package hackerblockques;

import java.util.Scanner;

public class whatisinparenthesisrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		
		String ans=parenthesis(str,false,"");
		System.out.println(ans);
		System.out.println(ans.substring(1));
		
		

	}
	public static String parenthesis(String str,boolean can,String output) {
		if(str.length()==0)
		{
			return output;
		}
		
		char cc=str.charAt(0);
		String ros=str.substring(1);
		if(cc=='(')
		{
			can=true;
		}
		if(cc==')')
		{
			can=false;
		}
		if(can==true)
		{
			output=output+cc;
		}
		return parenthesis(ros, can, output);
	}

}
