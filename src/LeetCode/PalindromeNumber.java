/**
 * 
 */
package LeetCode;

/**
 * @author beulahana
 *
 */
public class PalindromeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(isPalindrome(10));

	}
	
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
