package codinclubcomp;

import java.util.ArrayList;
import java.util.Scanner;

public class reverseofnumber {

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
			int temp=0;
			while(num!=0)
			{
				temp=temp*10+num%10;
				num=num/10;
			}
			System.out.println(temp);
		}

	}

}
