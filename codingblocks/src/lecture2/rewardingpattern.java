package lecture2;

import java.util.Scanner;

public class rewardingpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i, x, j, k, m, y, p;

		System.out.println("enter the value of n"); 
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		x = n / 2 + 1;
		y = (n - 1) / 2;
		for (i = 1; i <= n; i++) {
			if (i == x) {
				for (j = 1; j <= n; j++) {
					if (j == x) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}

				}

			} else if (i == 1 || i == n) {
				for (k = 1; k <= n; k++) {
					if (k == 1 || k == n) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}

				}

			} else {
				for (m = 2; m <= y; m++) {
					if (i == n - (n - m) || i == (n - m + 1)) {
						for (p = 1; p <= n; p++) {
							if (p == n - (n - m) || p == (n - m + 1)) {
								System.out.print("*");
							} else {
								System.out.print(" ");
							}
						}
					}
				}

			}
			System.out.println();

		}

	}
}
