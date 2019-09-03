package recursionquestions;

import java.util.Scanner;

public class series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int []arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.nextInt();
			
		}
		for (int i = 0; i < arr.length; i++) {
			
			int m=arr[i];
			int ans=fun(m);
			System.out.println(ans);
			
		}
		

	}
	public static int fun(int m) {
		if(m==1)
		{
			return -1;
		}
		
		int rec=fun(m-1);
		int ans=rec+(power(-1, m))*m;
		return ans;
		
		
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
