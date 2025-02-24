
public class CircularQueueX {
	private int queueArr[];
	private int maxSize;
	private int rear;
	private int front;
	private int noItems;
	
	public CircularQueueX(int s) {
		maxSize = s;
		queueArr = new int[maxSize];
		noItems = 0;
		rear = -1;
		front = 0;
	}
	
	public void insert(int j) {
		if(noItems == maxSize) {
			System.out.println("Queue is full");
		} else {
			if(rear == maxSize-1)
				rear=-1;
			queueArr[++rear]=j;
			noItems++;
		}
	}
	
	public int remove() {
		if(noItems == 0) {
			System.out.println("Queue is empty");
			return -99;
		} else {
			int temp;
			if(front==maxSize-1) {
				temp = queueArr[front];
				front=0;
			}else {
				temp = queueArr[front++];
			}
			noItems--;
			return temp;
		}
		
	}
	
	public boolean isEmpty() {
		if(noItems == 0)
			return true;
		else 
			return false;
	}
	
	public boolean isFull() {
		if(noItems == maxSize)
			return true;
		else
			return false;
	}
}
