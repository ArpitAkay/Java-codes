package package8_collectionframework;

import java.util.Stack;

public class LearnStack {
	public static void main(String args[]) {
		Stack<String> animals = new Stack<String>();
		
		animals.push("lion");
		animals.push("Dog");
		animals.push("cat");
		animals.push("cheetah");
		
		System.out.println(animals);
		
		System.out.println(animals.peek());		//Looks at the object at the top of this stack without removing it from the stack.
		
		System.out.println(animals);
		
		System.out.println(animals.pop());		//Removes the object at the top of this stack and returns that object as the value of this function
		
		System.out.println(animals);
		
	}
}
