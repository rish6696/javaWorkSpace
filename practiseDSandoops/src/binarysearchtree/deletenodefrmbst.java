package binarysearchtree;

import java.util.ArrayList;
import java.util.Scanner;

public class deletenodefrmbst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int test=s.nextInt();
		ArrayList<int[]> mainlist=new ArrayList<>();
		for(int i=1;i<=test;i++)
		{
			int sa1=s.nextInt();
			int[]arr=new int[sa1];
			for (int j = 0; j < arr.length; j++) {
				arr[j]=s.nextInt();
			}
			int sa2=s.nextInt();
			int[]brr=new int[sa2];
			for (int j = 0; j < brr.length; j++) {
				brr[j]=s.nextInt();
			}
			mainlist.add(arr);
			mainlist.add(brr);
			
		}
		int x=0,y=1;
		while(x<=mainlist.size()-2&&y<=mainlist.size()-1)
		{
			int[]arr=mainlist.get(x);
			binarysearchtree tree=new binarysearchtree();
			for(int i=0;i<=arr.length-1;i++)
			{
				tree.add(arr[i]);
			}
			int[]brr=mainlist.get(y);
			for(int i=0;i<=brr.length-1;i++)
			{
				tree.remove(brr[i]);
			}
			tree.preorder();
			x++;
			y++;
		}
		
		

	}

}
