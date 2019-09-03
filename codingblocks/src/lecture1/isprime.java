package lecture1;

import java.util.Scanner;

public class isprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               int n,i,k=0,m=0;
               System.out.println("enter the number");
               Scanner s= new Scanner(System.in);

               n=s.nextInt();
               
               k=n/2;
               for(i=2;i<=k;i++)
               {
            	   if(n%i==0)
            	   {
            		   System.out.println("number is not prime");
            		   m++;
            		   break;
            	   }
               }
               if(m==0)
               {
            	   System.out.println("number is prime");
               }
               
               
	}

}
