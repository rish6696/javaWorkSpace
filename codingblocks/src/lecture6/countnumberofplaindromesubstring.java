package lecture6;

import java.util.Scanner;

public class countnumberofplaindromesubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i ,j,k=0;
		boolean ans;
		System.out.println("enter string");
		Scanner s=new Scanner(System.in);
		String str=new String();
		str=s.next();
		String sub=new String();
		
		
		for(i=0;i<=str.length();i++)
		{
			
			
			for(j=i;j<=str.length();j++)
			{
				sub=str.substring(i,j);
				ans=pallincheck(sub);
				if(ans==true)
				{
					k++;
				}
			}
		}
		System.out.println(k);

	}
	public static boolean pallincheck(String sub)
	{
		if(sub.isEmpty())
		{
			return false;
		}
		else
		{
			
		
		int i,j,k=0;
		i=0;j=sub.length()-1;
		while(i<=j)
		{
			if(sub.charAt(i)!=sub.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	}}


