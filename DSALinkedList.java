import java.util.*; //import java utilities

// DSALinkedList class for managing a doubly Double-Ended linked list
public class DSALinkedList {
    
    // Class fields
    private DSAListNode head; //Reference to the head (first node) of the list
    private DSAListNode tail; //Reference to the tail (last node) of the list    

    // Default constructor
    // Initially, the list is empty, so head and tail are null
    public DSALinkedList() {
        head = null; // set head as null 
        tail = null; // set tail as null
    }

    // Method to insert a new node at the beginning of the list
    public void insertFirst(Object newValue) {
        DSAListNode newNd = new DSAListNode(newValue);  // Allocate a new node with a given value
        
        if (isEmpty()) {   // Check if the list is empty
            // Inserting First ListNode
            head = tail = newNd;  // If empty, the new node becomes the head and the tail
        } else {
            // Inserting ListNode before the head
            newNd.setNext(head);  // Link the new node to the current head
            head.setPrev(newNd); // Set the previous reference of the current head to the new node 
            head = newNd;  // Update the head to be the new node
        }
        newNd.setPrev(null); // Ensure the new head's previous pointer is null
        
    }

    // Method to insert a new node at the end of the list
    public void insertLast(Object newValue){
        DSAListNode newNode = new DSAListNode(newValue); // Allocate a new node
        
        if(isEmpty()){ // if statement for empty list
            head = tail = newNode; //for case if no nodes in list
        }else {
            // Inserting ListNode's pointers after the tail
            tail.setNext(newNode);
            newNode.setPrev(tail); 
            tail = newNode;
        }
    }

    // Method to return the value of the first node in the list
    public Object peekFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty."); // throw exception is passed
        } else {
            return head.getValue();  // Return the value of the head node
        }
    }        

    // Method to print the value of the last node in the list
    public Object peekLast() {
        // validate exceptions
        if (isEmpty()) {
            throw new IllegalStateException("List is empty"); // throw exception if passed
        } else {
            return tail.getValue();  // Return the value of the tail node
        }
    }
    
    public Object removeFirst() {
        // validate exceptions
        if (isEmpty()) {
            throw new IllegalStateException("List is empty"); // throw exception if passed
        } else {
            // Declare object variable for return
            Object nodeValue = head.getValue();
            if (head == tail) { // Only one item in the list
                head = tail = null; // set the head and tail to null
            } else {
                head = head.getNext(); // next value of current head is set to current head 
                head.setPrev(null); // previous value is set null
            }
            return nodeValue; // return variable
        }
    }

    // Method to remove the last node from the list
    public Object removeLast() {
        if (isEmpty()) { // if statement for exception
            throw new IllegalStateException("List is empty"); // throw exception
        } else {
            // Declare object variable for return
            Object nodeValue = tail.getValue();
            if (head == tail) { // Only one item in the list
                head = tail = null; // set the head and tail to null
            } else {
                tail = tail.getPrev(); // next value of current tail is set to current tail
                tail.setNext(null); // previous value is set null
            }
            return nodeValue;
        }
    }
        
    // Method to check if the list is empty
    // Returns true if the list has no nodes, false otherwise 
    public boolean isEmpty() {
        return head == null;
    }

    // Centralized print helper
    public void printList(String label) {
	System.out.print(label + ": ");
	DSAListNode current = head; // set current as head
	while (current != null) { // while loop till current is null
	    System.out.print(current.value + " ");
	    current = current.next; // set current to next list node 
	}
	System.out.println();
    }
    
    // Method to traverse the list from front to back and print each node's value
    public void traverseForward() { 
        DSAListNode current = head;  // Start from the head of the list

        while (current != null) {  // Continue until the end of the list
            System.out.print(current.value + " ");  // Print the current node's value
            current = current.next;  // Move to the next node
        } 
    }
    
    // Method to find if a node with a specific value exists in the list
    public boolean find(Object valueToFind) {
        // Start traversal from the head of the list
        DSAListNode currNd = head;
        
        // Traverse the list
        while (currNd != null) {
            // Check if the current node's value matches the valueToFind
            if (currNd.getValue().equals(valueToFind)) {
                return true;  // Value found
            }
            currNd = currNd.getNext();  // Move to the next node
        }
        
        // Value not found
        return false;
    }    
    
    // Main method
    public static void main(String args[]) {
        DSALinkedList linkedList = new DSALinkedList(); // Create Doubly Double-Ended linked list
        System.out.println("\nCurrent head: " + linkedList.head);
        System.out.println("Current list: ");
        linkedList.traverseForward();
        System.out.println("\n---------------");
        
        // Insert at First
        System.out.println("Inserting list from first....");
        linkedList.insertFirst(50);
        linkedList.insertFirst(36);
        linkedList.insertFirst(78);
        
        System.out.println("Current list: ");
        linkedList.traverseForward();
        System.out.println("\n---------------");

        // Insert at Last
        System.out.println("Inserting list from last....");
        linkedList.insertLast(89);
        linkedList.insertLast(23);
        linkedList.insertLast(2);        
        System.out.println("Current list: ");
        linkedList.traverseForward();
        System.out.println("\n---------------");
        
        // peekFirst
        System.out.println("First element is " + linkedList.peekFirst());
        System.out.println("---------------");
        
        // peekLast
        System.out.println("Last element is " + linkedList.peekLast());
        System.out.println("---------------");

        // removeFirst
        System.out.println("Remiving first element: " + linkedList.removeFirst());
        System.out.println("Current list: ");
        linkedList.traverseForward();    
        System.out.println("\n---------------");

        // removeLast
        System.out.println("Removing last element: " + linkedList.removeLast());
        System.out.println("Current list: ");
        linkedList.traverseForward();
        System.out.println("\n---------------");
        
        // find
        System.out.println("Is 2 element in this linkedlist? " + linkedList.find(2));
        System.out.println("Is 36 element in this linkedlist? " + linkedList.find(36));
        System.out.println("Is 10 element in this linkedlist? " + linkedList.find(20));
        
        // removeLastNode
        System.out.println("Removing last 3 elements...... ");
        linkedList.removeLast();
        linkedList.removeLast();
        linkedList.removeLast();
        System.out.println("Current list: ");
        linkedList.traverseForward();
        System.out.println("\n---------------");        

    }
}
