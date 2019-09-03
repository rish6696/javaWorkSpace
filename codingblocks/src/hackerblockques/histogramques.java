package hackerblockques;

import java.util.ArrayList;
import java.util.Scanner;

public class histogramques {

	public static void main(String[] args) {
	
		
		Scanner s=new Scanner(System.in);
		int maxarea=Integer.MIN_VALUE;
		int area=0;
		int nob=s.nextInt();
		ArrayList<int[]> barlist=new ArrayList<>();
		for(int i=1;i<=nob;i++)
		{
			int hob=s.nextInt();
			int[] arr=new int[hob];
			barlist.add(arr);
		}
		for(int i=0;i<barlist.size()-1;i++)
		{
			int[]brr=barlist.get(i);
			int counter;
			for(int j=1;j<=brr.length;j++)
			{
				counter=1;
				int m=i+1;
				while(barlist.get(m).length>=j)
				{
					counter++;
					m++;
					if(m>barlist.size()-1)
					{
						break;
					}
				}
				area=counter*j;
				if(area>maxarea)
				{
					maxarea=area;
				}
			}
		}
		System.out.println(maxarea);

	}

}
