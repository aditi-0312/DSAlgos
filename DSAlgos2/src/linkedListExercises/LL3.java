package linkedListExercises;

public class LL3 {
	
	class Node{
		int val;
		Node next;
		
		public Node(int val) {
			this.val=val;
		}
	}
	
	static Node head=null;
	Node tail=null;
	
	public void addAtStart(int val) {
		Node newNode=new Node(val);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}else {
			newNode.next=head;
			head=newNode;
		}
	}
	
	public void addAtEnd(int val) {
		Node newNode=new Node(val);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}else {
			tail.next=newNode;
			newNode.next=null;
			tail=newNode;
		}
	}
	
	public void searchVal(int val) {
		//Node prev=null;
		Node curr=head;
		int index=0;
		while(curr!=null && curr.val!=val) {
			curr=curr.next;
			index++;
		}
		if(curr==null) {
			throw new RuntimeException("no such value found in the list");
		}
		System.out.println("given value is found at index: "+index);
	}
	
	public void printList(Node head) {
		Node curr=head;
		while(curr!=null) {
			System.out.print(curr.val+" ");
			curr=curr.next;
		}
	}

	public static void main(String[] args) {
		LL3 list=new LL3();
		list.addAtEnd(1);
		list.addAtEnd(5);
		list.addAtEnd(7);
		list.addAtEnd(3);
		list.addAtEnd(8);
		list.addAtEnd(2);
		list.addAtEnd(3);
		
		list.printList(head);
		System.out.println();
		
		list.searchVal(7);

	}

}
