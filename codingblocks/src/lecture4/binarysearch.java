package lecture4;

import java.util.Scanner;

public class binarysearch {

	public static void main(String[] args) {
		int n,i,a,m;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array");
		n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements of array");
		for(i=0;i<=n-1;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println(" enter the value of element to search");
		a=s.nextInt();		
		m=binarysearch(a,arr);
		System.out.println(m);

	}
	public static int binarysearch(int a,int arr[])
	{
		int left=0,right=arr.length-1,mid,n=0;
		while(left<=right)
		{
			mid=(left+right)/2;
			if(arr[mid]==a)
			{
				return mid;
			}
			else if(a<arr[mid])
			{
				right=mid-1;// return(at,mid-1rr,left)
			}
			else
			{
				left=mid+1;//return(arr,mid,right)
			}
			
		}
		if(n==0)
		{
			return -1;
		}
		else
		{
		return 0;
		}
		
		
	}
	
	

}
