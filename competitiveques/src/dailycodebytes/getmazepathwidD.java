package dailycodebytes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class getmazepathwidD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		ArrayList<String>ans=getmazepathwidD(n-1,n-1,0,0);
		System.out.println(ans.size());
		for (int i = 0; i < ans.size(); i++) {
			
			System.out.print(ans.get(i)+" ");
		}

	}
	public static  ArrayList<String> getmazepathwidD(int er,int ec,int cr,int cc)
	{
		if(cr>er||cc>ec)
		{
			ArrayList<String>base=new ArrayList<>();
			return base;
		}
		if(cr==er&&cc==ec)
		{
			ArrayList<String>base=new ArrayList<>();
			base.add("");
			return base;
		}
		ArrayList<String> hresult=getmazepathwidD(er, ec, cr, cc+1);
		ArrayList<String> vresult=getmazepathwidD(er, ec, cr+1, cc);
		ArrayList<String> dresult=new ArrayList<>();
		if(cr==cc)
		{
		
		
		dresult=getmazepathwidD(er, ec, cr+1, cc+1);
		}
	
		ArrayList<String> ans=new ArrayList<>();
		for(int i=0;i<=vresult.size()-1;i++)
		{
			ans.add("V"+vresult.get(i));
		}
		for(int i=0;i<=hresult.size()-1;i++)
		{
			ans.add("H"+hresult.get(i));
		}
		
		for(int i=0;i<=dresult.size()-1;i++)
		{
			ans.add('D'+dresult.get(i));
		}
		
		return ans;
		
	}

}
