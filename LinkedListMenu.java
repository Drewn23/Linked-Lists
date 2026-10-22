import java.util.*; // java utilities

public class LinkedListMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner object
        DSALinkedList list = new DSALinkedList(); // list as new DSALinkedList object
        boolean stop = false; // decalre stop as false

        while (!stop) { // until stop is true
            try {
                System.out.println("\n==== Linked List Menu ====");
                System.out.println("1. Insert to First");
                System.out.println("2. Insert to Last");
                System.out.println("3. Remove First node");
                System.out.println("4. Remove Last node");
                System.out.println("5. View List");
                System.out.println("6. Exit program");
                System.out.print("Option: ");

                int option = sc.nextInt(); // get option from user
                sc.nextLine(); // Consume newline

                switch (option) {
                    case 1:
                    case 2:
                        System.out.print("Enter data: ");
                        Object data = sc.nextLine(); // scan next line and set into data object
                        if (option == 1) {
                            list.insertFirst(data); // set data to be inserted as first node(head)
                        } else {
                            list.insertLast(data); // set data to be inserted as last node(tail)
                        }
                        System.out.println("Data inserted.\n");
                        break;

                    case 3:
                    case 4:
                        if (list.isEmpty()) { //validation
                            System.out.println("List is empty. Nothing to remove.\n");
                        } else {
                            Object removedData; // declare removeData as object
                            if (option == 3) {
                                removedData = list.removeFirst(); // set data to be removed as first node(head)
                            } else {
                                removedData = list.removeLast(); // set data to be removed as last node(tail)
                            }
                            System.out.println(removedData + " was removed from the list.\n");
                        }
                        break;

                    case 5:
                        if (list.isEmpty()) { // validate
                            System.out.println("List is empty.\n");
                        } else {
                            list.printList("List");
                        }
                        break;

                    case 6:
                        System.out.println("Exiting...");
                        stop = true; // stop is true; exit while loop
                        break;

                    default: // default option
                        System.out.println("Invalid option. Please enter a number between 1-6.\n");
                        break;
                }
            } catch (InputMismatchException e) { // catch exception
                System.out.println("Invalid input. Please enter a valid number.\n");
                sc.nextLine(); // Clear invalid input
            } catch (Exception e) { // catch exception
                System.out.println("Error: " + e.getMessage() + "\n");
            }
        }
        sc.close();
    }
}
