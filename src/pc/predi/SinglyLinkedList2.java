package pc.predi;

public class SinglyLinkedList<E> {
	
	private class Node {
		public E data;
		public Node next;
		
		public Node(E data) {
			this.data = data;
			this.next = null;
		}
		
		@SuppressWarnings("unused")
		public Node(E data, Node next) {
			this.data = data;
			this.next = next;
		}
		
		@SuppressWarnings("unchecked")
		public String toString() {
			if(next == null) {
				next.data = (E)"null";
			}
			return "Node: data is " + data + "Next node data is" + next.data;
		}
		
	}
	
	private int size = 0;
	private Node head = null;
	
	public SinglyLinkedList2(){
		
	}
	
	public void add(E element) {
		if(head == null) {
			head = new Node(element);
		}
		else {
			Node node = head;
			for(; node.next != null; node = node.next) {
				
			}
			node.next = new Node(element);
		}
		size++;
	}
	
	public int size() {
		return size;
	}
	
	public E get(int index) {
		if(index < 0 || index >= size) {
			System.out.println("Array out of bounds");
			return null;
		}
		Node node = head;
		for(int i = 0; i < index; i++) {
			node = node.next;
		}
		return node.data;
	}
	
	public void reverse() {
		Node current = head;
		Node previousNode = null;
		Node nextNode = null;
		for(; current != null; current = nextNode) {
			nextNode = current.next;
			current.next = previousNode;
			previousNode = current;
		}
		head = previousNode;
		current = previousNode;
	}
}
