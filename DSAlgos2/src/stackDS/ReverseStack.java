package stackDS;

import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();

		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		System.out.println(s);

		moveStack(s, s1);
		moveStack(s1, s2);
		moveStack(s2, s);
		System.out.println(s);

	}

	private static void moveStack(Stack<Integer> source, Stack<Integer> destination) {

		while (!source.empty()) {
			int item = source.peek();
			destination.push(item);
			source.pop();
		}
	}
}
