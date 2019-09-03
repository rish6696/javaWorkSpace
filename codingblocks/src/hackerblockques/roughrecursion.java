package hackerblockques;

public class roughrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		int ans=name(n);
		System.out.println(ans);

	}
	
	public static int name(int n) {
		if(n==0)
		{
			return 20;
		}
		
		name(n-1);
		return 0;
		
	}

}
