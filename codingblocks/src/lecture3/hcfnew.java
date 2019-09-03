package lecture3;

import java.util.Scanner;

public class hcfnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,ans;
		Scanner s=new Scanner(System.in);
		System.out.println("enter two numbers");
		n1=s.nextInt();
		n2=s.nextInt();
		ans=lcm(n1,n2);
		System.out.println(ans);
		

	}
	public static int lcm(int n1, int n2)
	{
		int m=n1,i,j,k;
	      i=1;
	      while(m<=n1*n2)
	      {
	    	  m=n1*i;
	    	  j=1;k=n2;
	    	  while(m>k)
	    	  {
	    		 k=n2*j;
	    		  if(k==m)
	    		  {
	    			  return (n1*n2)/m;
	    		  }
	    		  j++;
	    	  }
	    	  i++;
	      }
	      return 0;
	}

	}


