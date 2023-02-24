package stackDS;

import java.util.Stack;

public class InsertAtIndex {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();

		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		System.out.println(s);

		// insertAtGivenIndex(2,10,s,s1);
		insertAtGivenIndex(2,10,s);
		System.out.println(s);
	}

	/*
	 * private static void insertAtGivenIndex(int index, int value, Stack<Integer>
	 * s, Stack<Integer> s1) {
	 * 
	 * int count=0; while(!s.empty()) { int item=s.peek(); s1.push(item); s.pop();
	 * count++;
	 * 
	 * if(count==index) { s1.push(value); } } }
	 */
	private static void insertAtGivenIndex(int index, int value, Stack<Integer> s) {
		Stack<Integer> temp = new Stack<>();
		
		for(int i=0;i<s.size()-index;i++) {
			int item=s.peek(); 
			temp.push(item); 
			s.pop();			
		}
		temp.push(value);
		
		while(!temp.empty()) {
		int item=temp.peek(); 
		s.push(item); 
		temp.pop();
		}
	}
}