package lecture8;

import java.util.Scanner;

public class isbalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ans;
		Scanner s=new Scanner(System.in);
		String str=new String();
		System.out.println("enter string");
		str=s.next();
		ans=isbalance(str,str.length());
	    System.out.println(ans);
		
		
		

	}
	public static boolean isbalance(String str,int n)
	{
		boolean ans;
		char m;
		char p;
		int i,k=0,x=0;
		if(n==1)
		{
			return true;
		}
		if(isbalance(str,n-1)==true)
		{
			if(str.charAt(n-1)==')'||str.charAt(n-1)=='('||str.charAt(n-1)=='}'||str.charAt(n-1)=='{'||str.charAt(n-1)==']'||str.charAt(n-1)=='[')
			{
				ans=false;
				return ans;
			}
			else
			{
				ans=true;
				return ans;
			}
		}
		else
		{
			if(str.charAt(n-1)=='('||str.charAt(n-1)=='{'||str.charAt(n-1)=='[')
			{
				ans=false;
				return ans;
			}
			//char x=str.charAt(n-1);
			else if((int)(str.charAt(n-1))>=97&&(int)(str.charAt(n-1))<=122)
			{
				ans=false;
				return ans;
				
				
			}
			else
			{
				 m=str.charAt(n-1);
				if((int)( m)>90)
				{
					p=(char)((int)(m)-2);
				}
				else
				{
					p=(char)((int)(m)-1);
					
				}
				for(i=0;i<=n-2;i++)
				{
					if(str.charAt(i)==p)
					{
						k++;
					}
				}
				for(i=0;i<=n-2;i++)
				{
					if(str.charAt(i)==m)
					{
						x++;
					}
				}
				if(k==n)
				{
					return false;
				}
				else
				{
					return true;
				}
				
			}
		}
	}
	

}
