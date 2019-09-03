package lecture6;

import java.util.Scanner;

public class printsubscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i ,j;
		String str=new String();
		Scanner s=new Scanner(System.in);
		str=s.next();
		for(i=0;i<=str.length();i++)
		{
			for(j=i;j<=str.length();j++)
			{
				System.out.println(str.substring(i, j));
			}
		}
		

	}

}
