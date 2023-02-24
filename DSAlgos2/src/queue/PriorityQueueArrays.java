package queue;

public class PriorityQueueArrays {
	int rear;
	int front;
	int[] a;
	int size;

	public PriorityQueueArrays(int size) {
		rear = -1;
		// front=0;
		this.a = new int[size];
	}

	public void customEnqueue(int x) {
		if (rear == -1) {
			rear++;
			a[rear] = x;
		} else {
			for (int i = rear; i >= 0; i--) {
				if (a[i] > x) {
					a[i + 1] = a[i];

					if (i == 0)
						a[i] = x;
				} else {
					a[i + 1] = x;
					break;
				}
			}
			rear++;
		}
	}

	public int deQueue() {
		int ele = a[0];

		for (int i = 0; i < rear; i++) {
			// shifting the elements to left
			a[i] = a[i + 1];

		}
		rear--;
		return ele;
	}

	public void print() {
		for (int i = 0; i <= rear; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		PriorityQueueArrays pq = new PriorityQueueArrays(5);
		pq.customEnqueue(2);
		pq.customEnqueue(12);
		pq.customEnqueue(7);
		pq.customEnqueue(26);
		
		pq.print();

	}

}
