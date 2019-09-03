package lecture4;

import java.util.Scanner;

public class reversingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,i,num;
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of first array");
		n1=s.nextInt();
		int arr[]=new int[n1];
		System.out.println("enter the elements of first array");
		for(i=0;i<=n1-1;i++)
		{
			arr[i]=s.nextInt();
		}
		int[]ans=reversearray(arr,n1);
		for (int j = 0; j < ans.length; j++) {
			System.out.println(ans[j]);
			
		}
		
		
		

	}
	public static int[] reversearray(int[]arr,int n) {
		
		if(n==0)
		{
			int[]base=new int[1];
			return base;
		}
		int[]recans;
		
		recans=reversearray(arr, n-1);
		int[] ans=new int[n];
		ans[0]=arr[n-1];
		int k=0;
		for(int i=1;i<=ans.length-1;i++)
		{
			ans[i]=recans[k];
			k++;
		}
		return ans;
		
		
	}
	
	
}
