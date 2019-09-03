package codinclubcomp;

import java.util.ArrayList;
import java.util.Scanner;

public class sumoftwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int test=s.nextInt();
		ArrayList<Integer> list =new ArrayList<>();
		for(int i=1;i<=2*test;i++)
		{
			int temp=s.nextInt();
			list.add(temp);
		}
		for(int i=0;i<=list.size()-2;i=i+2)
		{
			int j=i+1;
			System.out.println(list.get(i)+list.get(j));
			j=j+2;
		}
		

	}

}
