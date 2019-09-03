package lecture8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class printperutationlargerthangiven {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int i,j;
			String str=new String();
			
			 ArrayList<String> list=new ArrayList();
			Scanner s=new Scanner(System.in);
			System.out.println("enter string");
			str=s.next();
			list=permutation(str);
			Collections.sort(list);
			//System.out.println(list);
			
			for(i=0;i<=list.size()-1;i++)
			{
				if(list.get(i).compareTo(str)>0)
				{
					for( j=i;j<=list.size()-1;j++)
					{
						System.out.println(list.get(j));
						
					}
					break;
				}
				//break;
			}
			
			
		
			
			
			

		}
		public static  ArrayList<String> permutation(String str)
		{
			int i,j;
			 ArrayList<String> recresult=new ArrayList();
			 ArrayList<String> myresult=new ArrayList();
			 String recstring=new String ();
			char cc;
			String ros;
			if(str.length()==0)
			{
				ArrayList<String> base=new ArrayList();
				base.add("");
				return base;
				
			}
			cc=str.charAt(0);
			ros=str.substring(1);
			recresult=permutation(ros);
			for(i=0;i<recresult.size();i++)
			{
				recstring=recresult.get(i);
				for(j=0;j<=recstring.length();j++)
				{
					String mystring=recstring.substring(0, j)+cc+recstring.substring(j);
					if(!myresult.contains(mystring))
					{
						myresult.add(mystring);
					}
					
						
					
				}
			}
			return myresult;
		}

	}
