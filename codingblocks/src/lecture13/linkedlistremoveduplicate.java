package lecture13;

import java.util.ArrayList;
import java.util.Scanner;

public class linkedlistremoveduplicate {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		int m,i,n,j,k;
		ArrayList<linkedlistmyself> mylist=new ArrayList<>();
		System.out.println("enter test cases");
		Scanner s = new Scanner(System.in);
		
		m=s.nextInt();
		for(i=1;i<=m;i++)
		{
			linkedlistmyself obj=new linkedlistmyself();
			mylist.add(obj);
			System.out.println("enter the size of "+i+"th list");
			n=s.nextInt();
			for(j=0;j<=n-1;j++)
			{
				obj.addlast(s.nextInt());
			}
			
			
		}
		for(k=0;k<=mylist.size()-1;k++)
		{
			for (int l = 0; l < mylist.get(k).size()-1; l++) {
				if (mylist.get(k).getnodeAt(l).data==mylist.get(k).getnodeAt(l+1).data) {
					mylist.get(k).removeAt(l+1);
					
				}
				
			}
		}
		
		for(k=0;k<=mylist.size()-1;k++)
		{
			mylist.get(k).display();
			System.out.println();
		}
		
		
		
		
		

	}

}
