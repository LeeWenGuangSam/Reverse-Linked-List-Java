package pc.predi;

public class MainApp2 {
	public static void main(String[] args) {
		SinglyLinkedList2<String> singleLL = new SinglyLinkedList2<String>();
		singleLL.add("1st");
		singleLL.add("2nd");
		singleLL.add("3rd");
		singleLL.add("4th");
		singleLL.add("5th");
		
		System.out.println("Basic linked list: ");
		
		for(int i = 0; i < singleLL.size(); i++) {
			System.out.println(singleLL.get(i));
		}
		
		System.out.println("Reversed linked list:");
		
		singleLL.reverse();
		
		for(int i = 0; i < singleLL.size(); i++) {
			System.out.println(singleLL.get(i));
		}
	}
}
