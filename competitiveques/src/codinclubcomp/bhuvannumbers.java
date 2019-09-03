package codinclubcomp;

public class bhuvannumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=45;
		int y=64;
		int min=min(x,y);
		System.out.print(min);
		System.out.print(" ");
		System.out.print(max(x, y));

	}
	
	public static int min(int x,int y) {
		int min=Integer.MAX_VALUE;
		String xi=Integer.toString(x);
		String yi=Integer.toString(y);
		int i=xi.length()-1;
		while(i>=0)
		{
			if(xi.charAt(i)=='5'||xi.charAt(i)=='6')
			{
				String temp;
				int m=Integer.parseInt(xi)+y;
				if(xi.charAt(i)=='5')
				{
				 temp=xi.substring(0, i)+"6"+xi.substring(i+1);
				}
				else
				{
			      temp=xi.substring(0, i)+"5"+xi.substring(i+1);
				}
				int n=Integer.parseInt(temp)+y;
				int k=Integer.min(m, n);
				if(k<min)
				{
					min=k;
				}
				
			}
			i--;
		}
		i=yi.length()-1;
		while(i>=0)
		{
			if(yi.charAt(i)=='5'||yi.charAt(i)=='6')
			{
				String temp;
				int m=Integer.parseInt(yi)+x;
				if(yi.charAt(i)=='5')
				{
				 temp=yi.substring(0, i)+"6"+yi.substring(i+1);
				}
				else
				{
			      temp=yi.substring(0, i)+"5"+yi.substring(i+1);
				}
				int n=Integer.parseInt(temp)+x;
				int k=Integer.min(m, n);
				if(k<min)
				{
					min=k;
				}
				
			}
			i--;
		}
		return min;
		
	}
	public static int max(int x,int y) {
		int max=Integer.MIN_VALUE;
		String xi=Integer.toString(x);
		String yi=Integer.toString(y);
		int i=xi.length()-1;
		while(i>=0)
		{
			if(xi.charAt(i)=='5'||xi.charAt(i)=='6')
			{
				String temp;
				int m=Integer.parseInt(xi)+y;
				if(xi.charAt(i)=='5')
				{
				 temp=xi.substring(0, i)+"6"+xi.substring(i+1);
				}
				else
				{
			      temp=xi.substring(0, i)+"5"+xi.substring(i+1);
				}
				int n=Integer.parseInt(temp)+y;
				int k=Integer.max(m, n);
				if(k>max)
				{
					max=k;
				}
				
			}
			i--;
		}
		i=yi.length()-1;
		while(i>=0)
		{
			if(yi.charAt(i)=='5'||yi.charAt(i)=='6')
			{
				String temp;
				int m=Integer.parseInt(yi)+x;
				if(yi.charAt(i)=='5')
				{
				 temp=yi.substring(0, i)+"6"+yi.substring(i+1);
				}
				else
				{
			      temp=yi.substring(0, i)+"5"+yi.substring(i+1);
				}
				int n=Integer.parseInt(temp)+x;
				int k=Integer.max(m, n);
				if(k>max)
				{
					max=k;
				}
				
			}
			i--;
		}
		return max;
		
	}

}
