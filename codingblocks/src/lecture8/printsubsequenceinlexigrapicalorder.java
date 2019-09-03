package lecture8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class printsubsequenceinlexigrapicalorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, n;
		String str = new String();
		ArrayList<String> list = new ArrayList();
		Scanner s = new Scanner(System.in);
		System.out.println("enter number of strings");
		n = s.nextInt();
		for (i = 1; i <= n; i++) {
			// System.out.println("enter string "+i);
			str = s.next();
			ArrayList<String> templist = new ArrayList();
			templist = getss(str);
			Collections.sort(templist);
			for (j = 0; j <= templist.size() - 1; j++) {
				// if(!list.contains(templist.get(j)))
				{
					list.add(templist.get(j));
				}

			}
		}
		
		
     
		
		for (i = 0; i <= list.size() - 1; i++) {
			System.out.println(list.get(i));
		}

	}

	public static ArrayList<String> getss(String str) {
		int i;
		char cc;
		String ros;
		ArrayList<String> recresult = new ArrayList();
		ArrayList<String> myresult = new ArrayList();
		if (str.length() == 0) {
			ArrayList<String> base = new ArrayList();
			base.add("");
			return base;

		}

		cc = str.charAt(0);
		ros = str.substring(1);
		recresult = getss(ros);
		for (i = 0; i < recresult.size(); i++) {
			myresult.add(recresult.get(i));
			myresult.add(cc + recresult.get(i));

		}
		return myresult;

	}

}
