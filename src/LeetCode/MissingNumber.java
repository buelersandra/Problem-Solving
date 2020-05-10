package LeetCode;

import java.util.HashSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/*
	 * https://leetcode.com/problems/missing-number/
	 * Input: [3,0,1] Output: 2
	 */

	 public int missingNumber(int[] nums) {
	        
	        HashSet<Integer> set = new HashSet<Integer>();
	        for(int a :nums){
	            set.add(a);
	        }
	        
	        for(int i=0;i<=set.size()+1;i++){
	            if(!set.contains(i)){
	                return i;
	            }
	        }
	        
	        return 0;
	        
	    }
}
