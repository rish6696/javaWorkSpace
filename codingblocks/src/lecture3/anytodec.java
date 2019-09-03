package lecture3;

import java.util.Scanner;

public class anytodec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dec,any,sb;
		System.out.println(" enter the value of number in any system");
		Scanner s=new Scanner(System.in);
		any=s.nextInt();
		System.out.println("enter the base in that system");
		sb=s.nextInt();
		
		dec=anytodec(any,sb);
		System.out.println(dec);
		
	}
	
	public static int power(int x,int sb0)
	{
		int m=1,j;
		if(x==0)
		{
			return 1;
		}
		else
		{
		for(j=1;j<=x;j++)
		{
			m=m*sb0;
		}
		}
		return m;
		
	}
	public static int anytodec(int any0,int sb0)
	{
		int rem=0,y=0,p=0,i=0;
		while(any0!=0)
		{
			rem=any0%10;
			p=power(i,sb0);
			y=y+rem*p;
			any0=any0/10;
			i++;
			
		}
		return y;
	}
	

}
