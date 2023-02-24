package linkedListExercises;

public class PalindromeList {

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}

	}

	static Node head = null;
	Node tail = null;
	static int size=0;

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
		size++;
	}

	private void isPalindrome() {
		Node current=head;
		Boolean flag=true;
		
		 int mid = (size%2 == 0)? (size/2) : ((size+1)/2);  
		 
		 for(int i=0;i<mid;i++) {
			 current=current.next;
		 }
		 
		//Reverse the list after middle node to end  
	        Node revHead = reverseList(current.next);  
	  
	        //Compare nodes of first half and second half of list  
	        while(head != null && revHead != null){  
	            if(head.data != revHead.data){  
	                flag = false;  
	                break;  
	            }  
	            head = head.next;  
	            revHead = revHead.next;  
	        }  
	  
	        if(flag)  
	            System.out.println("Given singly linked list is a palindrome");  
	        else  
	            System.out.println("Given singly linked list is not a palindrome");  
	}
	
	public Node reverseList(Node head) {
		Node prev = null;
		Node curr = head;
		Node next = null;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;

			prev = curr;
			curr = next;
		}
		//printList(prev);
		return prev;
	}
	
	public void printList(Node head) {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}
	public static void main(String[] args) {
		PalindromeList l = new PalindromeList();
		l.addNodeEnd(1);
		l.addNodeEnd(2);
		l.addNodeEnd(2);
		l.addNodeEnd(1);
		
		l.isPalindrome();
		//l.printList(head);
		//System.out.println();
		//l.reverseList(head);
	
		//System.out.println("size of the list is " + size);
	}


}
