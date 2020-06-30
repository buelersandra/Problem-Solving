/**
 * 
 */
package Andela;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


/**
 * @author beulahana
 *
 */
public class PrimeString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("result : "+ countPrimeStrings("11373"));
	}
	
	public static int countPrimeStrings(String s) {
		int numLen = s.length(); 
		   
	    // Declare a splitdp[] array 
	    // and initialize to -1 
	    int []splitDP = new int[numLen + 1]; 
	    Arrays.fill(splitDP, -1); 
	    
		
	   pArr =  findPrimes(s);
	   
	   for(int i=0;i<1;i++) {
		   int prefix = pArr[i];
		   System.out.println(prefix);
		   String suffix = s.substring(Integer.toString(prefix).length(), s.length());
		   
		   Integer[] t = findPrimes(suffix);
		   
		   
		   combine = "";
		   String previousPass ="";
		   List<String> passes = new ArrayList<String>();
		   passes.add(0,Integer.toString(prefix));
		   for(int u=0;u<t.length;u++) {
			   
			   String startWOrd = "";
				if(combine.isEmpty()) {
						startWOrd = Integer.toString(prefix);
				   }else {
					   startWOrd = combine;
				   }
				   
				   current = startWOrd +t[u].toString();
				   System.out.println(startWOrd +" + " +t[u].toString());
				   if(current.length()>s.length()) {
					   System.out.println("out : "+current);
				   }else {
					   
					   String pass = correctString(current, s.substring(0,current.length()));
					   if(pass.isEmpty()){
						   if(!passes.isEmpty())passes.remove(pass);
						   System.out.println("previousPass : "+previousPass+" add : "+t[u]);
						   if(!passes.isEmpty()) {
							   combine = passes.get(0);
						   }else {
							   combine = "";
						   }
						  
					   }else if(pass.equals(s)) {
						   System.out.println("current : "+Integer.toString(prefix)+" add : "+t[u]);
						   result++;
						  
					   }else {
						   combine = pass;
						   previousPass = pass;
						   passes.add(0,pass);
					   }
				   }
		   
			   
		   }
		   
		  
		   
	   }
	   
	   
	    // Return the minimum number of splits 
	    // for the entire String 
	    return result;
	}
	
	
	static Integer[] findPrimes(String s) {
		Set<Integer> primes = new LinkedHashSet<Integer>();
		for(int i = 0;i<s.length();i++) {
			   for(int j = i+1;j<s.length()+1;j++) {
				   //System.out.println(s.substring(i, j));
				 if(!s.substring(i, j).isEmpty()) {
					   String num = s.substring(i, j);
					   if(isPrime(num) ) {
						   primes.add(Integer.parseInt(num));
					   }
				 }
				   
			   }
		   }
		 System.out.println(primes.toString());
		return primes.toArray(new Integer[primes.size()]);
		   
	}
	
	static boolean isPrime(String word) {
		if(word.isEmpty())return true;
		int n = Integer.parseInt(word);
		if(n<=1)return false;
		for(int i=2;i<=n;i++) {
			if(n%i==0 && n!=i) {
				return false;
			}
		}
		return true;
	}
	
	 static int result = 0;
	static  String combine = "";
	static Integer[] pArr = null;
	static  String current ="";
	
//	public static int countPrimeStringss(String s) {// 3175
//		Set<Integer> primes = new LinkedHashSet<Integer>();
//		
//	   for(int i = 0;i<s.length();i++) {
//		   for(int j = i+1;j<s.length()+1;j++) {
//			   //System.out.println(s.substring(i, j));
//			 if(!s.substring(i, j).isEmpty()) {
//
//				   int num = Integer.parseInt(s.substring(i, j));
//				   if(isPrime(num) && num >1) {
//					   primes.add(num);
//				   }
//			 }
//			   
//		   }
//	   }
//	   
//	   System.out.println(primes.toString());
//	   
//	   pArr =  primes.toArray(new Integer[primes.size()]);
//	   
//	  
//	   int next = 0;
//	   
//	   
//		   for (int i=0;i<pArr.length;i++) {
//			   
//			   
//				   combineNextPossible(i,next++, s);
//				  
//			   
//			  
//				   
//		   }
//		   
//		   
//	   
//	   
//	   
//	   
//	   return result;
//
//	 }
//	
//	
//	static void combineNextPossible(int  start,int startIndex,String s) {
//		combine ="";
//		for(int i = 0;i<pArr.length;i++) {
//			String startWOrd = "";
//			if(combine.isEmpty()) {
//					startWOrd = pArr[start].toString();
//			   }else {
//				   startWOrd = combine;
//			   }
//			   
//			   current = startWOrd +pArr[i];
//			   System.out.println("startWord : "+startWOrd +" and : "+pArr[i]+" = "+current);
//			   if(current.length()<=s.length()) {
//				   String pass = correctString(current, s.substring(0,current.length()));
//				   if(pass.isEmpty()){
//					   combine = "";
//					   
//				   }else if(pass.equals(s)) {
//					   result++;
//					   return;
//				   }else {
//					   combine = pass;
//				   }
//			   }
//		}
//		
//	}
//	
	static String correctString(String current, String pattern) {
		 //System.out.println("current "+current +" ; pattern "+pattern);
		if(current.equals(pattern)) {
			   return current;
		   }else {
			   return "";
		   }
	}
	
	
	

}
