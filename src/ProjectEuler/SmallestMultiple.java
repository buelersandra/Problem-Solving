package ProjectEuler;

public class SmallestMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int answer = 1;
		
		int pass = 0;
		
		while(pass<20) {
			pass=0;
			for(int i=1;i<=20;i++) {
				if(answer%i!=0) {
					pass--;
				}else {
					pass++;
				}
			}
//			if(answer%2==0 && answer%3==0 && answer%5==0 && answer%7==0 ) {
//				pass = true;
//				System.out.print(answer);
//			}
			
				
			System.out.println(String.format("pass is %d ; answer is %d", pass,answer));	
			answer++;
		}
		
		System.out.print(answer);

	}

}
