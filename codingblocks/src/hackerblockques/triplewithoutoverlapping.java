package hackerblockques;

import java.util.Scanner;

public class triplewithoutoverlapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter a string");
		String str = s.next();
		int n = str.length();
		char[] arr = new char[n];

		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);

		}
		boolean[] brr=new boolean[n];
		int ans1 = triple1(arr, n,brr);
		int ans2=triple2(arr, n);
		System.out.println(ans2);
		System.out.println(ans1);

	}

	public static int triple1(char[] arr, int n,boolean[]brr) {
		int ans;
		

		if (n == 2) {
			return 0;

		}
		int rec = triple1(arr, n - 1,brr);
		if (arr[n - 1] == 'a' && arr[n - 2] == 'a' && arr[n - 3] == 'a'&&brr[n - 1] == false && brr[n - 2] == false && brr[n - 3] == false) {
			
			brr[n - 1] = true;
			brr[n - 2] = true;
			 brr[n - 3] = true;
			 ans = rec + 1;
			return ans;
		} else {
			return rec;
		}

	}
	public static int triple2(char[] arr, int n) {
		int ans;

		if (n == 2) {
			return 0;

		}
		int rec = triple2(arr, n - 1);
		if (arr[n - 1] == 'a' && arr[n - 2] == 'a' && arr[n - 3] == 'a') {
			ans = rec + 1;
			return ans;
		} else {
			return rec;
		}

}}
