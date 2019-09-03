package lecture3;

import java.util.Scanner;

public class hcfoftwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int n1,n2,i,m=0;
	    Scanner s=new Scanner(System.in);
	    n1=s.nextInt();
	    n2=s.nextInt();
	    if(n1%n2==0||n2%n1==0)
	    {
	    	if(n1<n2)
	    	{
	    		System.out.print(n1);
	    	}
	    	else {
	    		System.out.println(n2);
	    	}
	    }
	    else {
	    
	    i=2;
	    while(i<n1||n1==2)
	    {
	    	if(n1%i==0)
	    	{
	    		if(n2%i==0)
	    		{
	    			System.out.println(i);
	    			m++;
	    			return;
	    		}
	    	}
	    	i++;
	    }
	    if(m==0)
	    {
	    	System.out.println("1");
	    }
	    
	}

}
}