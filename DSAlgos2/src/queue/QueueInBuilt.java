package queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueInBuilt {

	public static void main(String[] args) {
		Queue<Integer> queue=new ArrayDeque<>();
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.remove();//FIFO
		System.out.println("peek value is "+queue.peek());
		queue.remove(4);//pop

		for(int ele : queue) {
			System.out.println(ele);
		}
		
		//reverse the queue -> 5 3 2
		Stack<Integer> tempStk=new Stack<>();
		while(!queue.isEmpty()) {
			tempStk.push(queue.remove());
		}
		
		while(!tempStk.isEmpty()) {
			queue.add(tempStk.pop());
		}
		
		System.out.println("below is reversed queue");
		for(int ele : queue) {
			System.out.println(ele);
		}
	}

}
