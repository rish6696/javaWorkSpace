package lecture3;

import java.util.Scanner;

public class torotatebyn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,k,len=0,a,num,num1,i,rem,q,r;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of n");
		n=s.nextInt();
		System.out.println("enter the deegre of rotation");
		k=s.nextInt();
		num=n;
		
		while(num!=0)
		{
			num=num/10;
			len++;
			
		}
		num1=n;
		if(k<0)
		{
			while(k<0)
			{
				k=k+len;
			}
			
		}	
		for(i=1;i<=k;i++)
		{
	        rem=num1%10;
			q=num1/10;
			r= rem*(int)Math.pow(10,(len-1))+q;
			num1=r;
		}
		System.out.println(num1);
	

}
}

