package lecture9;

import java.util.Arrays;
import java.util.Scanner;

public class printlexinumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter a number");
		int n=s.nextInt();
		String []arr=new String [n+1];
		for(int i=0;i<=n;i++)
		{
			String k = Integer.toString(i);
			arr[i]=k;
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}
		
		

	}

}
