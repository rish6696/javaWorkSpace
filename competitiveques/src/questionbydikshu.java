import java.util.Scanner;

public class questionbydikshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[]arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.nextInt();
		}
		ans(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		

	}
	public static  void ans(int[]arr)
	{
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		int k=arr.length-1;
		sum=sum/k;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sum-arr[i];
		}
	}

}
