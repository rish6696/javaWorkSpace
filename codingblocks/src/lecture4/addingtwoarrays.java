package lecture4;

import java.util.Scanner;

public class addingtwoarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,i,num1,num2,ans1,rev;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of first array");
		n1=s.nextInt();
		int arr[]=new int[n1];
		System.out.println("enter the elements of first array");
		for(i=0;i<=n1-1;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("enter the size of second array");
		n2=s.nextInt();
		int brr[]=new int[n2];
		System.out.println("enter the elements of second array");
		for(i=0;i<=n2-1;i++)
		{
			brr[i]=s.nextInt();
		}
		num1=nummaker(arr,n1);
		num2=nummaker(brr,n2);
		ans1=num1+num2;
		rev=reverse(ans1);
		show(rev);
		
		
	}
	public static int nummaker(int nrr[],int n)
	{
		int i,num=0;
		for(i=0;i<=n-1;i++)
		{
			num=num*10+ nrr[i];
		}
		return num;
	}
	public static int reverse(int num)
	{
		int rem,rev=0;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}
	public static void show(int num)
	{
		int rem;
		while(num!=0)
		{
			rem=num%10;
			System.out.print(rem+", ");
			num=num/10;
		}
		System.out.print("END");
		
	}
	
	
	

}
