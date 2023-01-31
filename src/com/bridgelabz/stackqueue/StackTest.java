package com.bridgelabz.stackqueue;

public class StackTest {
	public static void main(String[] args) {
		System.out.println("Welcome Stack and queue program");
		Stacks stack = new Stacks();	
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.display();
		System.out.println("pop all till it becomes empty");
		stack.peek();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.display();
		
	}
}
