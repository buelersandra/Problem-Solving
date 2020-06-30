/**
 * 
 */
package LeetCode;

/**
 * @author beulahana
 * Question 234 : https://leetcode.com/problems/palindrome-linked-list/
 * Solution
 * - Create newHead an
 * - Pop values of oldHead into newHead which will automatically reverse
 * - Loop both heads and compare values
 
 */
public class PalindromeLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//better : https://leetcode.com/problems/palindrome-linked-list/discuss/678840/Java-O(1)-space-or-o(n)-time-or-Beats-96-in-speed
	
	
	
	//Brute force O(2n)
	 public boolean isPalindrome(ListNode head) { // 1, 2 , null
	        
	        ListNode node = head;
	        
	        ListNode newNode = null;
	        
	        ListNode newHead =null; //1
	        
	        while(node!=null){
	        	newNode = new ListNode(node.val);
	            node = node.next;
	            
	            newNode.next = newHead;
	            newHead= newNode;
	              
	        }
	        
	        while(head!=null && newHead !=null) {
	        	
	        	if(head.val != newHead.val) {
	        		return false;
	        	}
	        	
	        	head = head.next;
	        	newHead = newHead.next;
	        }
	        
	        return true;
	        
	        
	        
	    }
	 
	
	 // Definition for singly-linked list.
	   public class ListNode {
	      int val;
	       ListNode next;
	       ListNode() {}
	       ListNode(int val) { this.val = val; }
	       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	   }
	  

}
