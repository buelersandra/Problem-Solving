package HackerRank;

public class InsertNodeAtLinkedListTail {
	
	class SinglyLinkedListNode {
	        private int data;
	         SinglyLinkedListNode next;
	         SinglyLinkedListNode(int data){
	        	 this.data = data;
	         }
	         
	      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

	}
	
	static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
		SinglyLinkedListNode newNode = new InsertNodeAtLinkedListTail().new SinglyLinkedListNode(data);
		
		
		SinglyLinkedListNode lastToNullNode = null;
		SinglyLinkedListNode backupHead = head;
		
		if(head == null) {
			return newNode;
		}
		
		while(backupHead!=null) {
			lastToNullNode = backupHead;
			backupHead = backupHead.next;
		}
		
		lastToNullNode.next = newNode;
		
		
		
		return head;


    }

}
