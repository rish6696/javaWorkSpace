package lecture7;

import java.util.Scanner;

public class patternusingrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter number of rows");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		pattern(n,1,1);

	}

	public static void pattern(int n,int row,int col)
	{
		if(row>n)
		{
			return;
		}
		if(col>row)
		{
			System.out.println();
			pattern(n,row+1,1);
			return;
		}
		System.out.print("*    ");
		pattern(n,row,col+1);
		

	}

}
