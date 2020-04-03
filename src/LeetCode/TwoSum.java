package LeetCode;


import DataStructure.SingleLinkedList;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleLinkedList list1 = new SingleLinkedList();
		list1.add(3);
		list1.add(4);
		list1.add(2);
		
		SingleLinkedList list2 = new SingleLinkedList();
		
		list2.add(4);
		list2.add(6);
		list2.add(5);
		
		
		list1.traverse(new TwoSum().addTwoNumbers(list1.head, list2.head));
		

	}
	
	public  SingleLinkedList.Node addTwoNumbers(SingleLinkedList.Node l1, SingleLinkedList.Node l2) {
		int a=0,b=0,rem=0;
		SingleLinkedList.Node head = null;
				
		while(l2!=null && l1!=null) {
			b=l2.value;
			a=l1.value;
			l2 = l2.next;
			l1 = l1.next;
			
			rem+=(b+a);
			SingleLinkedList.Node newNode = new SingleLinkedList().new Node(rem%10);
			rem=rem/10;
			newNode.next = head;
			head = newNode;
			
			
		}
		
		
		SingleLinkedList.Node newHead = null;
		while(head!=null) {
			SingleLinkedList.Node newNode = new SingleLinkedList().new Node(head.value);
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
