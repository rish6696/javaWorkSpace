package practiserecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class allindices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.nextInt();
			
		}
		int data=s.nextInt();
		ArrayList<Integer>ans=allindices(arr,n,data);
		System.out.println(ans);

	}
	public static ArrayList<Integer> allindices(int[]arr,int n,int data) {
		
		if(n==0)
		{
			ArrayList<Integer> base=new ArrayList<>();
			return base;
		}
		ArrayList<Integer> reclist=allindices(arr, n-1, data);
		if(arr[n-1]==data)
		{
			reclist.add(n-1);
		}
		return reclist;
		
		
	}

}
