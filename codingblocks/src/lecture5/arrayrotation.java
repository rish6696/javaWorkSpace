package lecture5;

import java.util.Scanner;

public class arrayrotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,k,i;
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of first array");
		n=s.nextInt();
		int arr[]= new int[n];
		takeinput(arr,n);
		System.out.println("enter the deegree of rotation");
		k=s.nextInt();
		if(k<0)
		{
			while(k<0)
			{
				k=k+arr.length;
				
			}
		}
		for(i=1;i<=k;i++)
		{
		   rotation(arr);
		   
		}
		 display(arr);
	}
	
	
	public static void takeinput(int arr[],int n)
	{
		int i;
		Scanner s=new Scanner(System.in);
		for(i=0;i<=n-1;i++)
		{
			System.out.println("enter the value of "+i+"th elemnt");
			arr[i]=s.nextInt();
		}
	}
	public static void display(int arr[])
	{
		int i;
		for(i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.print("END");
	
	
}
	public static void rotation(int arr[])
	{
		int i,j,m,temp;
		i=arr.length-1;
		j=i-1;
		m=1;
		while(m<=arr.length-1)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i--;
			j--;
			m++;
			
		}
		
	}
	

}
