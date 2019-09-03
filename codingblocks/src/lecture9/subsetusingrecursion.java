package lecture9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class subsetusingrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=s.nextInt();
		
		char []arr=new char[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.next().charAt(0);
			
		}
		System.out.println("enter target");
		char tar=s.next().charAt(0);
		ArrayList<String> ans=new ArrayList<>();
		Arrays.sort(arr);
		ans=subset(arr,n,tar);
		System.out.println(ans.size()-1);
		for (int i = 1; i < ans.size(); i++) {
			System.out.print(ans.get(i)+"  ");
			
		}
		
		

	}
	public static ArrayList<String> subset(char []arr,int n,char tar) {
		if (n==0) {
			ArrayList<String> base=new ArrayList<>();
			base.add("");
			return base;
			
		}
		ArrayList<String> ans=new ArrayList<>();
		ArrayList<String> recstring=new ArrayList<>();
		char m;
		int y;
		m=arr[n-1];
		y=(int)(tar-m);
		
		String r = Integer.toString(y);
		
		
		char[]crr=new char[r.length()];
		for (int i = 0; i < crr.length; i++) {
			crr[i]=r.charAt(i);
			
		}
		
		
		
	
		
		
		recstring=subset(arr, n-1, tar);
		for (int i = 0; i < recstring.size(); i++) {
			ans.add(recstring.get(i));
			
		}
		if(k==0)
		{
			ans.add(m+"");
		}
		else
		{
			for (int i = 0;i<=n-2; i++) {
				if (k==arr[i]) {
					ans.add(k+" "+m);
					
				}
				
			}
		}
		return ans;
		
		
		
	}

}
