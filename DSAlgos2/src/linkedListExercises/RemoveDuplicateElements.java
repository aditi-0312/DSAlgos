package linkedListExercises;

public class RemoveDuplicateElements {

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
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
	
	private void searchNode(int data) {
		Node curr=head;
		int i=1;
		boolean flag=false;
		
		while(curr!=null) {
			
			if(curr.data==data) {
				flag = true;
				break;
			}
			curr=curr.next;
			i++;
		}
		
		if(flag==true)
			System.out.println("given element is present in the linked list at position "+i);
		else
			System.out.println("given element is not present in the linked list");
	}

	public void removeDuplicate() {  
        //Node current will point to head  
        Node current = head, index = null, temp = null;  
  
        if(head == null) {  
            return;  
        }  
        else {  
            while(current != null){  
                //Node temp will point to previous node to index.  
                temp = current;  
                //Index will point to node next to current  
                index = current.next;  
  
                while(index != null) {  
                    //If current node's data is equal to index node's data  
                    if(current.data == index.data) {  
                        //Here, index node is pointing to the node which is duplicate of current node  
                        //Skips the duplicate node by pointing to next node  
                        temp.next = index.next;  
                    }  
                    else {  
                        //Temp will point to previous node of index.  
                        temp = index;  
                    }  
                    index = index.next;  
                }  
                current = current.next;  
            } 
        }
        }
	
	
	public void printLinkedList(Node headNode) {
		Node current = headNode;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}


	public static void main(String[] args) {

		RemoveDuplicateElements l=new RemoveDuplicateElements();
		l.addNodeAtEnd(1);
		l.addNodeAtEnd(2);
		l.addNodeAtEnd(3);
		l.addNodeAtEnd(1);
		l.addNodeAtEnd(3);
		
		l.searchNode(2);
		l.removeDuplicate();
		
		l.printLinkedList(head);
		
	}

	
}
