package lecture3;

import java.util.Scanner;

public class hollowdiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row,nbs,cbs,nsp,csp,nas,cas,n;
		System.out.println("enter the value of rows");
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      nbs=(n+1)/2;
      nas=n-nbs;
      nsp=0;
      row=1;
      while(row<=n)
      {
    	  cbs=1;
    	  while(cbs<=nbs)
    	  {
    		  System.out.print("* ");
    		  cbs++;
    	  }
    	  csp=1;
    	  while(csp<=nsp)
    	  {
    		  System.out.print("  ");
    		  csp++;
    	  }
    	  cas=1;
    	  while(cas<=nas)
    	  {
    		  System.out.print("* ");
    		  cas++;
    	  }
    	  if(row==1)
    	  {
    		  nbs--;
    		  nsp++;
    	  }
    	  else if(row==n-1)
    	  {
    		  nbs++;
    		  nsp--;
    	  }
    	  else if (row<(n/2+1))
    	  {
    	    nbs--;
    	    nsp=nsp+2;
    	    nas--;
    	  }
    	  else
    	  {
    		  nbs++;
    		  nsp=nsp-2;
    		  nas++;
    	  }
    	  row++;
    	  System.out.println();
    	  
    	  
      }
		
		
		
				
	}

}

