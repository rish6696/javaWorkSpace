package lecture3;

import java.util.Scanner;

public class dectooct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dec,db=8,ans;
		System.out.println(" enter the value of decimal number");
		Scanner s=new Scanner(System.in);
		dec=s.nextInt();
		
		
		ans=dectoany(dec,db);
		System.out.println(ans);
		
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
	

}

