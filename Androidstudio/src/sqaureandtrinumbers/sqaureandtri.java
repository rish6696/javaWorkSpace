package sqaureandtrinumbers;

public class sqaureandtri {
	public static boolean issqaure(int n)
	{
		double m=Math.sqrt(n);
		return m-Math.floor(m)==0;
		
	}
	public static  boolean istri(int n)
	{
		if(issqaure(1+8*n))
		{
			return true;
		}
		return false;
	}
	

}
