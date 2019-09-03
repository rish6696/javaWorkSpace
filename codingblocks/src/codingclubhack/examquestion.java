package codingclubhack;

import java.util.Scanner;

public class examquestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int A,B,C,N;
		A=s.nextInt();
		B=s.nextInt();
		C=s.nextInt();
		N=s.nextInt();
		int ans=N-(A+B-C);
		if(ans==0)
		{
			ans=-1;
		}
		System.out.println(ans);
		
		
		

	}

}
