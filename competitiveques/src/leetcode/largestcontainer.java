package leetcode;

import java.util.Scanner;

public class largestcontainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[]height=new int[n];
		for (int i = 0; i < height.length; i++) {
			height[i]=s.nextInt();
		}
		int ans=largestcontainer(height);
		System.out.println(ans);

	}
	public static int largestcontainer(int[]height)
	{
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < height.length-1; i++) 
		{
			int ele=height[i];
			int area=0;
			int l=ele;
			for (int j = i+1; j < height.length; j++) 
			{
				if(height[j]!=0)
				{
					
				
				int b=j-i;
				
				
				l=Math.min(height[j],height[i]);
				area=l*b;
				if(area>max)
				{
					max=area;
				}
			}
			}
		}
		return max;
		
		
	}

}
