package lecture5;

import java.util.Scanner;

public class spiralanticlcolwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of rows");
		m=s.nextInt();
		System.out.println("enter number of columns");
		n=s.nextInt();
		int arr[][]= new int [m][n];
		takeinput(arr,m,n);
		print(arr,m,n);
		
		
		
				
		

	}
	
	public static void takeinput(int arr[][],int m,int n)
	{
		int i,j;
		Scanner s=new Scanner(System.in);
		
		for(i=0;i<=m-1;i++)
		{
			for(j=0;j<=n-1;j++)
			{
				System.out.println("enter the value for "+i+" row and "+j+" coloumn");
				arr[i][j]=s.nextInt();
			}
		}
		
	}
	public static void print(int arr[][],int m,int n)
	{
		int i,tp,bm,lt,rt,count,dir;
		tp=0;
		bm=m-1;
		lt=0;
		rt=n-1;
		dir=1;
		count=m*n;
		while(lt<=rt && tp<=bm)
		{
			if(count>0)
			{
				if(dir==1)
				{
					for(i=tp;i<=bm;i++)
					{
						System.out.print(arr[i][lt]+", ");
						count--;
					}
				}
				dir=2;
				lt++;
			if(count>0)
			{
				
			
				if(dir==2)
				{
					for(i=lt;i<=rt;i++)
					{
						System.out.print(arr[bm][i]+", ");
						count--;
					}
				}
			}
				dir=3;
				bm--;
				
				if(count>0)
				{
					
				
					if(dir==3)
					{
						for(i=bm;i>=tp;i--)
						{
							System.out.print(arr[i][rt]+", ");
							count--;
						}
					}
				}
					dir=4;
					rt--;
					
					if(count>0)
					{
						
					
						if(dir==4)
						{
							for(i=rt;i>=lt;i--)
							{
								System.out.print(arr[tp][i]+", ");
								count--;
							}
						}
					}
						dir=1;
						tp++;	
				
			}
			
		}
		System.out.print("END");
		
	}

	}


