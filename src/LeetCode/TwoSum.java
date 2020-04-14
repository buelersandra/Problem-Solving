package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] test = {3,2,4};
		int[] result = twoSum(test, 6);
		for (int i : result) {
			System.out.println(i);
		}
	}
	
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		//int first,second = 0;
		//result time limit exceeded
//		  int i=0,j = 0, sum = 0;
//			//Arrays.sort(nums);
//			
//			while(i<nums.length-1 ) {
//				j++;
//				
//				System.out.println(String.format("i is %d j is %d", i,j));
//				sum = nums[i] + nums[j];
//				if(sum == target) {
//					result[0]=i;
//					result[1]=j;
//	                return result;
//				}
//				
//				if(sum == target&&sum>target) {
//					i++;j=i;
//				}else if(j==nums.length-1) {
//					i++;j=i;
//				}	
//				
//			}
		
		//best answer
		for(int i=0;i<nums.length;i++) {
		for(int j=i+1;j<nums.length;j++) {
				System.out.println(String.format("i is %d j is %d", i,j));
				if(nums[i] + nums[j] == target) {
					result[0]=i;
					result[1]=j;
					return result;
			
				}
				
			}
			
		}
		
		return result;
        
    }

}
