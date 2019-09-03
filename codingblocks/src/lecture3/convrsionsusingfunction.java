package lecture3;

import java.util.Scanner;

public class convrsionsusingfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int dec,bin;
             System.out.println(" enter the value of decimal number");
             Scanner s=new Scanner(System.in);
             dec=s.nextInt();
             bin=dectobin(dec);
             System.out.println(bin);
             
             
	}
	public static int power(int x)
	{
		if(x==0)
		{
			return 1;
		}
		else {
		int y=1,i;
		for(i=1;i<=x;i++)
		{
			y=y*10;
		}
		return(y);
		
	}
	}
	
	public static int dectobin(int dec)
	{
		int a,b=0,m,c=0;
		while(dec!=0)
		{
			
			a=dec%2;
			m=power(c);
			b=b+a*m;
			dec=dec/2;
			c++;
			                                        
			
		}
		return(b);
	}
	

}
