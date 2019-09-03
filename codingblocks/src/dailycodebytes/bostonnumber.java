package dailycodebytes;

import java.util.ArrayList;
import java.util.Scanner;

public class bostonnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		ArrayList<Integer> primefactors=new ArrayList<>();
		for(int i=2;i<=n;i++)
		{
			if(isprime(i))
			{
				primefactors.add(i);
			}
		}
		ArrayList<Integer> list=new ArrayList<>();
		list=factors(n,primefactors);
//		System.out.println(list);
		int ans=isboston(n,list);
		System.out.println(list);
		System.out.println(ans);
		
		
		
		
		
		

	}
	public static boolean isprime(int n) {
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
		
	}
	public static ArrayList<Integer> factors(int n,ArrayList<Integer> primefactors) {
		int i=0;
		ArrayList<Integer> mylist=new ArrayList<>();
		
		
		while(n!=1)
		{
			
			int m=primefactors.get(i);
			if(n%m==0)
			{
				
					mylist.add(m);
				
				
				n=n/m;
				
			}
			else
			{
				i++;
			}
			
		}
		return mylist;



	}
	public static int isboston(int n,ArrayList<Integer> list) {
		
		int sumn=sumofdigits(n);
		int suml=0;
		for(int i=0;i<=list.size()-1;i++)
		{
			suml=suml+list.get(i);
			
		}
		if(suml/10!=0)
		{
			suml=sumofdigits(suml);
		}
		if(sumn==suml)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
		
	}
	public static int sumofdigits(int n) {
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		if(sum/10!=0)
		{
			sum=sumofdigits(sum);
		}
		
		return sum;
		
	}
	
	

}
