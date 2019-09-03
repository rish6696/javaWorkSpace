package codinclubcomp;

import java.util.Scanner;

public class patterr4practisecb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int tempn=n;
		int[]arr=new int[n];
		int i=0,j=arr.length-1;
		if(n%2==0)
		{
			for(int k=1;k<=n;k++)
			{
				if(k%2==1)
				{
					arr[j]=tempn;
					j--;
					tempn--;
				}
				else
				{
					arr[i]=tempn;
					tempn--;
					i++;
				}
			}
			
		}
		else
		{
			for(int k=1;k<=n;k++)
			{
				if(k%2==1)
				{
					arr[i]=tempn;
					i++;
					tempn--;
				}
				else
				{
					arr[j]=tempn;
					tempn--;
					j--;
				}
			}
		}
		for(int x=0;x<=arr.length-1;x++)
		{
			System.out.println(arr[x]);
		}
		
		

	}

}
