import java.util.*; // import java utilities

public class DSAStack {

    // Class fields. No need to call again
    private DSALinkedList stack;

    // Default constructor
    public DSAStack() {
        stack = new DSALinkedList();
    }

    // isEmpty. Questionnaire if stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Top = look at front
    public Object top() {
        return stack.peekFirst();
    }

    // Push = insert at front
    public void push(Object value) {
        stack.insertFirst(value);
    }

    // Pop = remove from front
    public Object pop() {
        return stack.removeFirst();
    }
    
    //display the stack's contents  
    public void display() {
	    System.out.print("Stack contents: ");
        stack.traverseForward();
        System.out.println();
    }
}