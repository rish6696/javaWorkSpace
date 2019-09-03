package lecture8;

import java.util.ArrayList;
import java.util.Scanner;

public class printsubsequencebyabhinav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		ArrayList<String> af = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String str = s.next();
			af.add(str);
		}
		for (int j = 0; j < af.size(); j++) {

			ArrayList<String> arrr = getSS(af.get(j));

			ArrayList<String> arr = mergeSort(arrr, 0, arrr.size() - 1);
			for (int i = 0; i < arr.size(); i++) {
				System.out.println(arr.get(i));
			}
		}
	}

	public static ArrayList<String> getSS(String str) {
		if (str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> mylist = new ArrayList<>();

		ArrayList<String> recResult = getSS(ros);
		for (int i = 0; i < recResult.size(); i++) {
			mylist.add(recResult.get(i));
			mylist.add(cc + recResult.get(i));
		}

		return mylist;
	}

	public static ArrayList<String> merge(ArrayList<String> one, ArrayList<String> two) {
		ArrayList<String> sorted = new ArrayList<String>();
		int i = 0, j = 0;// k = 0;
		while (i < one.size() && j < two.size()) {
			if (one.get(i).compareTo(two.get(j)) < 0) {
				sorted.add(one.get(i));
				i++;
				// k++;
			} else {
				sorted.add(two.get(j));
				j++;
				// k++;
			}
		}
		while (i < one.size()) {
			sorted.add(one.get(i));
			i++;
			// k++;
		}

		while (j < two.size()) {
			sorted.add(two.get(j));
			j++;
			// k++;
		}

		return sorted;
	}

	public static ArrayList<String> mergeSort(ArrayList<String> arr, int low, int high) {
		if (low == high) {
			ArrayList<String> baseResult = new ArrayList<String>();
			baseResult.add(arr.get(low));
			return baseResult;
		}
		int mid = (low + high) / 2;
		ArrayList<String> fhalf = mergeSort(arr, low, mid);
		ArrayList<String> shalf = mergeSort(arr, mid + 1, high);
		ArrayList<String> ans = merge(fhalf, shalf);

		return ans;
	}

}
