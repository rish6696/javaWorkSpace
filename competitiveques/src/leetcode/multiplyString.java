package leetcode;

import java.util.Scanner;

public class multiplyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String num1=s.next();
		String num2=s.next();
		String ans=multiply(num1,num2);
		System.out.println(ans);

	}
	
	
	private static String multiply(String num1, String num2) {
		if(num1.equals("0")||num2.equals("0"))
		{
			return "0";
		}
		else {
			
		int no1=0;
		int no2=0;
		int i=1;
		String ans="";
		int ml=num1.length()-1;
		while(i<=num1.length())
		{
			
			int numvalue=(int)num1.charAt(i-1)-48;
			no1=no1+numvalue*(int)Math.pow(10, ml);
			ml--;
			i++;
			
		}
		i=1;
		ml=num2.length()-1;
		while(i<=num2.length())
		{
			
			int numvalue=(int)num2.charAt(i-1)-48;
			no2=no2+numvalue*(int)Math.pow(10, ml);
			ml--;
			i++;
			
		}
		long multiply=no1*no2;
		while(multiply>0){
			long cc=multiply%10;
			ans=ans+cc;
			multiply=multiply/10;
			
		}
	
		int j=ans.length()-1;
		String mm="";
		while(j>=0)
		{
		
			 mm=mm+ans.charAt(j);
			 j--;
		}
		
	
		
		
		
		
		return mm;
		
		
	}
	}
	
	

}
