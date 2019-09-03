package lecture1;

import java.util.Scanner;

public class lo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i, k = 0, m = 0;
		System.out.println("enter the number");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		if (n==2)
		{System.out.println("prime");
		
		}
		else
			
		{k = n / 2;
		for (i = 2; i<=k; i++) {
			if (n % i == 0) {
				System.out.println("number is not prime");
                break;
			} else {
				System.out.println("number is prime");
				break;
			}
		}

	}
	}
}
