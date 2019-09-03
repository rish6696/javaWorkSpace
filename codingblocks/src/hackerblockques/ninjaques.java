package hackerblockques;

public class ninjaques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int fi = 0;
		int si = 1;

		int[] ans = new int[arr.length];
		int i = 0;
		int j = ans.length - 1;
		int counter = 0;
		while (counter <= ans.length) {
			int fv = arr[fi];
			int sc = arr[si];
			ans[i] = fv;
			counter++;

			ans[j] = sc;
			counter++;
			if (counter == ans.length) {
				break;
			}
			if (counter == ans.length - 1) {
				si++;
				sc = arr[si];
				i++;
				ans[i] = sc;
				break;
			}
			fi = fi + 2;
			si = si + 2;
			i++;
			j--;

		}

		for (int l = 0; l < ans.length; l++) {
			System.out.print(ans[l] + " ");

		}

	}

}
