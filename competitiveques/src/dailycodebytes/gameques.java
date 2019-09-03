package dailycodebytes;

import java.util.ArrayList;

public class gameques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr=new int [3];
		arr[0]=3;
		arr[1]=5;
		arr[2]=10;
		System.out.println(fun(0, 20, arr));

	}
	public static ArrayList<String> fun(int start,int end,int[]arr)
	{
		if(start==end)
		{
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}
		if(start>end)
		{
			ArrayList<String> baseResult = new ArrayList<>();
			return baseResult;
		}
		ArrayList<String> recResult = null;
		ArrayList<String> myResult = new ArrayList<>();
		
		for(int i=0;i<=arr.length-1;i++)
		{
			recResult =fun(start+arr[i], end-arr[i], arr);
			for (int j = 0; j < recResult.size(); i++) {
				myResult.add(arr[j]+recResult.get(i));
			}
		}
		return myResult;
		
	}

}
