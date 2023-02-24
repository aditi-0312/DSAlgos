package linkedListExercises;

public class MinAndMax {

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
	
	public void minMaxValue() {
		Node current=head;
		int min=current.data;
		int max=current.data;
		
		while(current!=null) {
			if(current.data<min) {
				min=current.data;
			}else {
				max=current.data;
			}
			current=current.next;
		}
		System.out.println("min value = "+ min);
		System.out.println("max value = "+ max);

	}
	
	

	public static void main(String[] args) {
		MinAndMax a = new MinAndMax();
		a.addNodeEnd(2);
		a.addNodeEnd(13);
		a.addNodeEnd(7);
		a.addNodeEnd(50);

		a.printLinkedList(head);
		a.minMaxValue();
	}

}
