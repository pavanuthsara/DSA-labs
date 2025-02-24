import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		QueueX mainQueue = new QueueX(5);
		QueueX printerQueue = new QueueX(5);
		
		Scanner myScanner = new Scanner(System.in);
		int val;
		for(int i=1; i<=5; i++) {
			System.out.print("Enter transaction ID " + i + ": ");
			val = myScanner.nextInt();
			printerQueue.insert(val);
		}
		
		QueueX evenQueue = new QueueX(5);
		QueueX oddQueue = new QueueX(5);
		
		while(!printerQueue.isEmpty()) {
			val = printerQueue.remove();
			if(val%2 == 0)
				evenQueue.insert(val);
			else 
				oddQueue.insert(val);
		}
		
		System.out.println("PC1");
		while(!evenQueue.isEmpty()) {
			val = evenQueue.remove();
			System.out.println("Transaction " + val);
		}
		System.out.println("PC2");
		while(!oddQueue.isEmpty()) {
			val = oddQueue.remove();
			System.out.println("Transaction " + val);
		}
		
	}

}
