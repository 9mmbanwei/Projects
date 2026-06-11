// Name: Mbah Mbanwei
// Class: Data Structures
// Term: Spring 2026
// Instructor: Srilekha Dodda
// Assignment: 5
// IDE Name: IntelliJ

import java.util.Scanner;
public class TestMyStack {
    public static void main(String[] args) //main program to test MyStack
    {
        Scanner scan = new Scanner(System.in);
        MyStack<Integer> stack = new MyStack<>();

        int option;

        do //do loop to keep program running
        {
            System.out.println("\n\n--------MAIN MENU-------");
            System.out.println("1 – Push element");
            System.out.println("2 – Pop element");
            System.out.println("3 – Get top element");
            System.out.println("4 – Get stack size");
            System.out.println("5 – Is empty stack?");
            System.out.println("6 - Print stack");
            System.out.println("7 - Exit program");
            System.out.print("Enter option number: ");

            option = scan.nextInt();

            switch(option)
            {
                case 1:
                    System.out.print("Enter value: ");
                    int val = scan.nextInt();

                    System.out.print("Stack before push: ");
                    stack.printStack();
                    System.out.println();

                    stack.push(val);

                    System.out.print("Stack after push:  ");
                    stack.printStack();
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Stack before pop: ");
                    stack.printStack();
                    System.out.println();

                    Integer popped = stack.pop();

                    if (popped != null)
                        System.out.println("Popped element: " + popped);

                    System.out.print("Stack after pop:  ");
                    stack.printStack();
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Stack before top(): ");
                    stack.printStack();
                    System.out.println();

                    Integer top = stack.top();
                    if (top != null)
                        System.out.println("Top element: " + top);
                    break;

                case 4:
                    System.out.print("Current stack: ");
                    stack.printStack();
                    System.out.println();
                    System.out.println("Stack size: " + stack.size());
                    break;

                case 5:
                    System.out.print("Current stack: ");
                    stack.printStack();
                    System.out.println();
                    System.out.println("Is empty? " + stack.isEmpty());
                    break;

                case 6:
                    System.out.print("Stack content (top to bottom): ");
                    stack.printStack();
                    System.out.println();
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option, try again.");
            }

        } while(option != 7);

    }
}

