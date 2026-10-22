import java.util.*; // import java utilities

public class DSAQueue {

    // Class fields
    private DSALinkedList queue;

    //Default constructor
    public DSAQueue() {
	    queue = new DSALinkedList();
    }

    // enqueue
    public void enqueue(Object value) {
        queue.insertLast(value);
    }

    // dequeue
    public Object dequeue() {
        return queue.removeFirst();
    }

    // peek
    public Object peek() {
        return queue.peekFirst();
    }

    // isEmpty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    //Display queue's contents
    public void display() {
        System.out.print("Queue contens: ");
        queue.traverseForward();
        System.out.println();
    }
}