package recursionquestions;

import java.util.ArrayList;
import java.util.Scanner;

public class gjgj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row,col;
		Scanner s=new Scanner (System.in);
		System.out.println("enter row");
		row=s.nextInt();
		System.out.println("enter column");
		col=s.nextInt();
		ArrayList<String> ans=new ArrayList();
		ans=getmazepath(row,col,1,1);
		System.out.println(ans.size());
		System.out.println(ans);

	}
	public static ArrayList<String> getmazepath(int er, int ec, int cr, int cc) {
		if (cc == ec && cr == er) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		ArrayList<String> myResult = new ArrayList<>();
		ArrayList<String> hResult = getmazepath(er, ec, cr, cc + 1);
		ArrayList<String> vResult = getmazepath(er, ec, cr + 1, cc);

		for (int i = 0; i < hResult.size(); i++) {
			myResult.add("H" + hResult.get(i));
		}

		for (int i = 0; i < vResult.size(); i++) {
			myResult.add("V" + vResult.get(i));
		}

		return myResult;
	}


}
