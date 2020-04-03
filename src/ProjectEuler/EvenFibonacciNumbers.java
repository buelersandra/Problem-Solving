package ProjectEuler;

public class EvenFibonacciNumbers {

	public static void main(String[] args) {
		int p1=1,p2=2,p3=0;
		
		int sum=p2;
		
		while(p2<4000000) {
			p3=p1+p2;
			if(p3%2==0) {
				sum+=p3;
			}
			
			p1=p2;
			p2=p3;
			
		}
		System.out.println(sum);

	}

}
