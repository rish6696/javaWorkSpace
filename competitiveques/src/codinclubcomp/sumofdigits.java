package codinclubcomp;

import java.util.ArrayList;
import java.util.Scanner;

public class sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int test=s.nextInt();
		ArrayList<Integer> list =new ArrayList<>();
		for(int i=1;i<=test;i++)
		{
			int temp=s.nextInt();
			list.add(temp);
		}
		for(int i=0;i<=list.size()-1;i++)
		{
			int num=list.get(i);
			int sum=0;
			while(num!=0)
			{
				sum=sum+num%10;
				num=num/10;
			}
			System.out.println(sum);
		}
	}

}
