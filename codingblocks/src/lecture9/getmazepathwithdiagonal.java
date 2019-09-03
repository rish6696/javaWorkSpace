package lecture9;

import java.util.ArrayList;
import java.util.Scanner;

public class getmazepathwithdiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row, col;
		Scanner s = new Scanner(System.in);
		System.out.println("enter row");
		row = s.nextInt();
		System.out.println("enter column");
		col = s.nextInt();
		ArrayList<String> ans = new ArrayList();
		ans = getmazepath(row, col, 1, 1);
		for(int i=0;i<ans.size();i++)
		{
			System.out.print(ans.get(i)+" ");
		}
		System.out.println(ans.size());

	}

	public static ArrayList<String> getmazepath(int er, int ec, int cr, int cc) {
		int i;

		if (cc == ec && cr == er) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		ArrayList<String> ans = new ArrayList();
        ArrayList<String> horians = getmazepath(er, ec, cr, cc + 1);
		ArrayList<String> vertians = getmazepath(er, ec, cr + 1, cc);
		ArrayList<String> dians = getmazepath(er, ec, cr + 1, cc+1);
		
		for (i = 0; i < horians.size(); i++) {
			ans.add("H" + horians.get(i));
		}

		for ( i = 0; i < vertians.size(); i++) {
			ans.add("V" + vertians.get(i));
		}
		for ( i = 0; i < dians.size(); i++) {
			ans.add("D" + dians.get(i));
		}
		

		return ans;

	}

}
