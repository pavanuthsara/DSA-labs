package pkg1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		StackX stack1 = new StackX(6);
		stack1.push('k');
		stack1.push('a');
		stack1.push('l');
		stack1.push('a');
		stack1.push('n');
		stack1.push('i');
		
		stack1.pop();
		stack1.pop();
		
		stack1.push('u');
		
//		while(!stack1.isEmpty()) {
//			System.out.print(stack1.pop());
//		}
		Scanner mysc = new Scanner(System.in);
		
		System.out.println("Paranthesis checker");
		StackX stack2 = new StackX(15);
		
		System.out.print("Enter expression : ");
		String input = mysc.next();
		char[] names = input.toCharArray();
		
		for(char x : names) {
			stack2.push(x);
		}
		
		char reverse = ' ';
		int count1 = 0;
		int count2 = 0;
		while(!stack2.isEmpty()) {
//			System.out.print(stack2.pop());
			reverse = stack2.pop();
			if(reverse == '(')
				count1++;
			
			if(reverse == ')')
				count2++;
		}
		
		if(count1 == count2)
			System.out.println("Valid paranthesis");
		else 
			System.out.println("Invalid paranthesis");
		
	}

}
