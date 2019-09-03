package arraypractise;

public class insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]arr= {5,4,3,2,1};
		insertionsort(arr);
        for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void insertionsort(int[]arr) {
		for(int counter=1;counter<=arr.length-1;counter++)
		{
			int val=arr[counter];
			int j=counter-1;
			while(j>=0&&arr[j]>val)
			{
				arr[j+1]=arr[j];
				j--;
				
				
			}
			arr[j+1]=val;
		}
		
		
	}

}
