package LeetCode;

public class LongestSubstring {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("bbbbb"));
		
	}
	//abcdd
	public static int lengthOfLongestSubstring(String s) {
		int max =0;
		String nextChar="";
		String newString = "";
		System.out.println("length :"+s.length()); // a=1 b=2
		for(int i =0;i<s.length();i++) {
			for(int j =i+1;j<s.length();j++) {
				nextChar = ""+s.charAt(j);
				newString = s.substring(i,j);
				System.out.print(newString+",");
				if(newString.contains(nextChar)) {
					max = Math.max(newString.length(), max);
					System.out.println();
					break;
				}else if(j==s.length()-1) {
					newString = s.substring(i,s.length());
					System.out.print(newString+",");
					max = Math.max(newString.length(), max);
				}
				
			}
			
		}
		
		return max==0?s.length():max;
        
    }

}
