package LeetCode;


import DataStructure.SinglyLinkedList;
import DataStructure.SinglyLinkedList.Node;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedList list1 = new SinglyLinkedList();
		list1.add(3);
		list1.add(4);
		list1.add(2);
		
		SinglyLinkedList list2 = new SinglyLinkedList();
		
		list2.add(4);
		list2.add(6);
		list2.add(5);
		
		Node newHead = new TwoSum().addTwoNumbers(list1.head, list2.head);
		list1.addToTail(newHead, list1.new Node(20));
		
		list1.traverse(newHead);
		

	}
	
	public  SinglyLinkedList.Node addTwoNumbers(SinglyLinkedList.Node l1, SinglyLinkedList.Node l2) {
		int a=0,b=0,rem=0;
		SinglyLinkedList.Node head = null;
				
		while(l2!=null && l1!=null) {
			b=l2.value;
			a=l1.value;
			l2 = l2.next;
			l1 = l1.next;
			
			rem+=(b+a);
			SinglyLinkedList.Node newNode = new SinglyLinkedList().new Node(rem%10);
			rem=rem/10;
			newNode.next = head;
			head = newNode;
			
			
		}
		
		
		SinglyLinkedList.Node newHead = null;
		while(head!=null) {
			SinglyLinkedList.Node newNode = new SinglyLinkedList().new Node(head.value);
			newNode.next = newHead;
			newHead = newNode;
			head=head.next;
			
		}
		
		
		
		return newHead;
	        
	    }
	
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }

	
	
}
