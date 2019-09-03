package leetcode;

import java.util.ArrayList;
import java.util.Scanner;

public class largestpallinsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String lon="";
		
		
		for(int i=0;i<=str.length()-1;i++)
		{
			for(int j=i;j<=str.length();j++)
			{
				String sub=str.substring(i,j);
				
				if(isPallin(sub)&&sub.length()>lon.length())
				{
					lon=sub;
				}
			}
		}
		System.out.println(lon);
		
		
		
		

	}
	public static  boolean isPallin(String s)
	{
		int i=0;
		int j=s.length()-1;
		int n=1;
		while(n<=s.length()/2)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				return false;
			}
			i++;
			j--;
			n++;
		}
		return true;
		
	}

}
