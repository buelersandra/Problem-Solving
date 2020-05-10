package LeetCode;

import java.util.HashSet;

public class FirstMissingPositive {

	public static void main(String[] args) {
		
		int[] nums = {3,20,5};
		System.out.println(firstMissingPositive(nums));

	}
	
	/*
	 * Hashset was used so i can easily use .contains() to check if number exists
	 * List doesn't have to be ordered
	 * Interested in only positive integer so index starts at one
	 * 
	 * Logic
	 * Index starts at 1 , iterates till n+1 and check if number exists
	 * If result is outside set, n+1 handles it.
	 * 
	 * Complexity : O(2n) == O(n)
	 */
	
	public static int firstMissingPositive(int[] nums) {
        
		HashSet<Integer> set = new HashSet<Integer>();
        for(int a : nums){
            set.add(a);
        }
        
      
        for(int i=1;i<=set.size()+1;i++) {
        	//System.out.println(i);
        	if(!set.contains(i)) {
        		return i;
        	}
        	
        }
        
        return 1;
        
    }

}
