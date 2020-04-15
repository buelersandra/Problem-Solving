package ProjectEuler;


public class LargestPrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long num = 20093;
		boolean isPrime = false;
		long max = 0;
		
		for(long i=num;i>=2;i--) {
			if(num%i==0) { // A factor is a number is divisible by the parent. 1 is not included because any number is divisible by 1
				for(long j=i-1;j>=2;j--) { // A prime number has only two factors the number itself and 1
					if(i%j==0) {
						isPrime = false;
						break;
					}else {
						isPrime = true;
					}
				}
				if(isPrime) {
					max = i;
					System.out.print(i+",");
					return;
				}
				
			}
		}
		
		System.out.println(max+",");

	}

}
