package lecture6;

import java.util.Scanner;

public class stringcompress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		char temp;
		String str=new String();
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		str=s.next();
		StringBuilder sb=new StringBuilder();
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
				
			
			k=1;
			temp=str.charAt(i);
			j=i+1;
			while(temp==str.charAt(j))
			{
				k++;
				j++;
				if(j>str.length()-1)
				{
					break;
				}
			}
			sb.append(temp);
			if(k>1)
			{
				sb.append(k);
				i=i+k;
			}
			else
			{
				i++;
			}
			
		}
		}
		System.out.println(sb);
		

	}

}
