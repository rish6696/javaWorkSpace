package lecture5;

import java.util.Scanner;

public class arraymirrorinverse {

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
		mirrorarray(arr, brr);
		checkarray(arr, brr);

	}

	public static void mirrorarray(int[] arr, int[] brr) {
		int i,k,m=0;
		for(i=arr.length-1;i>=0;i--)
		{
			for(k=0;k<=arr.length-1;k++)
			{
				if(arr[k]==i)
				{
					m=k;
				}
			}
			brr[i]=m;
		}
		
		
	

	}

	public static void checkarray(int[] arr, int[] brr) {
		int i, m = 0;
		for (i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == brr[i]) {
				m++;
			}
		}
		if (m == arr.length) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
