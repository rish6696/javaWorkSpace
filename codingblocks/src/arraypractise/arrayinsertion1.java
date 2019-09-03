package arraypractise;

import java.util.Scanner;

public class arrayinsertion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int []arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.nextInt();
			
		}
		int pos=s.nextInt();
		int ele=s.nextInt();
		insertion(arr,pos,ele);
		
		

	}
	public static void insertion(int[]arr,int pos,int ele) {
		
		int[]ans=new int[arr.length+1];
		for(int i=0;i<=pos-2;i++)
		{
			ans[i]=arr[i];
		}
		ans[pos-1]=ele;
		for(int i=pos;i<=ans.length-1;i++)
		{
			ans[i]=arr[i-1];
		}
		print(ans);
		
	}
	public static void print(int[]arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
