package lecture3;

import java.util.Scanner;

public class bintodec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dec,bin;
		System.out.println(" enter the value of binary number");
		Scanner s=new Scanner(System.in);
		bin=s.nextInt();
		dec=dectobin(bin);
		System.out.println(dec);
		
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
			m=m*2;
		}
		}
		return m;
		
	}
	public static int dectobin(int dec0)
	{
		int rem=0,y=0,p=0,i=0;
		while(dec0!=0)
		{
			rem=dec0%10;
			p=power(i);
			y=y+rem*p;
			dec0=dec0/10;
			i++;
			
		}
		return y;
	}
	

}
