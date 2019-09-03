package hackerblockques;

import java.util.ArrayList;
import java.util.Scanner;

public class subsetrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[]arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.nextInt();
		}
		int target=s.nextInt();
		String output="";
		ArrayList<String> list=new ArrayList<>();
		
		subset(arr,0,1,2,output,list,target,target);
		
		

	}
	public static void subset(int[]arr,int mi,int ii,int si,String output,ArrayList<String>list,int target,int req) {
		if(mi==arr.length)
		{
			
			System.out.println(list.size());
			for(int i=0;i<=list.size()-1;i++)
			{
				System.out.print(list.get(i)+" ");
			}
			return;
		}
		if(ii==arr.length&&output.length()!=0)
		{
			output= new String();
			subset(arr,mi+1,mi+2,mi+3, output, list, target, target);
			return;
		}
		if(si==arr.length&&output.length()>2)
		{
			output= new String();
			
			subset(arr,mi,ii+1,ii+2, output, list, target, target);
			return;
		}
		
		if(arr[mi]<=target)
		{
			if(output.length()==0)
			{
				output=output+arr[mi]+" ";
				req=req-arr[mi];
				if(req==0)
				{
					list.add(output);
					output=new String();
					
					subset(arr,mi+1,mi+2,mi+3,output, list, target, target);
					return;
				}
				subset(arr,mi,ii,si, output, list, target, req);
				return;
			}
			else if(output.length()==2)
			{
				if(arr[ii]<=req)
				{
					output=output+arr[ii]+" ";
					req=req-arr[ii];
					if(req==0)
					{
						list.add(output);
						output=new String();
						subset(arr,mi,ii+1,ii+2,output, list, target, target);
						return;
					}
					
					
					subset(arr,mi,ii,si,output, list, target, req);
					return;
					
					
				}
				//output=new String();
				subset(arr,mi,ii+1,ii+2,output, list, target, req);
				return;
				
				
				
				
			}
			
			else 
			{
				if(arr[si]<=req)
				{
					output=output+arr[si]+" ";
					req=req-arr[si];
					if(req==0)
					{
						list.add(output);
						output=new String();
						subset(arr,mi,ii+1,ii+2,output, list, target, target);
						return;
					}
					subset(arr,mi,ii,si+1,output, list, target, req);
					return;
				}
				subset(arr,mi,ii,si+1,output, list, target, req);
				return;
				
				
				
			}
		}
			
		else
		{
		
			subset(arr,mi+1,mi+2,mi+3,output, list, target, req);
			return;
			
		}
		
	}

		
		
	}

	

