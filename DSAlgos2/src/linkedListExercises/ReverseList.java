package linkedListExercises;

public class ReverseList {

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}

	}

	static Node head = null;
	Node tail = null;

	public void addNodeEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.next = null;
			tail = newNode;
		}
	}

	public void printLinkedList(Node head) {
		Node curr = head;
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}

	public void printReverse() {
		Node prev = null;
		Node curr = head;
		Node next = null;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;

			prev = curr;
			curr = next;
		}
		printLinkedList(prev);
	}

	public static void main(String[] args) {
		ReverseList l = new ReverseList();
		l.addNodeEnd(1);
		l.addNodeEnd(3);
		l.addNodeEnd(5);
		l.addNodeEnd(7);

		l.printLinkedList(head);
		l.printReverse();
	}

}
