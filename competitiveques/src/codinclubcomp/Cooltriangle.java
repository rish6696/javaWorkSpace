package codinclubcomp;

import java.util.ArrayList;
import java.util.Scanner;

public class Cooltriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		ArrayList<Integer> one=new ArrayList<>();
		ArrayList<Integer> sec=new ArrayList<>();
		for(int i=1;i<=n;i++)
		{
			int f=s.nextInt();
			one.add(f);
			int b =s.nextInt();
			sec.add(b);
		}
		for(int i=0;i<=n-1;i++)
		{
			int p=one.get(i);
			int q=sec.get(i);
			int sml=Math.min(p, q);
			int big=Math.max(p, q);
			int smls=sml*sml;
			int bigs=big*big;
			int sum=bigs+smls;
			int diff=bigs-smls;
			if(isPerfectSquare(sum)||isPerfectSquare(diff))
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
			
			 
		      
	      }

	}
	public  static boolean isPerfectSquare(int x)  
	    { 
	          
	        // Find floating point value of 
	        // square root of x. 
	        int sr =(int) Math.sqrt(x); 
	      
	        // If square root is an integer 
	        return (sr*sr==x); 
	    } 

}
