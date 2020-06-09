/**
 * 
 */
package LeetCode;

/**
 * @author beulahana
 *
 */
public class StringToInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myAtoi("  -0012a42"));
		
		
	}
	
	 public static int myAtoi(String str) {
		  boolean negative = false;
	        
	        int result = 0;
      String v = str.trim();
      if(!v.isEmpty()){
            
	        char[] list = v.toCharArray();
		  char first = list[0];
		  
		  int start = 0;
		  if(first=='-') {
				negative = true;
				start=1;
			}else if(first=='+'){
		      start=1;
		  }
		  char c=' ';
	        for(int i=start;i<list.length;i++){
	        	
            c=list[i];
             if(!Character.isDigit(c)) {
	        		return result!=0?negative? -1*result:result:0;
	        	}
	        else if(Character.isDigit(c) && c!=' '){
	                result=result*10+(c-'0');
	                
	                if((result*10)/10!=result) {
	                	return Integer.MIN_VALUE;
	                }
	            }
	        }
      
      
      }
      	
	        
	        return negative? -1*result:result;
	          
      
      
	        
	    }

}
