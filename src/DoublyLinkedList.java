
public class DoublyLinkedList {
	private Link first;
	private Link last;
	
	
	/**
	 * Class constructor
	 */
	public DoublyLinkedList() {
		this.first = null;
		this.last = null;
	}
	
	
	/**
	 * Checking if the linked list is empty
	 * @return
	 */
	public boolean isEmpty() {
		return this.first == null;
	}
	
	
	/**
	 * Inserting Link at the start of the linked list
	 * @param key
	 * @param value
	 */
	public void insertFirst(int key, int value) {
		Link newLink = new Link(key, value);
		if(this.isEmpty()) {
			this.last = newLink;
		}else {
			first.previous = newLink;
		}
		newLink.next = this.first;
		this.first = newLink;
	}
	
	
	/**
	 * Inserting Link at the end of the linked list
	 * @param key
	 * @param value
	 */
	public void insertLast(int key, int value) {
		Link newLink = new Link(key, value);
		if(this.isEmpty()) {
			this.first = newLink;
		}else {
			this.last.next = newLink;
			newLink.previous = this.last;
		}
		this.last = newLink;
	}
	
	
	/**
	 * Deleting first link from the linked list
	 * @return Link
	 */
	public Link deleteFirst() {
		Link deleteLink = this.first;
		if(this.first.next == null) {
			this.last = null;
		}else {
			this.first.next.previous = null;
		}
		this.first = this.first.next;
		return deleteLink;
	}
	
	
	/**
	 * Deleting last link from the linked list
	 * @return Link
	 */
	public Link deleteLast() {
		Link deleteLink = this.last;
		if(this.first.next == null) {
			this.first = null;
		}else {
			this.last.previous.next = null;
		}
		this.last = this.last.previous;
		return deleteLink;
	}
	
	
	/**
	 * Inserting Link after a certain Link in the linked list
	 * @param key
	 * @param value
	 * @return boolean
	 */
	public boolean insertAfterKey(int key, int value) {
		Link newLink = new Link(key, value);
		Link currentLink = this.first;
		while(currentLink.getKey() != key) {
			currentLink = currentLink.next;
			if(currentLink == null) {
				return false;
			}
		}
		if(currentLink == this.last) {
			newLink.next = null;
			this.last = newLink;
		}else {
			newLink.next = currentLink.next;
			currentLink.next.previous = newLink;
			
		}
		newLink.previous = currentLink;
		currentLink.next = newLink;
		return true;
	}
	
	
	/**
	 * Displaying linked list Link by key
	 * @param key
	 * @return Link
	 */
	public Link deleteKey(int key) {
		Link currentLink = this.first;
		while(currentLink.getKey() != key) {
			currentLink = currentLink.next;
			if(currentLink == null) {
				return null;
			}
		}
		if(currentLink == this.first) {
			this.first = currentLink.next;
		}else {
			currentLink.previous.next = currentLink.next;
		}
		if(currentLink == this.last) {
			this.last = currentLink.previous;
		}
		return currentLink;
	}
	
	
	/**
	 * Displaying linked list forward
	 */
	public void displayLinkForward() {
		System.out.println(" ******** Diplaying Linked List forward **********");
		Link currentLink = this.first;
		while(currentLink != null) {
			currentLink.displayLink();
			currentLink = currentLink.next;
		}
	}
	
	
	/**
	 * Displaying linked list backwards
	 */
	public void displayLinkBackward() {
		System.out.println(" ******** Diplaying Linked List backward **********");
		Link currentLink = this.last;
		while(currentLink != null) {
			currentLink.displayLink();
			currentLink = currentLink.previous;
		}
	}

}
