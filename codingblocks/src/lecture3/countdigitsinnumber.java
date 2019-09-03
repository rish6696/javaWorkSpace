package lecture3;

import java.util.Scanner;

public class countdigitsinnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,dig,ans=0,rem=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of number");
		n=s.nextInt();
		System.out.println("enter the value of didgit");
		dig=s.nextInt();
		
		while(n!=0)
		{
			rem=n%10;
			if(rem==dig)
			{
				ans++;
			}
			n=n/10;
			
		}
		System.out.println(ans);
		
		
		
		

	}

}
