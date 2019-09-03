
	public class Solution {

		
		public static int[] arrange(int n){
			
			/* Your class should be named Solution
		 	* Don't write main().
		 	* Don't read input, it is passed as function argument.
		 	* Return output and don't print it.
			* Taking input and printing output is handled automatically.
			*/	
			
			//int arr[]= {1,2,3,4,5,6};
			int[]arr=new int[n];
			for(int i=0;i<=arr.length-1;i++)
			{
				arr[i]=i+1;
			}
			int fi=0;
			int si=1;
			
			int []ans=new int[arr.length];
			int i=0;
			int j=ans.length-1;
			int counter=0;
			while(counter<=ans.length)
			{
				int fv=arr[fi];
				int sc=arr[si];
				ans[i]=fv;
				counter++;
				
				ans[j]=sc;
				counter++;
				if(counter==ans.length)
				{
					break;
				}
				if(counter==ans.length-1)
				{
					si++;
					sc=arr[si];
					i++;
					ans[i]=sc;
					break;
				}
				fi=fi+2;
				si=si+2;
				i++;
				j--;
				
				
			}
			return ans;

		}
		
	}


