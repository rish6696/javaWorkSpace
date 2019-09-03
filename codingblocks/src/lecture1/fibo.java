package lecture1;

import java.util.Scanner;

public class fibo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
         int f=0,sec=1,next=1,i,n;
         System.out.println("enter the value of n");
         Scanner s=new Scanner(system.in);
         n=s.nextInt();
         for(i=0;i<n-1;i++)
         {
        	 
        	 f=sec;
        	 sec=next;
        	 next=f+sec;
         }
         System.out.println(next);
	}
         
	

}
