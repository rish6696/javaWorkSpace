package arraypractise;

import java.util.Scanner;

public class mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
			
		}
		int[]ans=mergesort(0,arr.length-1,arr);
		for(int i=0;i<=ans.length-1;i++)
		{
			System.out.print(ans[i]+" ");
		}

	}
	public static int[] mergesort(int low,int high,int[]arr) {
		if(low==high)
		{
			int []base=new int[1];
			base[0]=arr[low];
			return base;
		}
		
		int mid=(low+high)/2;
		int[]farray=mergesort(low, mid, arr);
		int[]sarray=mergesort(mid+1, high, arr);
		int[]ans=merge(farray, sarray);
		return ans;
		
	}
public static int[] merge(int []arr1,int[]arr2) {
		
		int i=0;
		int j=0;
		int k=0;
		int[]ans=new int[arr1.length+arr2.length];
		while(i<arr1.length&&j<arr2.length)
		{
			if(arr1[i]<=arr2[j])
			{
				ans[k]=arr1[i];
				k++;
				i++;
			}
			else
			{
				ans[k]=arr2[j];
				k++;
				j++;
			}
		}
		while(j<arr2.length)
		{
			ans[k]=arr2[j];
			k++;
			j++;
		}
		while(i<arr1.length)
		{
			ans[k]=arr1[i];
			k++;
			i++;
		}
		return ans;
	}

}
