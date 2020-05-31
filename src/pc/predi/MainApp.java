package pc.predi;

import pc.predi.SinglyLinkedList.Node;

public class MainApp {
	
	//goal is to demo reversal of singly linked list
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		SinglyLinkedList<String> ll = new SinglyLinkedList<>();
		ll.add("1st data");
		ll.add("2nd data");
		ll.add("3rd data");
		ll.add("4th data");
		ll.add("5th data");
		
		for(int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
		
		
		//ll.reverse2();
//		for(int i = 0; i < ll.size(); i++) {
//			System.out.println(ll.get(i));
//		}
		
		
		//System.out.println(ll.get2(ll.reverse2()));
		
		Node node = ll.reverse2();
		for(int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get2(node, i));
		}	
	}
}
