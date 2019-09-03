package lecture2;

import java.util.Scanner;

public class fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, f = 0, sec = 1, next = 0;
		System.out.println("enter the value of n");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		

			if (n == 0) {
				System.out.println("0");
			} else if (n == 1) {
				System.out.println("0");
				System.out.println("1");
				System.out.println("1");
			} else {
				System.out.println("0");
				System.out.println("1");
				while (next < n) {
					next = f + sec;
					if (next <= n) {
						System.out.println(next);
						f = sec;
						sec = next;

					} else {
						return;
					}
				}
			}

		}

	}

