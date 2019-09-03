package lecture8;

import java.util.ArrayList;
import java.util.Scanner;

public class subsequenecperlineassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     int n,i,j,m=0;
			String str=new String();
			 ArrayList<String> list=new ArrayList();
			Scanner s=new Scanner(System.in);
			System.out.println("enter number of elements per line");
			n=s.nextInt();
			System.out.println("enter string");
			str=s.next();
			list=getss(str);
			for(i=1;i<=list.size()/n;i++)
			{
				for(j=1;j<=n;j++)
				{
					System.out.print(list.get(m)+" ");
					m++;
				}
				System.out.println();
			}
			
			
			

		}
		public static  ArrayList<String> getss(String str)
		{
			int i;
			char cc;
			String ros;
			 ArrayList<String> recresult=new ArrayList();
			 ArrayList<String> myresult=new ArrayList();
			if(str.length()==0)
			{
				ArrayList<String> base=new ArrayList();
				base.add("");
				return base;
				
			}
			
			cc=str.charAt(0);
			ros=str.substring(1);
			recresult=getss(ros);
			for(i=0;i<recresult.size();i++)
			{
				myresult.add(recresult.get(i));
				myresult.add(cc+recresult.get(i));
				
			}
			return myresult;

	}

}
