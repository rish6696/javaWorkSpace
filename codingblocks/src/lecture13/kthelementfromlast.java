package lecture13;

import java.util.Scanner;

public class kthelementfromlast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedlistmyself list=new linkedlistmyself();
		System.out.println("enter element of list");
		Scanner s=new Scanner(System.in);

		while(s.nextInt()!=-1)
		{
			list.addlast(s.nextInt());
			
		}
		list.display();

	}

}
