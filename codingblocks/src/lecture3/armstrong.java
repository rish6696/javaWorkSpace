package lecture3;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,len,ans;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		len=lenth(n);
		ans=arm(n,len);
		if(n==ans)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		

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
	public static int arm(int n,int len)
	  {
		 int i=1,rem,ans=0,a=0;
		 while(i<=len)
		 {
			 rem=n%10;
			a=a+pow(rem,len);
			n=n/10;
			i++;
			 
		 }
		 return a;
		
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

