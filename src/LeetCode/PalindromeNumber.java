/**
 * 
 */
package LeetCode;

/**
 * @author beulahana
 * Question 9 : https://leetcode.com/problems/palindrome-number/
 * Steps 
 * - reverse number
 * - 
 */
public class PalindromeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(isPalindrome(10));

	}
	
	
	/*
	 * 
	 * Reverse integer
	 * Compare with original
	 */
	
	public static boolean isPalindrome(int x) {
		
		if(x<0) return false;
		
		int reverse = 0;
		int num = x;
		
		while(num!=0) {
			
			reverse = reverse*10+(num%10);
			num/=10;
		}
		
		return x == reverse;
        
    }

}
