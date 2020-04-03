package DataStructure;


public class SingleLinkedList {
	
	public class Node{
		public int value;
		public Node next;
		
		public Node(int val){
			this.value = val;
		}
	}
	
	public Node head=null; 
	
	
	public void add(int num) {
		Node newNode = new Node(num);
		newNode.next = head;
		head = newNode;
		}
	
	
	//Node newHead = null;
	public void traverse(Node head) {
		while(head!=null) {
			System.out.print(head.value+",");
			head = head.next;
		}
		
	}

}
