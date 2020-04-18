package ProjectEuler;

public class SumSquareDifference {

	private static long startime;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 startime = System.currentTimeMillis();

		System.out.println(squareSum(1000) +"time : "+(System.currentTimeMillis()-startime));

	}
	
	static long squareSum(int limit) {
		long squareSum = 0;
		long sumSquare = 0;
		for(int i=1;i<=limit;i++) {
			sumSquare+=i*i;
			squareSum+=i;
		}
		System.out.println("time : "+(System.currentTimeMillis()-startime));
		return (squareSum*squareSum)-sumSquare;
		
	}

}
