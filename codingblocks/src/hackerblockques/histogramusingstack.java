package hackerblockques;

import java.util.Scanner;

import lecture11.stackusingaarays;

public class histogramusingstack {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		stackusingaarays stack=new stackusingaarays(10000000);
		Scanner s=new Scanner(System.in);
		int nob=s.nextInt();
		//int nob=1000000;
		int maxarea=0;
	
		int [] arr=new int[nob];
		for (int i = 0; i < arr.length; i++) {
			
			arr[i]=s.nextInt();
		}
		
		int i=0;
		while(i<=arr.length-1)
		{
			if(stack.IsEmpty()||arr[i]>=arr[stack.top()])
			{
				stack.push(i);
				i++;
			}
			else
			{
				maxarea=popping(stack, maxarea, arr, i);
				
			}
			
		}
		while(!stack.IsEmpty())
		{
			maxarea=popping(stack, maxarea, arr, i);
			
		}
		System.out.println(maxarea);
		
		

	}
	public static int popping(stackusingaarays stack,int maxarea,int[]arr,int i) throws Exception{
		int area;
		int top=stack.top();
		stack.pop();
		if(stack.IsEmpty())
		{
			area=arr[top]*i;
		}
		else
		{
			area=arr[top]*(i-stack.top()-1);
		}
		if(area>maxarea)
		{
			maxarea=area;
		}
		return maxarea;
		
		
	}

}
