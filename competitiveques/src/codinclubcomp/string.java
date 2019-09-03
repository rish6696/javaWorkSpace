package codinclubcomp;

import java.util.ArrayList;
import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		Scanner s=new Scanner(System.in);
		int test=s.nextInt();
		ArrayList<String> list =new ArrayList<>();
		for(int i=1;i<=test;i++)
		{
			int len=s.nextInt();
			list.add(s.next());
		}
		for(int i=0;i<=list.size()-1;i++)
		{
			String str=list.get(i);
			int sum=0;
			for(int j=0;j<=str.length()-1;j++)
			{
				sum=sum+(int)(str.charAt(j));	
			}
			if(isprime(sum))
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}

	}
	public static boolean isprime(int n)
	{
		int k=n/2;
		
        for(int i=2;i<=k;i++)
        {
     	   if(n%i==0)
     	   {
     		   return false;
     		   
     	   }
        }
       return true;
	}

}
