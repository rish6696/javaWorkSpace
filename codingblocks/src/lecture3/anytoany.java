package lecture3;

import java.util.Scanner;

public class anytoany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int any,sb,db,ans;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of number in any sytem");
		any=s.nextInt();
		System.out.println("enter the value of base in that system");
		sb=s.nextInt();
		System.out.println("enter the value of base in which you want to convert");
		db=s.nextInt();
		
		ans=anytoany(any,sb,db);
		System.out.println(ans);
	}
	public static int anytoany(int any0,int sb0,int db0)
	{
		int dec,y;
		dec=anytodec(any0,sb0);
		y=dectoany(dec,db0);
		return y;
				
		
	}
	public static int anytodec(int any00,int sb00)
	{
		int rem=0,y=0,p=0,i=0;
		while(any00!=0)
		{
			rem=any00%10;
			p=power1(i,sb00);
			y=y+rem*p;
			any00=any00/10;
			i++;
			
		}
		return y;
	}
	public static int power1(int x,int sb0)
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
	public static int dectoany(int dec0,int db0)
	{
		int rem=0,y=0,p=0,i=0;
		while(dec0!=0)
		{
			rem=dec0%db0;
			p=power(i);
			y=y+rem*p;
			dec0=dec0/db0;
			i++;
			
		}
		return y;
	}
	public static int power(int x)
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
			m=m*10;
		}
		}
		return m;
		
	}
	
	

}
