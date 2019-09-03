package lecture8;

import java.util.ArrayList;
import java.util.Scanner;

public class subsequenceascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String();
		 ArrayList<String> list=new ArrayList();
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		str=s.next();
		list=getss(str);
		System.out.println(list);
		System.out.println(list.size());
		
		

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
			myresult.add((int)cc+recresult.get(i));
			
		}
		return myresult;
		


	}

}
