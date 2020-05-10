/**
 * 
 */
package LeetCode;

/**
 * @author beulahana
 *
 */
public class ReverseInteger {

	
	public static void main(String[] args) {
		// 1534236469
		System.out.println(reverse(-123));
		

	}
	
	/**
	 * Reversed Integer
	 * Mod 10 of a number gives the last digit of the number
	 * Initialise the result to 10
	 * Add last digit to result*10
	 * Divider number by 10 to remove last digit
	 * Repeat till number is 0
	 */
	
	public  static int reverse(int x) {
	        
	        int result=0;
	        
	        while(x!=0){
	            int n = x%10;
	            if((result*10)/10!=result) {
	            	System.out.println("if "+(result*10)/10);
	                return 0;
	            }
	            result=result*10+n;
	            System.out.println(result);
	            x=x/10;
	            
	                    
	        }
	       return result;
	            
	            
	    }

}
