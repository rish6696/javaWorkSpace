package lecture7;

import java.util.Scanner;

public class nthtrianglereursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,ans;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		ans=tri(n);
		System.out.println(ans);
		
		

	}
	public static int tri(int n)
	{
		int m;
		if(n==1)
		{
			return 1;
		}
		else
		{
			m=tri(n-1)+n;
			return m;
		}
	}

}
