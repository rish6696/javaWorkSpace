package lecture6;

import java.util.Scanner;

public class stringcomprsion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k,max=0,j;
		char ans='a',i;
		String str=new String();
		Scanner s=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		System.out.println("enter string");
		str=s.next();
		
		for(i='a';i<='z';i++)
		{
			k=0;
			for(j=0;j<=str.length()-1;j++)
			{
				if(str.charAt(j)==i)
				{
					k++;
				}
				sb.append(i);
				sb.append(k);
			}
			
		}
		System.out.println(sb);

	}

}
