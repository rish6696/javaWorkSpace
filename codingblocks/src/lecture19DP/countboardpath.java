package lecture19DP;

public class countboardpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int curr=0;
		int end=12;
		int[]strg=new int[end+1];
//		int ans=count(curr,end,strg);
//		System.out.println(ans);
		int ans1=countI(strg, end);
		System.out.println(ans1);
		

	}
	
	public static int count(int curr,int end,int[]strg) {
		
		int count=0;
		if(curr==end)
		{
			return 1;
		}
		if(curr>end)
		{
			return 0;
		}
		if(strg[curr]!=0)
		{
			return strg[curr];
		}
		
		for(int dice=1;dice<=6;dice++)
		{
			
			count=count+count(dice+curr, end,strg);
			strg[curr]=count;
		
			
		}
		return count;
		
	}
	
	public static int countI(int []strg,int end) {
		strg[strg.length-1]=1;
		strg[strg.length-2]=1;
		
		for(int i=strg.length-3;i>=0;i--)
		{
			int n=1;
			int j=i+1;
			
			int sum=0;
			int k;
			if((end-i)<=6)
			{
				k=end-i;
			}
			else
			{
				k=6;
			}
			while(n<=k)
			{
				 sum=sum+strg[j];
				
				j++;
				n++;
			}
			strg[i]=sum;
					
			
		}
		return strg[0];
		
		
		
	}

}
