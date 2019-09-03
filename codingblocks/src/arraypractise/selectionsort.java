package arraypractise;

public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int[]arr= {8,4,9,2,1};
		selectionsort(arr);
        for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void selectionsort(int []arr) {
		//int min=Integer.MAX_VALUE;
		int mi=0;
		
		
		for(int i=0;i<=arr.length-2;i++)
		{
			int min=Integer.MAX_VALUE;
			
			for(int j=i;j<=arr.length-1;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					mi=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[mi];
			arr[mi]=temp;
			
		}
		
	}

}
