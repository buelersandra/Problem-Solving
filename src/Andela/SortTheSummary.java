/**
 * 
 */
package Andela;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;


import java.util.Map.Entry;
import java.util.SortedSet;
import java.util.TreeMap;

/**
 * @author beulahana
 *
 */
public class SortTheSummary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> item = new ArrayList<Integer>();
		item.add(3);
		item.add(3);
		item.add(1);
		item.add(2);
		item.add(1);
		
		
		System.out.println(groupSort(item).toString());
	}
	
	  public static List<List<Integer>> groupSort(List<Integer> arr) {
          HashMap<Integer,Integer> map = new HashMap<>();
          
          List<List<Integer>> result = new ArrayList<List<Integer>>();
          
          //int maxOccurence = 0;
          
          for (Integer num : arr) {
        	  if(map.containsKey(num)) {
        		  map.put(num, map.get(num)+1);
        	  }else {
        		  map.put(num, 1);
        	  }
        	  
        	  //maxOccurence = Math.max(maxOccurence, map.get(num));
			
          }
          //System.out.println(map.keySet().toString());
          
          SortedSet<Integer> keys = new TreeSet<Integer>(map.keySet());
          //System.out.println(map.keySet().toString());
          
          HashMap<Integer,ArrayList<List<Integer>>> oMap = new HashMap<>();
          for (Integer key : keys) {
        	  ArrayList<Integer> item = new ArrayList<Integer>();
         	 item.add(key);
         	 item.add(map.get(key));
         	 
         	 int value = map.get(key);
         	 
         	
         	 
         	 
         	 if(oMap.containsKey(value)) {
         		 ArrayList<List<Integer>> test = oMap.get(value);
         		 test.add(item);
         		 oMap.replace(value,test );
         	 }else {
         		 ArrayList<List<Integer>> test = new ArrayList<List<Integer>>();
         		 test.add(item);
         		 oMap.put(value,test);
         		
         		 
         	 }
          }
          
//          System.out.println(oMap.entrySet().toString());
//          for(int i =oMap.entrySet().size();i>=0;i++) {
//        	  result.add(map.;
//          }
          //System.out.println(oMap.entrySet().toString());
          Map<Integer,ArrayList<List<Integer>>> newMap = new TreeMap<>(Collections.reverseOrder());
          newMap.putAll(oMap);
          
          
         for(Entry<Integer,ArrayList<List<Integer>>> entry : newMap.entrySet()) {
        	 result.addAll(entry.getValue());
         }
         
         
         
          return result  ;

		    

	    }

}
