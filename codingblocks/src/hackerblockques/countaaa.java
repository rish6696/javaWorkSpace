package hackerblockques;

import java.util.Scanner;

public class countaaa {

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
		int ans = triple(arr, n);
		System.out.println(ans);

	}

	public static int triple(char[] arr, int n) {
		int ans;

		if (n == 2) {
			return 0;

		}
		int rec = triple(arr, n - 1);
		if (arr[n - 1] == 'a' && arr[n - 2] == 'a' && arr[n - 3] == 'a') {
			ans = rec + 1;
			return ans;
		} else {
			return rec;
		}

	}
}
