package lecture10;

import java.util.Scanner;

public class mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of  array");
		n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("enter elements of  array");
		takeinput(arr);
		int[] mergesort = mergesort(arr, 0, arr.length - 1);
		display(mergesort);

	}

	public static void takeinput(int arr[]) {
		int i;
		Scanner s = new Scanner(System.in);
		for (i = 0; i <= arr.length - 1; i++) {

			arr[i] = s.nextInt();
		}
	}

	public static int[] mergesort(int[] arr, int low, int high) {
		if (low == high) {
			int[] base = new int[1];
			base[0] = arr[low];
			return base;

		}
		int mid = (low + high) / 2;
		int[] one = mergesort(arr, low, mid);
		int[] two = mergesort(arr, mid + 1, high);
		int[] ans = merge(one, two);
		return ans;
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

	public static void display(int arr[]) {
		int i;
		for (i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.print("END");

	}

}
