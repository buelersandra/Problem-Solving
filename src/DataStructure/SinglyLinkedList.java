package DataStructure;


public class SinglyLinkedList {
	
	public class Node{
		public int value;
		public Node next;
		
		public Node(int val){
			this.value = val;
		}
	}
	
	public Node head=null; //entry point into the sequence
	
	
	public void add(int num) { //BigO(1) when new node is inserted in front and becomes the new Head.
		Node newNode = new Node(num);
		newNode.next = head;
		head = newNode;
		}
	
	
	//Node newHead = null;
	public void traverse(Node head) {// with the head as the entry point, traverse till the last item which has a null next reference
		while(head!=null) {
			System.out.print(head.value+",");
			head = head.next;
		}
		
	}

}
