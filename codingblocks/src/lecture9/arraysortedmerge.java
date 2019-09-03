package lecture9;

import java.util.Scanner;

public class arraysortedmerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, m;
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of first array");
		n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("enter elements of first array");
		takeinput(arr);
		System.out.println("enter the size of 2nd array");
		m = s.nextInt();
		int brr[] = new int[m];
		System.out.println("enter elements of second array");
		takeinput(brr);
		int[] ans = new int[m + n];
		ans = merge(arr, brr);
		display(ans);

	}

	public static int[] merge(int[] arr, int[] brr) {
		int[] ans = new int[arr.length + brr.length];
		int m = arr.length - 1;
		int n = brr.length - 1;
		int p = ans.length - 1;
		int max, i;
		if (arr[m] > brr[n]) {
			max = arr[m];
			ans[p] = max;
			p--;
		} else {
			max = brr[n];
			ans[p] = max;
			p--;
		}
		while (p >= 0) {
			max--;
			for (i = 0; i <= arr.length - 1; i++) {
				if (arr[i] == max) {
					ans[p] = max;
					p--;
				}
			}
			for (i = 0; i <= brr.length - 1; i++) {
				if (brr[i] == max) {
					ans[p] = max;
					p--;
				}
			}
		}
		return ans;

	}

	public static void takeinput(int arr[]) {
		int i;
		Scanner s = new Scanner(System.in);
		for (i = 0; i <= arr.length - 1; i++) {

			arr[i] = s.nextInt();
		}
	}

	public static void display(int arr[]) {
		int i;
		for (i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.print("END");

	}
}
