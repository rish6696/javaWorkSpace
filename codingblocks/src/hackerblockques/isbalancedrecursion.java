package hackerblockques;

import java.util.ArrayList;
import java.util.Scanner;

public class isbalancedrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		String str=s.next();
		ArrayList<Character>output=new ArrayList<>();
		ArrayList<Character> list=isbalance(str,output);
		boolean ans=check(list);
		//System.out.println(list);
		System.out.println(ans);
		

	}
	public static ArrayList<Character> isbalance(String str,ArrayList<Character>output) {
		if(str.length()==0)
		{
			return output;
		}
		char cc=str.charAt(0);
		String ros=str.substring(1);
		if(cc=='['||cc==']'||cc=='{'||cc=='}'||cc=='('||cc==')')
		{
			output.add(cc);
		}
		return isbalance(ros, output);
				
				
		
	}
	public static boolean check(ArrayList<Character>list) {
		ArrayList<Character> already=new ArrayList<>();
		
		if(list.size()%2==1)
		{
			return false;
		}
		else
		{
			int i=0;
			
			while(i<=list.size()-1)
			{
				if(!already.contains(list.get(i)))
				{
					
				
				int flag=0;
				
				int n=list.get(i);
				int k;
				if(n==40)
				{
					k=41;
				}
				else
				{
					k=n+2;
				}
				
				for(int m=i+1;m<=list.size()-1;m++)
				{
					int x=list.get(m);
					if(k==x)
					{
						flag=1;
						already.add(list.get(m));
						break;
					}
					
				}
				if(flag==0)
				{
					return false;
				}
				i++;
				}
				else
				{
					i++;
				}
			}
			return true;
			//[a+{b+(c+d)+e}+f]
			//((]]))
		}
		
	}

}
