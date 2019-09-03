package lecture6;

import java.util.Scanner;

public class recursionfactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,ans;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value to cal factorial");
		n=s.nextInt();
		ans=fact(n);
		System.out.println(ans);

	}
	public static int fact(int n)
	{
		int m;
		if(n==1)
		{
			return 1;
		}
		m=n*fact(n-1);
		return m;
	}

}
