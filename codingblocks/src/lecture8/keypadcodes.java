package lecture8;

import java.util.ArrayList;
import java.util.Scanner;

public class keypadcodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter number");
		String str;
		str=s.next();
		ArrayList<String>ans=keypadcode(str);
		System.out.println(ans.size());
		for (int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i)+" ");
			
		}
	
		
		

	}
	public static ArrayList<String> keypadcode(String str) {
		
		if(str.length()==0)
		{
			ArrayList<String> base=new ArrayList();
			base.add("");
			return base;
			
		}
		char cc=str.charAt(0);
		String code=getcode(cc);
		ArrayList<String> recstring=new ArrayList<>();
		ArrayList<String> ans=new ArrayList<>();
		recstring=keypadcode(str.substring(1));
		for (int j = 0; j < code.length(); j++) {
			
			for (int i = 0; i < recstring.size(); i++) {
				ans.add(code.charAt(j)+recstring.get(i));
				
			}
		}
		
		return ans;
				
		
	}
	public static String getcode(char cc) {
		if(cc=='1')
		{
			return "abc";
		}
		else if(cc=='2')
		{
			return "def";
		}
		else if(cc=='3')
		{
			return "ghi";
		}
		else if(cc=='4')
		{
			return "jkl";
		}
		else if(cc=='5')
		{
			return "mno";
		}
		else if(cc=='6')
		{
			return "pqrs";
		}
		else if(cc=='7')
		{
			return "tuv";
		}
		else if(cc=='8')
		{
			return "wx";
		}
		else
		{
			return "yz";
		}
		
		
	}

}
