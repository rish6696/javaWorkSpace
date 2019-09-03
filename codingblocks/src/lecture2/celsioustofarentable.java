package lecture2;

import java.util.Scanner;

public class celsioustofarentable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,c,min,max,step;
		Scanner s=new Scanner(System.in);
		System.out.println("enter minimum vale");
		min=s.nextInt();
		System.out.println("enter maximum vale");
		max=s.nextInt();
		System.out.println("enter step index");
		step=s.nextInt();
		i=min;
		while(i<=max)
		{
			System.out.print(i+" ");
			c=(int)((5.0/9)*(i-32));
			System.out.println(c);
			i=i+step;
		}
			
		

	}

}
