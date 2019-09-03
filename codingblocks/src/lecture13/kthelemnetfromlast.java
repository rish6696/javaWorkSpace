package lecture13;

import java.util.Scanner;

public class kthelemnetfromlast {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		linkedlistmyself list=new linkedlistmyself();
		Scanner s=new Scanner(System.in);
		int m;
		m=s.nextInt();
		if(m!=-1)
		{
			list.addlast(m);
		}
		while(m!=-1)
		{
			m=s.nextInt();
			if(m==-1)
			{
				break;
			}
			list.addlast(m);
		}
		int k=s.nextInt();
		
		list.reverseDI();
		int ans=list.getAt(k-1);
		System.out.println(ans);
				
		

	}

}
