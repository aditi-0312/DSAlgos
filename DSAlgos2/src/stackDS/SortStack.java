package stackDS;

import java.util.Stack;

public class SortStack {

	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<>();
		s1.push(1);
		s1.push(22);
		s1.push(13);
		s1.push(4);
		s1.push(15);
		System.out.println(s1);
		System.out.println(sortStack(s1));
	}

	private static Stack<Integer> sortStack(Stack<Integer> s1) {
		Stack<Integer> tempStk = new Stack<>();
		
		while(!s1.isEmpty()) {
			
			int temp=s1.pop();
			
			while(!tempStk.isEmpty() && tempStk.peek()>temp) {
				int tt = tempStk.pop();
				s1.push(tt);
			}
			tempStk.push(temp);
		}
		return tempStk;
		
	}

}
