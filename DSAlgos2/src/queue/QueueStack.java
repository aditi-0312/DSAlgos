package queue;

import java.util.Stack;

public class QueueStack {
	
	static Stack<Integer> s=new Stack<>();
	
	public void enQ(int i) {
		s.push(i);
	}
	
	public Stack<Integer> deQ() {
		Stack<Integer> temp=new Stack();
		
		while(!s.isEmpty()) {
		int t =	s.pop();
		temp.push(t);
		}
		temp.pop();
		while(!temp.isEmpty()) {
			int tt=temp.pop();
			s.push(tt);
		}
		return s;
	}

	public static void main(String[] args) {
		QueueStack qs=new QueueStack();
		
		qs.enQ(1);
		qs.enQ(2);
		qs.enQ(3);
		qs.enQ(4);
		
		System.out.println(s);

		System.out.println(qs.deQ());
		System.out.println(qs.deQ());

	}

}
