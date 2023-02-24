package queue;

public class QueueArray {

	int rear;
	int front;
	int[] a;
	int size;

	// this is the constructor so that whenever we make an object of the class
	// rear is assigned its value and the array is made with given size
	public QueueArray(int size) {
		rear = -1;
		this.size = size;
		// front=0;
		this.a = new int[size];
	}

	public void enQueue(int x) {
		rear++;
		a[rear] = x;
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
		QueueArray qd = new QueueArray(5);

		qd.enQueue(1);
		qd.enQueue(2);
		qd.enQueue(3);

		qd.deQueue();

		qd.enQueue(4);
		qd.enQueue(5);
		qd.print();

	}

}
