package codinclubcomp;

import java.util.ArrayList;
import java.util.Scanner;

public class boringmetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			ArrayList<int[]> data=new ArrayList<>();
			int n=s.nextInt();
			for(int i=1;i<=n;i++)
			{
				int m=s.nextInt();
				int[] arr=new int[m];
				for (int j = 0; j < arr.length; j++) {
					arr[j]=s.nextInt();
					
				}
				data.add(arr);
				
				
			}
			
			for(int i=0;i<=data.size()-1;i++)
			{
				
				
				int[]arr=data.get(i);
				int ans=0;
				int j=0;
				String prev="inc";
				String cur;
				while(j<=arr.length-2)
				{
				
					int ai=arr[j];  
					int bi=arr[j+1];
					if(bi>ai)
					{
						cur="inc";
					}
					else
					{
						cur="dec";
					}
					if(prev.equals("dec")&&cur.equals("inc"))
					{
						ans++;
					}
					
					prev=cur;
					j=j+1;
				}
				System.out.println(ans+2);
			}
			

	}

}
