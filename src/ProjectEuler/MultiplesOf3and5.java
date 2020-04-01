/**
 * 
 */
package ProjectEuler;

/**
 * @author beulahana
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
 *
 */
public class MultiplesOf3and5 {

	/**
	 * @param args
	 * complexity O(1)
	 */
	public static void main(String[] args) {
		
		int num = 10000000;
		long lcm = (num-1)/3;
		long sum3 = (3*(lcm*(lcm+1)))/2;
		lcm = (num-1)/5;
		long sum5 = (5*(lcm*(lcm+1)))/2;
		
		lcm = (num-1)/15;
		long sum15 = (15*(lcm*(lcm+1)))/2;
		System.out.print(sum3+sum5-sum15);

	}

}
