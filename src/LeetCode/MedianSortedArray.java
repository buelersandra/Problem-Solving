package LeetCode;

import java.util.Arrays;

public class MedianSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
		findMedianSortedArrays(nums1, nums2);
		

	}

	/*FACT : finding median of a list needs to sorted even after combining list
	 * the formula sumOfList/listSize only works for positive numbers.
	 * for negative numbers, sorted array and finding
	 *  the middle number for oddlist and sumOfMiddle/2 for even list
	**/
	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        
	         
	         int[] newArr = new int[nums1.length+nums2.length];
	        int total = 0;
	        int count = 0;
	        float median = 0;
	        while(count<nums1.length){
	        	newArr[total]=nums1[count];
	            count++;
	            total++;
	        }
	        
	         count = 0;
	        while(count<nums2.length){
	        	newArr[total]=nums2[count];
	            count++;
	            total++;
	        }
	        Arrays.sort(newArr); // sort list after combining
	        int pivot = newArr.length/2;
	        //even array length
	        if(newArr.length%2 == 0) {
	        	
	        	median = ((float) (newArr[pivot]+newArr[pivot-1]))/2;
	        	
        	//odd array length
	        }else {
	        	//int pivot = newArr.length/2;
	        	median = newArr[pivot];
	        }
	        
	        
	        System.out.println(median);
	        
	        return median;
	    }
}
