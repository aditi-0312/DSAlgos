package linkedListExercises;


public class LinkedListEx2 {
	
	class Node{
		int val;
		Node next;
		
		public Node(int val) {
			this.val=val;
		}
	}
	
	static Node head=null;
	Node tail=null;
	
	public void addNodeAtEnd(int val) {
		Node n=new Node(val);
		if(head==null) {
			head=n;
			tail=n;
		}else {
			tail.next=n;
			n.next=null;
			tail=n;
		}
	}
	
	public void deleteNodeBeginning() {
		head=head.next;
	}
	
	public void deleteNodeAtEnd() {
		Node current = head;
		while(current.next.next!=null) {
			current=current.next;
		}
		current.next=null;
		tail=current;
	}
	
	public void deleteNodeAtGivenIndex(int index) {
		int count=1;
		Node current=head;
		while(current!=null && count!=index-1) {
			current=current.next;
		}
		Node temp=current.next.next;
		current.next=temp;
	}
	
	public void deleteNodeWithGivenValue(int value) {
		if(head.val==value) {
			deleteNodeBeginning();
		}
		else if(tail.val==value) {
			deleteNodeAtEnd();
		}else {
			Node current=head;
			Node previous=null;
			while(current!=null && current.val!=value) {
				//store the value of current in previous 
				previous=current;
				current=current.next;
			}
			//when node with given value is not found
			
			if(current==null) {
				throw new RuntimeException("the node with given value is not found");
			}
			//at this point we have the information of the previous node 
			//to the node with given value which we want to delete
			
			//and cuurent node is the node that we want to delete
			previous.next=current.next;
		}
	}
	
	public void deleteNodeWithEvenValues() {
		Node current=head;
		while(current!=null) {
			if(current.val%2==0) {
				deleteNodeWithGivenValue(current.val);
			}
			current=current.next;
		}
	}
	
	public void reverseLinkedList() {
		Node prev=null;
		Node next=null;
		Node curr=head;
		while(curr!=null) {
			//Solving reverse issue
			next=curr.next;
			curr.next=prev;
			//changing positions
			prev=curr;
			curr=next;
		}
		printLinkedList(prev);
	}
	
	public void printLinkedList(Node head) {
		Node current = head;
		while (current != null) {
			System.out.println(current.val);
			current = current.next;
		}
	}

	public static void main(String[] args) {
		LinkedListEx2 l=new LinkedListEx2();
		l.addNodeAtEnd(1);
		l.addNodeAtEnd(2);
		l.addNodeAtEnd(3);
		l.addNodeAtEnd(4);
		l.addNodeAtEnd(5);
		
		l.printLinkedList(head);
		System.out.println();
		l.reverseLinkedList();
		
	}

}
