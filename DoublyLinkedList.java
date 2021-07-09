

public class DoublyLinkedList<T> {
	
	public class Node{
		Node next;
		Node prev;
		T data;
	}
	
	Node head;
	Node tail;
	int size = 0;
	
	public DoublyLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}

	public void insertInBeg(T data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		newNode.prev = null;
		if(head == null) {
			tail = newNode;
		}
		
		if(head != null) {
		   head.prev = newNode;
		}
		head = newNode;
		
	}
	
	public void insertAtEnd(T data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		newNode.prev = tail;
		if(tail == null) {
			head = newNode;
			
		}
		if(tail != null) {
			tail.next = newNode;
		}
		tail = newNode;
		
	}
	
	public boolean isEmpty(){
		if(head == null){
			return true;
		}
		return false;
	}
	
	public void display(){
		if(isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		Node temp = head;
		System.out.println("Linked is ");
		while(temp.next != null){	
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println(temp.data+ "-> null");
	}
	
	public boolean isPalindrome() {
		Node beg = head;
		Node end = tail;
		
		while(beg != null ) {
			if(beg.data != end.data) {
				return false;
			}
				beg = beg.next;
				end = end.prev;
			
		}
		return true;
	}
	
}
