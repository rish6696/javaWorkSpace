package lecture6;

import java.util.Scanner;

public class stringtoggle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		char temp;
		Scanner s=new Scanner(System.in);
		String str=new String();
		System.out.println("enter string");
		str=s.next();
		StringBuilder sb=new StringBuilder();
		for(i=0;i<=str.length()-1;i++)
		{
			temp=str.charAt(i);
			n=temp;
			if(n>=97)
			{
				n=n-32;
				temp=(char)n;
				sb.append(temp);
			}
			else
			{
				n=n+32;
				temp=(char)n;
				sb.append(temp);
			}
			
			
		}
		System.out.println(sb);
	}

}
