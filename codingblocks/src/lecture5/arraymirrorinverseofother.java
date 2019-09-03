package lecture5;

import java.util.Scanner;

public class arraymirrorinverseofother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i;
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of arrray");
    	n = s.nextInt();
		int arr[] = new int[n];
		for (i = 0; i <= arr.length - 1; i++) {
			System.out.println("enter the " + i + "th element");
			arr[i] = s.nextInt();
		}
		int brr[] = new int[n];
		for (i = 0; i <= arr.length - 1; i++) {
			System.out.println("enter the " + i + "th element");
			brr[i] = s.nextInt();
		}
		int crr[] = new int[n];
		
		mirrorarray(arr,crr);
		
		
		checkarray(crr,brr);
		

	}
	public static void checkarray(int[] crr, int[] brr) {
		int i, m = 0;
		for (i = 0; i <= brr.length - 1; i++) {
			if (crr[i] == brr[i]) {
				m++;
			}
		}
		if (m == brr.length) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}
	public static void mirrorarray(int[] arr, int[] crr) {
		int i,k,m=1;
		for(i=arr.length-1;i>=0;i--)
		{
			for(k=0;k<=arr.length-1;k++)
			{
				if(arr[k]==i)
				{
					m=k;
					
					
				}
				crr[i]=m;
			}
			
			
		}


}}