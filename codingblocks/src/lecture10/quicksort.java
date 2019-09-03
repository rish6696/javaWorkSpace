package lecture10;

import java.util.Scanner;

public class quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of  array");
		n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("enter elements of  array");
		takeinput(arr);
		quicksort(arr, 0, arr.length - 1);
		display(arr);

	}

	public static void takeinput(int arr[]) {
		int i;
		Scanner s = new Scanner(System.in);
		for (i = 0; i <= arr.length - 1; i++) {

			arr[i] = s.nextInt();
		}
	}

	public static void quicksort(int[] arr, int start, int end) {
		if (start >= end) {
			return;
		}
		int pindex = partition(arr, start, end);
		quicksort(arr, start, pindex - 1);
		quicksort(arr, pindex + 1, end);
	}

	public static int partition(int[] arr, int start, int end) {

		int pindex = start, i, pivot = arr[end], temp;
		for (i = start; i <= end - 1; i++) {
			if (arr[i] <= pivot) {
				temp = arr[i];
				arr[i] = arr[pindex];
				arr[pindex] = temp;
				pindex++;
			}
		}
		temp=arr[pindex];
		arr[pindex]=pivot;
		pivot=temp;
		return pindex;

	}

	public static void display(int arr[]) {
		int i;
		for (i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.print("END");

	}

}
