package LeetCode;

public class LongestSubstring {

	public static void main(String[] args) {
		
		lengthOfLongestSubstring("pwwkew");
	}
	//abcdd
	public static int lengthOfLongestSubstring(String s) {
		int max =0;
		String nextChar="";
		String newString = "";
		for(int i =0;i<s.length();i++) {
			for(int j =i+1;j<s.length();j++) {
				nextChar = ""+s.charAt(j);
				newString = s.substring(i,j);
				if(newString.contains(nextChar)) {
					max = Math.max(newString.length(), max);
					break;
				}
			}
			
		}
		System.out.print(max);
		return max;
        
    }

}
