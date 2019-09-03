package lecture6;

public class recursionprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		pd(5);

	}
	public static void pd(int n)
	{
		if(n<0)
		{
			return ;
		}
		System.out.println(n);
		pd(n-2);
		if(n<5)
		{
		System.out.println(n+1);
		}
	}

}
