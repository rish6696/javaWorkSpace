package lecture13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import lecture13.linkedlistmyself.Node;

public class listkappend {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		linkedlistmyself list =new linkedlistmyself();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for (int i = 1; i <=n; i++) {
			list.addlast(s.nextInt());
			
		}
		int m=s.nextInt();
		if(m>n)
		{
			m=m%n;
		}
		
		
			
		
		int k=n-1;
		ArrayList<Node> appendlist=new ArrayList<>();
		for (int i = 1; i <=m; i++) {
			appendlist.add(list.getnodeAt(k));
			list.removeAt(k);
			k--;
		}
		Collections.reverse(appendlist);
		int x=appendlist.size()-1;
		while(x>=0)
		{
			list.addfirst(appendlist.get(x).data);
			x--;
		}
		list.display();
		}

	}


