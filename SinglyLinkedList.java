
public class SinglyLinkedList<T> {

	class Node {
		T data;
		Node nextNode;
	}

	Node head;
	int size = 0;

	public SinglyLinkedList() {
		head = null;
		size = 0;
	}

	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	public void insertInBeg(T data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.nextNode = head;
		head = newNode;
		size++;
	}

	public void deleteInBeg() {
		head = head.nextNode;

	}

	public void insertAfter(T data, T nodeToInsert) {
		Node current = head;
		while (current != null) {
			if (current.data == data) {
				Node newNode = new Node();
				newNode.data = nodeToInsert;
				newNode.nextNode = current.nextNode;
				current.nextNode = newNode;
			}
			current = current.nextNode;
		}
	}

	public int calculateSize() {
		int len = 0;
		Node current = head;
		while (current != null) {

			len++;
			current = current.nextNode;
		}
		return len;
	}

	public void deleteAtEnd() {
		Node current = head;
		Node previous = null;
		while (current != null) {
			if (current.nextNode == null) {
				previous.nextNode = current.nextNode;
			}
			previous = current;
			current = current.nextNode;
		}
	}

	public void deleteByValue(T data) {
		Node current = head;
		Node previous = null;

		while (current != null) {
			if (current.data == data) {
				// head = previous;
				previous.nextNode = current.nextNode;
			}
			previous = current;
			current = current.nextNode;

		}
	}

	public void search(T data) {
		Node current = head;
		while (current != null) {
			if (current.data == data) {
				System.out.println("Data found::" + data);
				return;
			}
			current = current.nextNode;
		}
		System.out.println("Data Not Found::" + data);
	}

	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.nextNode;
		}
		System.out.println("null");
	}

}
