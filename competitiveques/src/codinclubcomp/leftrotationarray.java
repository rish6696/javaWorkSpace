package codinclubcomp;

import java.util.ArrayList;
import java.util.Scanner;

public class leftrotationarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int test=s.nextInt();
		ArrayList<int []> list =new ArrayList<>();
		ArrayList<Integer> rot =new ArrayList<>();
		
		
		for(int i=1;i<=test;i++)
		{
			int size=s.nextInt();
			int[]arr=new int[size];
			int rota=s.nextInt();
			rota=rota%size;
			for(int j=0;j<=arr.length-1;j++)
			{
				arr[j]=s.nextInt();
			}
			list.add(arr);
			rot.add(rota);
		}
		for(int i=0;i<=list.size()-1;i++)
		{
			int[]arr=list.get(i);
			int rota=rot.get(i);
			for(int j=1;j<=rota;j++)
			{
				int temp=arr[0];
				for(int m=1;m<=arr.length-1;m++)
				{
					arr[m-1]=arr[m];
				}
				arr[arr.length-1]=temp;
			}
			for (int k = 0; k < arr.length; k++) {
				System.out.print(arr[k]+" ");
			}
			
		}

	}

}
