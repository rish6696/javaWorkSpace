package lecture11;

import java.util.Scanner;

public class reverseaque {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		QueueUsingArrays list=new QueueUsingArrays(n);
		for(int i=1;i<=n;i++)
		{
			list.enque(s.nextInt());
		}
		int i=list.size()-1;
		int k=0;
		int m=1;
		while(m<=list.size()/2)
		{
			int temp=list.data[i];
			list.data[i]=list.data[k];
			list.data[k]=temp;
			i--;
			k++;
			m++;
		}
		list.display();
				
		
		

	}

}
