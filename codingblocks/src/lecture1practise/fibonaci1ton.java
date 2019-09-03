package lecture1practise;

import java.util.Scanner;

public class fibonaci1ton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long f = 0, sec = 1, i, n = 0, next = 0;
		System.out.println("enter the value of n");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		if (n == 1) {
			System.out.println("0");
		} else {
			System.out.println("0\n1");

			for (i = 0; i <= n - 3; i++) {
				next = f + sec;
				System.out.println(next);
				f = sec;
				sec = next;
			}
		}
	}

}
