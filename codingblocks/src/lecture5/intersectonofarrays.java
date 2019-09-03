package lecture5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class intersectonofarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i,m=0,j,k,n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of arrray");
		size = s.nextInt();
		int arr[] = new int[size];
		for (i = 0; i <= arr.length - 1; i++) {
			System.out.println("enter the " + i + "th element");
			arr[i] = s.nextInt();
		}
		int brr[] = new int[size];
		for (i = 0; i <= arr.length - 1; i++) {
			System.out.println("enter the " + i + "th element");
			brr[i] = s.nextInt();
		}
		 ArrayList<Integer> list=new ArrayList<>();
		 
		 for(i=0;i<=arr.length-1;i++)
		 {
			 k=0;
			 n=0;
			 m=arr[i];
			 if(!list.contains(m))
			 {
				
				 
				 
				 for(j=0;j<=brr.length-1;j++)
				 {
					 if(brr[j]==m)
					 {
						 k++;
					 }
				 }
				 if(k>0)
				 {
					 for(j=0;j<=arr.length-1;j++)
					 {
						 if(arr[j]==m)
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
		 System.out.println(list);
}
}
