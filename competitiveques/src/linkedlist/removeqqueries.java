package linkedlist;

import java.util.ArrayList;
import java.util.Scanner;

public class removeqqueries {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Linkedlist list=new Linkedlist();
		int size=s.nextInt();
		int q=s.nextInt();
		ArrayList<Integer> qlist=new ArrayList<>();
		for(int i=1;i<=size;i++)
		{
			list.addlast(s.nextInt());
		}
		for(int i=1;i<=q;i++)
		{
			qlist.add(s.nextInt());
		}
		list.qqueries(q,qlist);
		
		
		
		

	}

}
