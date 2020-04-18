package ProjectEuler;

public class SmallestMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startime = System.currentTimeMillis();

		int answer = 1;
		
		while(!hasPassed(answer)) {
			answer++;
		}
		System.out.println(answer+" time is "+(System.currentTimeMillis()-startime));

//	boolean pass = false;
//	
//		while(pass==false) {
//			//pass=0;
//			for(int i=1;i<=20;i++) {
//				if(answer%i!=0) {
//					pass=false;
//					answer++;
//					break;
//					
//				}else {
//					pass=true;
//				}
//			}			
//			
//		}
//		System.out.println(answer+" time is "+(System.currentTimeMillis()-startime));

		//System.out.println(String.format(" answer is %d ; time is %d",answer,System.currentTimeMillis()-startime));	
		
		

}
	
	public static boolean hasPassed(int answer) {
		for(int i=1;i<=20;i++) {
			if(answer%i!=0) 
				return false;
			
		}
		return true;
	}
	
	

		
}
