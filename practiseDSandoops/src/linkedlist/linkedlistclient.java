package linkedlist;

import java.util.Scanner;

public class linkedlistclient {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();

		
		Linkedlist list = new Linkedlist();

		for (int i = 0; i < N; i++) {
			list.addlast(scn.nextInt());
		}

		Linkedlist other = new Linkedlist();
		
		for (int i = 0; i < M; i++) {
			other.addlast(scn.nextInt());
		}

		Linkedlist ll=list.merge(other);
		ll.display();
		
		
		

	}

}
