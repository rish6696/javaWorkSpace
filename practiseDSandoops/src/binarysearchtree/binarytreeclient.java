package binarysearchtree;

import java.util.Scanner;

public class binarytreeclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		binarysearchtree tree=new binarysearchtree();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			int sc=s.nextInt();
			tree.add(sc);
			
		}
		tree.replacesumBST();
		tree.display();
		
}

}
