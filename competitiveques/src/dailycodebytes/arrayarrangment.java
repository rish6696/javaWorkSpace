package dailycodebytes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayarrangment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[]arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.nextInt();
		}
		
		Arrays.sort(arr);
		
		int msi=0,mei=0,si=0,ei=0;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i+1]==arr[i]+1)
			{
				ei++;
			}
			else
			{
				if(ei-si+1>=mei-msi+1)
				{
					msi=si;
					mei=ei;
				}
				si=i+1;
				ei=i+1;
			}
			
		}
		for(int i=msi;i<=mei;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
