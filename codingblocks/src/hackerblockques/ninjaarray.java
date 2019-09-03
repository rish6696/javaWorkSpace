package hackerblockques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ninjaarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	
	public static void intersection(int[] input1,int[]input2)
	{
		int size1,i,m=0,j,k,n,size2;
		Scanner s = new Scanner(System.in);
		//System.out.println("enter size of arrray");
		size1 = s.nextInt();
		 input1 = new int[size1];
		for (i = 0; i <= input1.length - 1; i++) {
			System.out.println("enter the " + i + "th element");
			input1[i] = s.nextInt();
		}
		size2=s.nextInt();
		 input2 = new int[size2];
		for (i = 0; i <= input2.length - 1; i++) {
			System.out.println("enter the " + i + "th element");
			input2[i] = s.nextInt();
		}
		 ArrayList<Integer> list=new ArrayList<>();
		 
		 for(i=0;i<=input1.length-1;i++)
		 {
			 k=0;
			 n=0;
			 m=input1[i];
			 if(!list.contains(m))
			 {
				
				 
				 
				 for(j=0;j<=input2.length-1;j++)
				 {
					 if(input2[j]==m)
					 {
						 k++;
					 }
				 }
				 if(k>0)
				 {
					 for(j=0;j<=input1.length-1;j++)
					 {
						 if(input1[j]==m)
						 {
							 n++;
						 }
					 }
					 if(k<=n)
					 {
						 for(j=1;j<=k;j++)
						 {
							 list.add( m);
							 
						 }
					 }
					 else
					 {
						 for(j=1;j<=n;j++)
						 {
							 list.add( m);
					 
						 }
						 
					 }
			}
			}
			 }
			
	     Collections.sort(list);
		// System.out.println(list);
	     for(int p=0;p<=list.size()-1;p++)
	     {
	    	 System.out.print(list.get(p)+" ");
	     }
	}

}
