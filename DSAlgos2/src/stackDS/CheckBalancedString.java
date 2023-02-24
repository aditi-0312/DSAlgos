package stackDS;

import java.util.Stack;

public class CheckBalancedString {

	public static void main(String[] args) {
		String s = "{(2+2)}";

		if (isBalanced(s))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
	}

	private static boolean isBalanced(String s) {
		Stack<Character> stack = new Stack<>();
		char c = 0;
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);

			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
				continue;
			}
			// If current character is not opening
			// bracket, then it must be closing. So stack
			// cannot be empty at this point.
			if (stack.isEmpty())
				return false;

			char top;
			switch (c) {

			case (')'):
				top = stack.pop();
				if (c == '[' || c == '{')
					return false;
				break;
			case (']'):
				top = stack.pop();
				if (c == '(' || c == '{')
					return false;
				break;
			case ('}'):
				top = stack.pop();
				if (c == '(' || c == '[')
					return false;
				break;
			}
		}
		return stack.isEmpty();
	}
}
