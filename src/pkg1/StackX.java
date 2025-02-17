package pkg1;

public class StackX {
	private int top;
	private int maxSize;
	private char[] stackArr;
	
	public StackX(int s) {
		this.top = -1;
		this.maxSize = s;
		this.stackArr = new char[s];
	}
	
	public void push(char val) {
		if(top == maxSize - 1)
			System.out.println("Stack is full");
		else
			stackArr[++top] = val; 
	}
	
	public char pop() {
		if(top == -1) {
			System.out.println("Stack is empty");
			return ' ';
		}
		else
			return stackArr[top--];
	}
	
	public char peek() {
		if(top == -1) {
			System.out.println("Stack is empty");
			return ' ';
		}
		else
			return stackArr[top];
	}
	
	public boolean isEmpty() {
		if(top == -1)
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		if(top == maxSize - 1)
			return true;
		else 
			return false;
	}
	
}
