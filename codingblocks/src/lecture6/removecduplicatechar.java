package lecture6;

import java.util.Scanner;

public class removecduplicatechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		String str=new String();
		StringBuilder sb=new StringBuilder();
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		str=s.next();
		i=0;
		while(i<=str.length()-1)
		{
			if(i==str.length()-1)
			{
				sb.append(str.charAt(i));
				i++;
			}
			else
			{
				if(str.charAt(i)==str.charAt(i+1))
				{
					sb.append(str.charAt(i));
					i=i+2;
				}
				else
				{
					sb.append(str.charAt(i));
					i++;
				}
			}
		}
		System.out.println(sb);
		
		

	}

}
