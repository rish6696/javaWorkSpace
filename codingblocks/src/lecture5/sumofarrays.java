package lecture5;

import java.util.Scanner;

public class sumofarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m;
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of first array");
		n=s.nextInt();
		int arr[]= new int[n];
		takeinput(arr,n);
		System.out.println("enter the size of 2nd array");
		m=s.nextInt();
		int brr[]= new int[m];
		takeinput(brr,m);
		if(m>n)
		{
			int crr[]=new int[m+1];
			  crr=sumofarrays(arr,n,brr,m,m+1);
			  if(crr[0]!=0)
			  {
				  display(crr,m+1);
			  }
			  else
			  {
				  display2(crr,m+1);
			  }
			  
		}
		else
		{
			int crr[]=new int[n+1];
			crr=sumofarrays(arr,n,brr,m,n+1);
			 if(crr[0]!=0)
			  {
				  display(crr,n+1);
			  }
			  else
			  {
				  display2(crr,n+1);
			  }
		}
		
		
		

	}
	public static void takeinput(int arr[],int n)
	{
		int i;
		Scanner s=new Scanner(System.in);
		for(i=0;i<=n-1;i++)
		{
			
			arr[i]=s.nextInt();
		}
	}
	public static int[] sumofarrays(int arr[],int n,int brr[],int m,int k)
	{
	     	int i=m-1,j=n-1,sum=0,carry=0;
	     	int ans[]=new int[k];
	     	
	     	while(i>=0&& j>=0)
	     	{
	     		sum=carry+arr[j]+brr[i];
	     		ans[k-1]=sum%10;
	     		carry=sum/10;
	     		i--;
	     		j--;
	     		k--;
	     		
	     		
	     	}
	     	while(i>=0)
	     	{
	     		sum=carry+brr[i];
	     		ans[k-1]=sum%10;
	     		carry=sum/10;
	     		i--;
	     		k--;
	     		
	     		
	     	}
	     	while(j>=0)
	     	{
	     		sum=carry+arr[j];
	     		ans[k-1]=sum%10;
	     		carry=sum/10;
	     		j--;
	     		k--;
	     		
	     		
	     	}
	     	if(carry!=0)
	     	{
	     		ans[0]=carry;
	     		
	     	}
	     	return ans;
	     	
	     	
	     	
	}
	public static void display(int arr[],int k)
	{
		int i;
		for(i=0;i<=k-1;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.print("END");
	
	
}
	public static void display2(int arr[],int k)
	{
		int i;
		for(i=1;i<=k-1;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.print("END");
	
	
}
}