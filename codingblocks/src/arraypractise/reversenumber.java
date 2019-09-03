package arraypractise;

import java.util.ArrayList;
import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String num=s.next();
		String ans=reversenumber(num);
		System.out.println(ans);
		
	}
	public static String reversenumber(String num) {
		
		String ans=new String();
		for(int i=0;i<=num.length()-1;i++)
		{
			int pos=position(num, i);
			int tba=searching(num, pos);
			ans=ans+tba;
			
		}
		return ans;
		
	}
	public static int position(String num,int index)
	{
		return num.length()-index;
	}
	public static int searching(String num,int pos)
	{
		for(int i=0;i<=num.length()-1;i++)
		{
			if(pos==num.charAt(i)-48 )
			{
				return position(num, i);
			}
		}
		return 0;
	}
	

}
