package arraypractise;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int[]arr= {5,4,3,2,1};
		bubblesort(arr);
        for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void bubblesort(int[]arr) {
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-2-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		
	}

}
