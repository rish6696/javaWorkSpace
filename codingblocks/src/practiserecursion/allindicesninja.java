package practiserecursion;

import java.util.Scanner;

public class  allIndexesninja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int[]input=new int[size];
		for(int i=0;i<=input.length-1;i++)
		{
			input[i]=s.nextInt();
		}
		int tagr=s.nextInt();
		int[]ans= allIndexes(input,tagr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
		
		
	}
	public static int[]  allIndexes(int[]input,int x) {
		if(input.length==0)
		{
			return input;
		}
		
		int[]newinput=new int[input.length-1];
		for (int i = 0; i < newinput.length; i++) {
			newinput[i]=input[i];
			
			
		}
		int[]recarray= allIndexes(newinput, x);
		if(input[input.length-1]==x)
		{
			int[]ans=new int[recarray.length+1];
			ans[ans.length-1]=input.length-1;
			for(int i=0;i<=ans.length-2;i++)
			{
				ans[i]=recarray[i];
			}
			return ans;
					
		}
		else
		{
			return recarray;
		}
		
		
		
	}

}
