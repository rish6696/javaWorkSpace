package hackerblockques;

import java.util.Scanner;

public class singhamques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int prateekamount=0;
		int salary=1;
		int piggyfinal=0;
		
		int p;
		Scanner s=new Scanner(System.in);
//		int n=s.nextInt();
//		int[]arr=new int[n];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i]=s.nextInt();
//		}
		p=s.nextInt();
		while(piggyfinal<p)
		{
			
			piggyfinal=piggyfinal+salary;
			prateekamount++;
			if(piggyfinal==p)
			{
				break;
			}
			piggyfinal=piggyfinal*2;
			
			
			if(piggyfinal==p)
			{
				break;
			}
			
			
			
		}
		System.out.println(prateekamount);
		

	}

}
