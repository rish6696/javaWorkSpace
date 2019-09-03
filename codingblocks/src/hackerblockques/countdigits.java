package hackerblockques;

public class countdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=998;
		int ans=count(n);
		System.out.println(ans);

	}
	public static int count(int n) {
		if(n/10==0)
		{
			return 1;
		}
		
		int rec=count(n/10);
		int ans=rec+1;
		return ans;
				
	}



	}


