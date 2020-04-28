package LeetCode;


/*
 * Question : https://projecteuler.net/problem=7
 * 
 */
public class PrimeAtPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int position = 10_001;
		int count=2;
		long result = 0;
		
		while(position>0) {
			if(isPrime(count)) {
				result = count;
				position--;
			}
			
			count++;
			
		}
		
		System.out.println(result);

	}
	
	
	static boolean isPrime(int n) {
		for(int i=2;i<=n;i++) {
			if(n%i==0 && n!=i) {
				return false;
			}
		}
		return true;
	}

}
