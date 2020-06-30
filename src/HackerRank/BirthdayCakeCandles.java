/**
 * 
 */
package HackerRank;

import java.util.HashMap;

/**
 * @author beulahana
 *
 */
public class BirthdayCakeCandles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(birthdayCakeCandles(new int[] {4,4,1,3}));

	}
	
	static int birthdayCakeCandles(int[] ar) {//4,2,4
		
		int count = 0;
		int max = 0;
		
		for (int i : ar) {
			if(i==max) {
				
				count++;
			}
			
			if(i>max) {
				max = i;
				count=1;
			}
			
			
			
		}
		
		
		return count;
		
	}
	
//	
//	 static int birthdayCakeCandles(int[] ar) {
//		
//		 HashMap<Integer, Integer> map = new HashMap<>();
//		 
//		 int max = 0;
//		 
//		 for (int i : ar) {
//			 if(map.containsKey(i)) {
//				 map.replace(i, map.get(i)+1);
//				 
//			 }else {
//				 map.put(i, 1);
//			 }
//			 
//			 max = Math.max(max, i);
//			
//		}
//		 
//		 
//		 
//		 return map.get(max);
//
//
//	    }

}
