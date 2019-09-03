package lecture9;

import java.util.Scanner;

import lecture3.power;
import lecture6.powerusingrecursion;

public class towerofhanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = "T1";
		String destination = "T2";
		String helper = "T3";

		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter value of n");
		n = s.nextInt();
		toh(n, source, destination, helper);
		int m = power(2, n) - 1;
		System.out.println(m);

	}

	public static void toh(int n, String source, String destination, String helper) {

		if (n == 0) {
			return;

		}
		if (n == 1) {
			System.out.println("Move "+n+"th disc from " + source + " to " + destination);
			return;

		}
		toh(n - 1, source, helper, destination);
		System.out.println("Move " + n + "th disc from " + source + " to " + destination);
		//toh(1, source, destination, helper);
		toh(n - 1, helper, destination, source);

	}

	public static int power(int a, int b) {
		if (b == 0) {
			return 1;
		}
		int m = a * power(a, b - 1);
		return m;
	}

}
