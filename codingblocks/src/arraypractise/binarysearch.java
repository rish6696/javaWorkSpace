package arraypractise;

import java.util.Arrays;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr= {5,4,3,2,1};
		int data=5;
		Arrays.sort(arr);
		int index=binarysearch(arr, data);
		System.out.println(index);
		
		

	}
	public static int binarysearch(int[]arr,int data) {
		
		int left=0;
		int right=arr.length-1;
		int mid;
		while(left<=right)
		{
			mid=(left+right)/2;
			if(arr[mid]==data)
			{
				return mid;
			}
			else if(data>arr[mid])
			{
				left=mid+1;
			}
			else
			{
				right=mid-1;
			}
		}
		return -1;
		
	}

}
