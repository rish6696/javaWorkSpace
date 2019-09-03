package codinclubcomp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class rankques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int stu=s.nextInt();
		int am=s.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		list.add(am);
		for(int i=1;i<=stu-1;i++)
		{
			list.add(s.nextInt());
		}
		Collections.sort(list);
		Collections.reverse(list);
		int pos=11;
		for(int i=0;i<=9;i++)
		{
			if(list.get(i)==am)
			{
				pos=i+1;;
			}
		}
		if(pos<=10)
		{
			System.out.println("Happy");
		}
		else
		{
			System.out.println("Not Happy");
		}
		
		

	}

}
