import java.util.Scanner;

// Name: Your Name
// Class: Your Class
// Term: Spring 20206
// Instructor: Your Instructor
// Assignment: 7
// IDE Name: Your IDE


public class TestPQH {
//main program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      //variables for each type of heap being initialized
        PQ_Heap<Integer> intQueue = null;
        PQ_Heap<String> strQueue = null;

        boolean typeSelected = false;
       //while method to keep the program running until the user is satisfied
        while (true) {
            printMenu();

            System.out.print("\nEnter option number: ");
            int option = input.nextInt();
            input.nextLine(); // clear buffer

            switch (option) {
                //first and mandatory option for the user to pick the foundation of their heap
                case 0:
                    System.out.println("Select Queue Type (integer/string): ");
                    String type = input.nextLine();

                    if (type.equalsIgnoreCase("integer")) {
                        intQueue = new PQ_Heap<>();
                        typeSelected = true;
                    } else if (type.equalsIgnoreCase("string")) {
                        strQueue = new PQ_Heap<>();
                        typeSelected = true;
                    } else {
                        System.out.println("Invalid type.");
                    }
                    break;
               //option to add values to the heap
                case 1: // enqueue
                    if (!typeSelected) {
                        System.out.println("Must select type first!");
                        break;
                    }

                    System.out.print("Enter value: ");
                    if (intQueue != null) {
                        int val = input.nextInt();
                        intQueue.enqueue(val);
                    } else {
                        String val = input.nextLine();
                        strQueue.enqueue(val);
                    }
                    break;
                //option to remove values from the heap
                case 2: // dequeue
                    if (!typeSelected) break;

                    if (intQueue != null)
                        System.out.println("Removed: " + intQueue.dequeue());
                    else
                        System.out.println("Removed: " + strQueue.dequeue());
                    break;
                //option to check if the heap is full
                case 3:
                    if (!typeSelected) break;

                    System.out.println("is_full: " +
                            (intQueue != null ? intQueue.is_full() : strQueue.is_full()));
                    break;
                //option to check if the heap is empty
                case 4:
                    if (!typeSelected) break;

                    System.out.println("is_empty: " +
                            (intQueue != null ? intQueue.is_empty() : strQueue.is_empty()));
                    break;
                //option to check the size of the heap
                case 5:
                    if (!typeSelected) break;

                    System.out.println("PQueue size: " +
                            (intQueue != null ? intQueue.size() : strQueue.size()));
                    break;
                //option to check the display the front element of the heap
                case 6:
                    if (!typeSelected) break;

                    System.out.println("Front: " +
                            (intQueue != null ? intQueue.front() : strQueue.front()));
                    break;
                //option to print out the heap with its placement in each index
                case 7:
                    if (!typeSelected) break;

                    System.out.println("Printing PQueue Elements (Option 7)");

                    java.util.ArrayList<?> list =
                            (intQueue != null ? intQueue.getElements() : strQueue.getElements());

                    for (int i = 0; i < list.size(); i++) {

                        // Print parent
                        System.out.print("Index " + i + ":  " + list.get(i));

                        // Calculate children indices
                        int left = 2 * i + 1;
                        int right = 2 * i + 2;

                        // Print left child if exists
                        if (left < list.size()) {
                            System.out.print("   " + list.get(left));
                        }

                        // Print right child if exists
                        if (right < list.size()) {
                            System.out.print("   " + list.get(right));
                        }

                        // Move to next line after each index
                        System.out.println();
                    }
                    break;
               //last call to end the loop and the program
                case 8:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option.");
            }

            System.out.println("\n\n");
        }
    }
    //menu options for the user to select
    public static void printMenu() {
        System.out.println("----------------MAIN MENU---------------");
        System.out.println("0. Enter Queue Type (integer or string)");
        System.out.println("1. Enqueue Element");
        System.out.println("2. Dequeue Element");
        System.out.println("3. Check is_Full");
        System.out.println("4. Check is_Empty");
        System.out.println("5. Print PQueue Size");
        System.out.println("6. Display Front Element");
        System.out.println("7. Print PQueue Elements");
        System.out.println("8. Exit program");
    }
}