package lecture7;

import java.util.Scanner;

public class removeduplicateusingrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		StringBuilder str=new StringBuilder(s.next());
		
		
		StringBuilder ans=new StringBuilder();
		n=str.length();
		ans=formatting(str,n);
		System.out.println(ans);
		
		

	}
	public static StringBuilder formatting(StringBuilder str,int n)
	{
		char m;
		StringBuilder ans=new StringBuilder();
		if(n==1)
		{
			StringBuilder base=new StringBuilder();
			base.append(str.charAt(0));
			return base;
			
		}
		if(str.charAt(n-1)==str.charAt(n-2))
		{
			m=str.charAt(n-1);
			StringBuilder temp=new StringBuilder();
			
			temp.append('*');
			temp.append(m);
			ans=formatting(str,n-1).append(temp);
			return ans;
		}
		else
		{
			ans=formatting(str,n-1);
			ans.append(str.charAt(n-1));
			
			return ans;
		}
		
		
	}
	

}
