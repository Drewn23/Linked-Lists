public class DSAListNode {
    // Instance variables to hold the value
    protected Object value; 
    protected DSAListNode next; // hold a reference to another instance of DSAListNode
    protected DSAListNode prev; // hold a reference to another instance of DSAListNode

    // Constructor
    // Default constructor, Next and Prev pointers are set to null, meaning it doesn't link to any other nodes initially
    public DSAListNode(Object inValue) {
        value = inValue; // Set the value of the node
        next = null; // Initialize the next pointer to null
        prev = null; // Initialize the previous pointer to null
    }

    // Setter method to update the next node pointer
    public void setNext(DSAListNode newNext) {
        next = newNext; // Update the next pointer to reference the new node
    }

    // Setter method to update the previous node pointer
    public void setPrev(DSAListNode newPrev) {
        prev = newPrev; // Update the previous pointer to reference the new node
    }

    // Setter method to update the value stored in the node
    public void setValue(Object inValue) {
        value = inValue; // Update the node's value
    }

    // Getter method to retrieve the next node in the list
    public DSAListNode getNext() {
        return next; // Return the reference to the next node
    }

    // Getter method to retrieve the previous node in the list
    public DSAListNode getPrev() {
        return prev; // Return the reference to the previous node
    }

    // Getter method to retrieve the value stored in the node
    public Object getValue() {
        return value; // Return the value of the node
    }
}