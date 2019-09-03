package leetcode;

import java.util.Scanner;

public class searchin2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int[][]matrix= new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				matrix[i][j]=s.nextInt();
			}
		}
		int target=s.nextInt();
		boolean ans=searchMatrix(matrix,target);
		System.out.println(ans);
		
		

	}
	public static boolean searchMatrix(int[][]matrix,int target)
	{
		
		for(int i=0;i<=matrix.length-1;i++)
		{
			int[]brr=matrix[i];
			if(binarysearch(brr, target))
			{
				return true;
			}
		}
		return false;
		
	}
	public static boolean binarysearch(int[]arr,int target)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==target)
			{
				return true;
			}
			if(target>arr[mid])
			{
				low=mid+1;
			}
			if(target<arr[mid])
			{
				high=mid-1;
			}
					
		}
		return false;
	}
	public boolean searchinlineartime(int[][]matrix,int target)
	{
		int i=0,j=matrix[0].length-1;
		while(i<=matrix.length-1&&j>=0)
		{
			if(matrix[i][j]==target)
			{
				return true;
			}
			if(matrix[i][j]<target)
			{
				i++;
			}
			if(matrix[i][j]>target)
			{
				j--;
			}
		}
		return false;
	}

}
