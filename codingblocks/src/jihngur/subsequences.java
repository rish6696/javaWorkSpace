package jihngur;

import java.util.ArrayList;
import java.util.Scanner;

public class subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new  Scanner (System.in);
		String str= new String();
		str=s.next();
		System.out.println((int )Math.pow(2,str.length()));
		System.out.println(sub(str));

	}
	public static ArrayList<String> sub(String str) {
		if(str.length()==0)
		{
			ArrayList<String>base=new ArrayList<>();
			base.add("");
			return base;
		}
		
		char c= str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> list=sub(ros);
		ArrayList<String> ans=new ArrayList<String>();
		for(int i =0 ;i<=list.size()-1;i++)
		{
			ans.add(list.get(i));
			
			ans.add(c+list.get(i));
		}
		return ans;
		
	}

}
