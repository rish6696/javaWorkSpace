package lecture19DP;

public class editdistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abbg";
		String s2="bbbga";
				
		int ans=dis(s1,s2,s1.length(),s2.length());
		System.out.println(ans);

	}
	public static int dis(String s1,String s2,int n1,int n2) {
		
		if(n1==0&&n2==0)
		{
			return 0;
		}
		if(n1==0)
		{
			return n2;
		}
		if(n2==0)
		{
			return n1;
		}
		int rec=dis(s1, s2, n1-1, n2-1);
		if(s2.charAt(n2-1)!=s1.charAt(n1-1))
		{
		
			int ans=rec+1;
			return ans;
		}
		else
		{
			return rec;
		}
		
				
		
	}

}
