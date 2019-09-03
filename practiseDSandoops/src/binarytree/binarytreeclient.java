package binarytree;


import java.util.ArrayList;
import java.util.Scanner;

public class binarytreeclient {

	public static void main(String[] args) {
		// 50 true 25 true 12 false false true 86 false false true 75 true 41 false false true 87 false false
		// 50 1 25 1 12 0 0 1 86 0 0 1 75 1 41 0 0 1 87 0 0
		//10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false
		// 50 true 25 true 12 false false true 30 false false true 75 true 62 false false true 87 false false
		//1 true 2 true 4 false false false true 3 false false
		binarytree tree=new binarytree();
		Scanner s=new Scanner(System.in);
//		int d1=s.nextInt();
//		int d2=s.nextInt();
//		int m=tree.lowestcommonancestor(d1, d2);
//		System.out.println(m);
		tree.display();
		
		System.out.println(tree.trre2str());

}

}
