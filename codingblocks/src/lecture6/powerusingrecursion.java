package lecture6;

import java.util.Scanner;

public class powerusingrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a");
		a=s.nextInt();
		System.out.println("enter b");
		b=s.nextInt();
		 int ans=power(a,b);
		 System.out.println(ans);
		

	}
	public static int power(int a, int b)
	{
		if(b==0)
		{
			return 1;
		}
		int m=a*power(a,b-1);
		return m;
	}

}
