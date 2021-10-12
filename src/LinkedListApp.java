
public class LinkedListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkedList dll = new DoublyLinkedList();
		
		System.out.println("Is linked list empty: "+dll.isEmpty()+"\n");
		dll.insertFirst(10, 11);
		dll.insertLast(40, 44);
		dll.insertFirst(20, 22);
		dll.insertLast(50, 55);
		dll.insertFirst(30, 33);
		dll.insertLast(60, 66);
		
		dll.displayLinkForward();
		System.out.println("\n");
		dll.displayLinkBackward();
		
		dll.insertAfterKey(30, 32);
		System.out.println("\n");
		
		dll.displayLinkForward();
		System.out.println("\n");
		
		dll.deleteFirst();
		dll.displayLinkForward();
		System.out.println("\n");
		
		dll.deleteLast();
		dll.displayLinkForward();
		System.out.println("\n");
		
		
		
	}

}
