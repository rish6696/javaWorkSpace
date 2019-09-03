package lecture7;

import java.util.Scanner;

public class whatisintheparenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String();
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		str=s.next();
		int n=str.length();
		String ans=print(str,n);
		System.out.println(ans);
		
		

	}
	public static String print(String str,int n)
	{
		String ans;
		int m;
		if(str.charAt(n-1)==')')
		{
			m=str.indexOf('(');
			ans=str.substring(m+1, n-1);
			return ans;
		}
		else
		{
			ans=print(str,n-1);
			return ans;
					
		}
		}


	}


