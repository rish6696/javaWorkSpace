package lecture6;

import java.util.Scanner;

public class stringsoddevenchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str=new String();
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		str=s.next();
		StringBuilder sb=new StringBuilder();
		StringBuilder ans=new StringBuilder();
		ans=oddeven(str,sb);
		System.out.println(sb);

	}
	public static StringBuilder oddeven(String str,StringBuilder sb)
	{
		int n,i;
		char temp;
		for(i=0;i<=str.length()-1;i++)
		{
			temp=0;
			n=0;
			if(i%2==0)
			{
				temp=str.charAt(i);
				n=temp;
				n++;
				temp=(char)n;
				sb.append(temp);
			}
			else
			{

				temp=str.charAt(i);
				n=temp;
				n--;
				temp=(char)n;
				sb.append(temp);
			}
		}
		return sb;
	}

}
