package LeetCode;

public class LongestPalindromeSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		longestPalindrome("bb");//n, n-1 //aac
	}
	
	public static String longestPalindrome(String s) {
		String newString="";
		String longestString="";
		int max = 0;
		int end = s.length();
		for(int i=0;i<=s.length();i++) {
			int start = i;
		
			
			newString=s.substring(start, end);
			System.out.println(newString);
			if(isStringPalindrome(newString) ) {
				if(Math.max(max, newString.length())>max) {
					longestString = newString;
					
				}
				max= Math.max(max, newString.length());
			}
			
			
//			for(int j=i+1;j<=s.length();j++) {
//				newString=s.substring(i, j);
//
//				System.out.println(newString);
//				if(isStringPalindrome(newString) ) {
//					if(Math.max(max, newString.length())>max) {
//						longestString = newString;
//						
//					}
//					max= Math.max(max, newString.length());
//				}
//				
//						
//			}
		}
		
		System.out.print(longestString.isEmpty()?s:longestString);
		return longestString.isEmpty()?s:longestString;
        
    }
	
	static boolean isStringPalindrome(String value) {
		
		int start = 0;
		int end = value.length()-1;
		
		while(start<end) {
			if(value.charAt(start)!=value.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		
		return true;
	}

}
