package arraypractise;

public class mergetwosortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr1= {10,20,30,40,50};
		int[]arr2= {5,15,30,45,60,70};
		int[]ans=merge(arr1,arr2);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
			
		}
		
		

	}
	
	public static int[] merge(int []arr1,int[]arr2) {
		
		int i=0;
		int j=0;
		int k=0;
		int[]ans=new int[arr1.length+arr2.length];
		while(i<arr1.length&&j<arr2.length)
		{
			if(arr1[i]<=arr2[j])
			{
				ans[k]=arr1[i];
				k++;
				i++;
			}
			else
			{
				ans[k]=arr2[j];
				k++;
				j++;
			}
		}
		while(j<arr2.length)
		{
			ans[k]=arr2[j];
			k++;
			j++;
		}
		while(i<arr1.length)
		{
			ans[k]=arr1[i];
			k++;
			i++;
		}
		return ans;
		
		
	
		
		
		
	}

}
