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
	
	static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {

        SinglyLinkedListNode newNode = new InsertNodeAtLinkedListTail(). new SinglyLinkedListNode(data);
        newNode.next = llist;
        llist = newNode;

        return llist;


    }
	
	   static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
		   SinglyLinkedListNode newNode =  new InsertNodeAtLinkedListTail().new SinglyLinkedListNode(data);
		   SinglyLinkedListNode backUpHead = head;
		   SinglyLinkedListNode insertNode = null;
		   SinglyLinkedListNode afterNode = null;

		   int count =1;
		   while(backUpHead!=null){

		       if(position==count){
		   insertNode=backUpHead;
		   afterNode = backUpHead.next;
		       }

		       count++;
		       backUpHead = backUpHead.next;

		   }

		   insertNode.next = newNode;
		   newNode.next=afterNode;

		   return head;



		       }


}
