package lecture9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class subsetusingrecursion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of array");
		int n = s.nextInt();

		String[] arr = new String[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.next();

		}
		System.out.println("enter target");
		String tar = s.next();
		ArrayList<String> ans = new ArrayList<>();
		Arrays.sort(arr);
		ans = subset(arr, n, tar);
		System.out.println(ans.size() - 1);
		for (int i = 1; i < ans.size(); i++) {
			System.out.print(ans.get(i) + "  ");

		}

	}

	public static ArrayList<String> subset(String[] arr, int n, String tar) {
		if (n == 0) {
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;

		}
		ArrayList<String> ans = new ArrayList<>();
		ArrayList<String> recstring = new ArrayList<>();

		recstring = subset(arr, n - 1, tar);
		for (int i = 0; i < recstring.size(); i++) {
			ans.add(recstring.get(i));

		}

		int tari = Integer.parseInt(tar);
		String m = arr[n - 1];
		int mi = Integer.parseInt(m);
		int req = tari - mi;

		int i = n - 2;
		String reqlist = "";

		while (req != 0 && i >= 0) {
			int arri = Integer.parseInt(arr[i]);

			if (arri <= req) {

				reqlist = reqlist + arr[i] + " ";
				req = req - arri;

			}
			i--;
		}
		if (req == 0) {
			ans.add(reqlist + "" + m);

		}

		return ans;

	}

}
