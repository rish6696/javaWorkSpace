package lecture9;

import java.util.ArrayList;
import java.util.Scanner;

public class printmazepthwithdiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row, col;
		ArrayList<String> ans = new ArrayList();
		Scanner s = new Scanner(System.in);
		System.out.println("enter row");
		row = s.nextInt();
		System.out.println("enter column");
		col = s.nextInt();
		ans= getmazepath(row, col, 1, 1);
		System.out.println(ans.size());
		printMazePath(row, col, 1, 1,"");

	}
	public static void printMazePath(int er, int ec, int cr, int cc, String path) {
		if (cc == ec && cr == er) {
			System.out.print(path+" ");
			return;
		}
		if (cr > er || cc > ec) {
			return;
		}
		
		printMazePath(er, ec, cr + 1, cc, path + "V");
		printMazePath(er, ec, cr, cc + 1, path + "H");
		if(cr==cc)
		{
			
		
		printMazePath(er, ec, cr+1, cc + 1, path + "D");
		}


}
	public static ArrayList<String> getmazepath(int er, int ec, int cr, int cc) {
		int i;
		ArrayList<String> dians=new ArrayList();

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
		ArrayList<String> vertians = getmazepath(er, ec, cr + 1, cc);
        ArrayList<String> horians = getmazepath(er, ec, cr, cc + 1);
        if(cr==cc)
        {
		
	      dians = getmazepath(er, ec, cr + 1, cc+1);
        }
		for (i = 0; i < horians.size(); i++) {
			ans.add("H" + horians.get(i));
		}

		for ( i = 0; i < vertians.size(); i++) {
			ans.add("V" + vertians.get(i));
		}
		if(cr==cc)
		{
			
		
		for ( i = 0; i < dians.size(); i++) {
			ans.add("D" + dians.get(i));
		}
		}
		

		return ans;


	}

}
