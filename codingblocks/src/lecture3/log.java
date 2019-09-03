package lecture3;

import java.util.Scanner;

public class log {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,n;
		int ans;
		
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		n=s.nextInt();
		ans=funct(x,n);
		System.out.println(ans);
	}
	public static int funct(int x, int n)
	{
		
	    int ans;
	   
	   
	    ans=(int)((Math.log(x))/(Math.log(n)));
	    if(n==10)
	    {
		return ans+1;
	    }
	    else
	    {
	    	return ans;
	    }
	}
		
		
		

}


