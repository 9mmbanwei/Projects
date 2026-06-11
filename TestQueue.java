// Name: Mbah Mbanwei
// Class: Data Structures
// Term: Spring 2026
// Instructor: Srilekha Dodda
// Assignment: 5
// IDE Name: IntelliJ

import java.util.Scanner;

public class TestQueue
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Queue<Integer> queue = new Queue<>();

        int option;

        do
        {
            System.out.println("\n\n--------MAIN MENU--------");
            System.out.println("1 – Enqueue element");
            System.out.println("2 – Dequeue element");
            System.out.println("3 – Get front element");
            System.out.println("4 – Get queue size");
            System.out.println("5 – Is Empty queue?");
            System.out.println("6 - Print queue");
            System.out.println("7 - Exit program");
            System.out.print("Enter option number: ");

            option = scan.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.print("Enter value: ");
                    int val = scan.nextInt();
                    System.out.print("Queue before enqueue: ");
                    queue.printQueue();
                    System.out.println();
                    queue.enqueue(val);
                    System.out.print("Queue after enqueue:  ");
                    queue.printQueue();
                    System.out.println();
                }
                case 2 -> {
                    System.out.print("Queue before dequeue: ");
                    queue.printQueue();
                    System.out.println();
                    Integer removed = queue.dequeue();
                    if (removed != null)
                        System.out.println("Dequeued element: " + removed);
                    System.out.print("Queue after dequeue:  ");
                    queue.printQueue();
                    System.out.println();
                }
                case 3 -> {
                    System.out.print("Current queue: ");
                    queue.printQueue();
                    System.out.println();
                    Integer front = queue.front();
                    if (front != null)
                        System.out.println("Front element: " + front);
                }
                case 4 -> {
                    System.out.print("Current queue: ");
                    queue.printQueue();
                    System.out.println();
                    System.out.println("Queue size: " + queue.size());
                }
                case 5 -> {
                    System.out.print("Current queue: ");
                    queue.printQueue();
                    System.out.println();
                    System.out.println("Is Empty? " + queue.isEmpty());
                }
                case 6 -> {
                    System.out.print("Queue content (front to rear): ");
                    queue.printQueue();
                    System.out.println();
                }
                case 7 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid option.");
            }

        } while(option != 7);

        scan.close();
    }
}