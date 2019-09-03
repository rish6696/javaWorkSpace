package lecture2;

import java.util.Scanner;

public class trianglepatternreward {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,bs,num,m,as,nth;
		System.out.println("enter value of rows");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
	
		
		for(i=0;i<=n;i++)
		{
			nth=2*i-1;
			for(bs=1;bs<=(n-i);bs++)
			{
				System.out.print("  ");
				
			}
			for(num=1;num<=2*i-1;num++)
			{
				if(num==(2*i+1)/2)
				{
					System.out.print((2*i-1+" "));
				}
				else {
					for(m=1;m<=(2*i-2)/2;m++)
					{
						if(num==nth-(nth-m)||num==nth-(m-1))
						{
							System.out.print(nth-(nth-m)+(i-1)+" ");
							
						}
						
					}
				}
			}
			for(as=1;as<=(n-i);as++)
			{
				System.out.print(" ");
			}
			
			System.out.println();
		}
		

	}

}
