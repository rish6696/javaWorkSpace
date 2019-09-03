package lecture8;

import java.util.Scanner;

public class recursiontwins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String();
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		str=s.next();
		int n=str.length();
		int ans=twins(str,n);
		System.out.println(ans);
		
		

	}
	public static int twins(String str,int n)
	{
		int ans;
		if(n==2)
		{
			return 0;
		}
		if(str.charAt(n-1)==str.charAt(n-3))
		{
			ans=twins(str,n-1)+1;
			return ans;
		}
		else
		{
			ans=twins(str,n-1);
			return ans;
		}
		
	}
	

}
