package lecture3;

import java.util.Scanner;

public class armstrongbetweenniton2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,i,b;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of n1");
		n1=s.nextInt();
		System.out.println("enter the value of n2");
		n2=s.nextInt();
		for(i=n1+1;i<=n2;i++)
		{
			b=armstrong(i);
			if(b==i)
			{
				System.out.print(i+" ");
			}
		}
		

	}
	public static int armstrong(int n)
	{
		int a=0,rem,len;
		len=lenth(n);
		while(n!=0)
		{
			rem=n%10;
			
			a=a+pow(rem,len);
			n=n/10;
			
			
		}
		return a;
	}
	public static int lenth(int num)
	{
		int rem,len=0;
		while(num!=0)
		{
			num=num/10;
			len++;
			
		}
		return len;
	}
	public static int pow(int rem,int len)
	{
		int m=1,j;
		if(len==0)
		{
			return 1;
		}
		else
		{
		for(j=1;j<=len;j++)
		{
			m=m*rem;
		}
		}
		return m;
}	

}
