package HackerRank;

public class LinkedListProblems {
	
	class SinglyLinkedListNode {
	        private int data;
	         SinglyLinkedListNode next;
	         SinglyLinkedListNode(int data){
	        	 this.data = data;
	         }
	         
	      }

	public static void main(String[] args) {
		
		SinglyLinkedListNode newNode = new LinkedListProblems().new SinglyLinkedListNode(20); 
		
		SinglyLinkedListNode copiedNode = newNode;
		copiedNode.data = 21;
		
		System.out.println(newNode.data);

	}
	
	static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
		SinglyLinkedListNode newNode = new LinkedListProblems().new SinglyLinkedListNode(data);
		
		
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

        SinglyLinkedListNode newNode = new LinkedListProblems(). new SinglyLinkedListNode(data);
        newNode.next = llist;
        llist = newNode;

        return llist;


    }
	
	   static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
		   SinglyLinkedListNode newNode =  new LinkedListProblems().new SinglyLinkedListNode(data);
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
	   
	   static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
	        SinglyLinkedListNode backupHead = head;
	        SinglyLinkedListNode previousNode = null;

	        


	        while(backupHead!=null){
	            if(previousNode!=null ){
	                System.out.print("previousNode :"+previousNode.data+", backupHead :"                            +backupHead.data +"\n");
	                if(previousNode.data == backupHead.data){
	                    previousNode.next = backupHead.next;
	                    backupHead=previousNode;
	                }
	            }
	            
	            previousNode = backupHead;
	            backupHead = backupHead.next;
	        }

	        return head;

	    }

	   static void reversePrint(SinglyLinkedListNode head) {
	        SinglyLinkedListNode newHead = null;

	        while(head!=null){
	            SinglyLinkedListNode newNode = new LinkedListProblems(). new SinglyLinkedListNode(head.data);
	            newNode.next = newHead;
	            newHead = newNode;
	            head = head.next;

	        }

	        while(newHead!=null){
	            System.out.println(newHead.data);
	            newHead = newHead.next;
	            

	        }

	    }
	   
	   static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
	        SinglyLinkedListNode backup = head;
	        SinglyLinkedListNode previousNode = null;

	        int count = 0;
	        while(backup!=null){
	            
	            if(position == count){
	                if(previousNode == null){
	                    head = head.next;
	                    backup = head;
	                }else{
	                    previousNode.next = backup.next;
	                }
	            }
	            previousNode = backup;
	            backup = backup.next;
	            count++;
	        }

	        return head;


	    }


}
