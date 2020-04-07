package LeetCode;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] test = {2,7,11,15};
		int[] result = twoSum(test, 9);
		for (int i : result) {
			System.out.println(i);
		}
	}
	
	public static int[] twoSum(int[] nums, int target) {
		//int first,second = 0;
		
		int[] result = new int[2];
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				System.out.println(String.format("i is %d and j is %d", i,j));
				if(nums[i] + nums[j] == target) {
					result[0]=i;
					result[1]=j;
				}
				
			}
			
		}
		
		return result;
        
    }

}
