package linkedListExercises;

public class LinkedListEx {

	class Node {
		int val;
		Node next;

		public Node(int val) {
			this.val = val;
		}
	}

	static Node head = null;
	Node tail = null;

	public void addNodeAtEnd(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
			tail = newNode;

		} else {
			tail.next = newNode;
			newNode.next = null;
			tail = newNode;
		}
	}

	public void addNodeInTheBeginning(int val) {
		Node n = new Node(val);
		if (head == null) {
			head = n;
			tail = n;
		} else {
			n.next = head;
			head = n;
		}
	}

	public void addNodeAtIndex(int val, int index) {
		int count = 1;
		Node current = head;
		while (current != null && count != index - 1) {
			current = current.next;
			count++;
		}
		Node newNode = new Node(val);
		Node temp = current.next;
		current.next=newNode;
		newNode.next = temp;

	}
	
	public void deleteNodeEnd() {
		
		Node current =head;
		while(current.next.next!=null) {
			current=current.next;
		}
		current.next=null;
		tail=current;
	}
	
	public void deleteNodeBeginning() {
		head=head.next;
	}
	
	public void removeNodeAtAGivenIndex(int index) {
		 
	    //case when we need to remove the head node
	    if (index == 1) {
	    	deleteNodeBeginning();
	    } else if (index == getLinkedListSize()) {
	        //case when we need to remove the tail node
	    	deleteNodeEnd();
	    } else {
	        int count = 1;
	        Node current = head;
	        while (current != null && count != index - 1) {
	            current = current.next;
	            count++;
	        }
	        //at this point we are at the previous index of the index where we want to delete node
	        // point the next of current to the next of next to remove the connection with the next node
	        Node temp = current.next.next;
	        current.next=temp;
	    }
	}

	private int getLinkedListSize() {
		int count = 0;
		Node current = head;
		while(current != null) {
			current = current.next;
			count++;
		}
		return count;
	}

	public void printLinkedList(Node headNode) {
		Node current = headNode;
		while (current != null) {
			System.out.println(current.val);
			current = current.next;
		}
	}

	public static void main(String[] args) {

		LinkedListEx l = new LinkedListEx();
		l.addNodeAtEnd(10);
		l.addNodeAtEnd(20);
		l.addNodeAtEnd(30);
		l.addNodeAtEnd(40);

		l.addNodeInTheBeginning(12);

		//l.printLinkedList(head);
		l.deleteNodeEnd();
		l.addNodeAtIndex(5, 3);
		l.deleteNodeBeginning();
		//l.removeNodeAtAGivenIndex(4);
		l.printLinkedList(head);
		int size=l.getLinkedListSize();
		System.out.println("size = "+ size);
		
	}

}
