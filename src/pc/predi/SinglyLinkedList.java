package pc.predi;

public class SinglyLinkedList<E> {

//	public class Node {
//		public E nodeData;
//		public Node next;
//
//		public Node(E nodeData) {
//			this.nodeData = nodeData;
//			this.next = null;
//		}
//
//		public Node(E nodeData, Node next) {
//			this.nodeData = nodeData;
//			this.next = next;
//		}
//
//		public String toString() {
//			return "Node(" + nodeData.toString() + ")";
//		}
//	}
	
	public class Node {
		public E data;
		public Node next;

		public Node(E data) {
			this.data = data;
			this.next = null;
		}
		public Node(E data, Node next) {
			this.data = data;
			this.next = next;
		}
		public String toString() {
			return "Node(" + data.toString() + ")";
		}
	}
	
	private int size = 0; //tracks number of elements
	private E data;
	private Node head = null; // reference to the first node

	public SinglyLinkedList() {

	}

	public String toString() {
		return "SinglyLinkedList(" + data.toString() + ")";
	}
	
	public boolean add(E element) {
		if(head == null) {
			head = new Node(element);
		}
		else
		{
			Node node = head;
			for(; node.next != null; node = node.next) {
				
			}
			node.next = new Node(element);
		}
		size++;
		return true;
	}
	
	public int size() {
		return size;
	}
	
	public E get(int index) {
		Node node = getNode(index);
		return node.data;
		
	}
	
	private Node getNode(int index) {
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		Node node = head;
		for(int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}
	
	public Node reverse2() {
		Node current = head;
		Node previousNode = null;
		Node nextNode = null;
		for(; current != null; current = nextNode) {
			nextNode = current.next;
			current.next = previousNode;
			previousNode = current;
		}
		current = previousNode;
		return current;
	}
	
	public E get2(Node node, int index) {
		for(int i = 0; i < index; i++) {
			node = node.next;
		}
		//node.head == Node(1st data)
		return node.data;
	}
	
    // prints content of double linked list 
    void printList(Node node) 
    { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
}
