package lecture6;

import java.util.Scanner;

public class pallincheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sub=new String();
		Scanner s=new Scanner(System.in);
		sub=s.next();
		int i,j,k=0;
		i=0;j=sub.length()-1;
		while(i<=j)
		{
			if(sub.charAt(i)==sub.charAt(j))
			{
				k++;
			}
			i++;
			j--;
		}
		if(sub.length()%2==1)
		{
			if(k==sub.length()/2+1)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}
		else {
			if(k==sub.length()/2)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}

	}

}
