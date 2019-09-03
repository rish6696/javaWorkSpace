package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class addtwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr= {3,2,4};
		int target=6;
		int[] ans=addtwo(arr,target);
		System.out.println(Arrays.toString(ans));

	}

	private static int[] addtwo(int[] nums, int target) {
		// TODO Auto-generated method stub
		
		int[] ans=new int[2];
		
		HashMap<Integer, Integer> map=new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
			
		}
		for (int i = 0; i < nums.length; i++) {
			
			int m=target-nums[i];
			
			if (map.containsKey(m)&&i!=map.get(m)) {
				ans[0]=i;
				ans[1]=map.get(target-nums[i]);
				return ans;
			}
			
			
		}
		
		
		return null;
	}

}
