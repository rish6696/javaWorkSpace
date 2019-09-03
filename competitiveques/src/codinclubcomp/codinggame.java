package codinclubcomp;

import java.util.ArrayList;
import java.util.Scanner;

public class codinggame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		int skill=s.nextInt();
		int ans=Integer.MIN_VALUE;
		ArrayList<Integer>list=new ArrayList<>();
		
		for(int i=1;i<=n;i++)
		{
			list.add(s.nextInt());
		}
		for(int i=0;i<=list.size()-1;i++)
		{
			for(int j=i;j<=list.size()-1;j++)
	     	{
				sum=sum+(list.get(j)-skill);
			}
			if(sum>ans)
			{
				ans=sum;
			}
			sum=0;
		}
		System.out.println(skill+ans);
		
		
		

	}}