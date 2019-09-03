package lecture4;

import java.util.Scanner;

public class linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		m=linearsearch(a,arr);
		System.out.println(m);		
}
	public static int linearsearch(int a,int arr[])
	{
		int i,n=0;
		for(i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==a)
			{
				n++;
				return i;
			
				
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
