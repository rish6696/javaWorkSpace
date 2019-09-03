package lecture3;

import java.util.Scanner;

public class validinvalid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,prev,counter,curr;
		boolean goingdown=true;
		Scanner s=new Scanner (System.in);
		n=s.nextInt();
		prev=s.nextInt();
		counter=1;
		while(counter<n)
		{
			curr=s.nextInt();
			if(prev<curr)
			{
				goingdown=false;
			}
			else
			{
				if(!goingdown)
				{
					System.out.println("false");
					return;
				}
				
				
			}
			prev=curr;
			counter++;
			
		}
		System.out.println("true");

	}

}
