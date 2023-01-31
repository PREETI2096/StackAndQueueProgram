package com.bridgelabz.stackqueue;

public class QueueTest {
	public static void main(String[] args) {
		System.out.println("Welcome queue program");
		Queue q = new Queue();
		q.enqueue(56);
		q.enqueue(30);
		q.enqueue(70);
		q.displayQueue();
	}
}
