package stackDS;

import java.util.Stack;

public class MinElement {

	static Stack<Integer> mainStack = new Stack<>();
	static Stack<Integer> temp = new Stack<>();

	public static void main(String[] args) {
		customPush(12);
		customPush(2);
		customPush(10);
		customPush(8);
		customPush(1);
		customPop();
		System.out.println(temp.peek() + " is the smallest element on the stack");
	}

	private static void customPush(int item) {

		mainStack.push(item);
		if (temp.isEmpty()) {
			temp.push(item);
		} else if (temp.peek() > item) {
			temp.push(item);
		}
	}

	private static void customPop() {
		int top = mainStack.peek();
		mainStack.pop();
		if (temp.peek() == top) {
			temp.pop();
		}

	}

}
