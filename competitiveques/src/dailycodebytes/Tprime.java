package dailycodebytes;

import java.util.Scanner;

public class Tprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[]arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			int m=arr[i];
			int nodivisor=0;
			for(int j=2;j<=(m-1);j++)
			{
				if(m%j==0)
				{
					nodivisor++;
				}
			}
			if(nodivisor==1)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}

	}

}
