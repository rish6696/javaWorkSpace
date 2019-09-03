package hackerblockques;

public class sumofdigitsusingrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=987;
		int ans=sum(n);
		System.out.println(ans);

	}
	public static int sum(int n) {
		if(n/10==0)
		{
			return n;
		}
		
		int rec=sum(n/10);
		int ans=rec+n%10;
		return ans;
				
	}

}
