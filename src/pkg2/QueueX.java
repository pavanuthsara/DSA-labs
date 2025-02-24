
public class QueueX {
	private int queueArr[];
	private int maxSize;
	private int rear;
	private int front;
	private int noItems;
	
	public QueueX(int s) {
		maxSize = s;
		queueArr = new int[maxSize];
		noItems = 0;
		rear = -1;
		front = 0;
	}
	
	public void insert(int j) {
		if(rear == maxSize-1) {
			System.out.println("Queue is full");
		} else {
			queueArr[++rear]=j;
			noItems++;
		}
	}
	
	public int remove() {
		if(noItems == 0) {
			System.out.println("Queue is empty");
			return -99;
		} else {
			noItems--;
			return queueArr[front++];
		}
		
	}
	
	public boolean isEmpty() {
		if(noItems == 0)
			return true;
		else 
			return false;
	}
	
	public boolean isFull() {
		if(rear == maxSize-1)
			return true;
		else
			return false;
	}
	
	public int peekfront() {
		if(noItems == 0) {
			System.out.println("Queue is empty");
			return -99;
		} else {
			return queueArr[rear];
		}
	}
}
