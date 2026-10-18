import java.util.Scanner;

// Beginner version of Program 2: stack of plates using an array
public class SimpleStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stack capacity: ");
        int capacity = sc.nextInt();
        int[] stack = new int[capacity];
        int top = -1; // -1 means empty

        int choice = 0;
        while (choice != 7) {
            System.out.println("\n--- STACK MENU ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Size");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                if (top == capacity - 1) {
                    System.out.println("Stack Overflow! Stack is full.");
                } else {
                    System.out.print("Enter value: ");
                    top++;
                    stack[top] = sc.nextInt();
                }
            } else if (choice == 2) {
                if (top == -1) {
                    System.out.println("Stack Underflow! Stack is empty.");
                } else {
                    System.out.println("Popped: " + stack[top]);
                    top--;
                }
            } else if (choice == 3) {
                if (top == -1) {
                    System.out.println("Stack is empty.");
                } else {
                    System.out.println("Stack (top to bottom):");
                    for (int i = top; i >= 0; i--) {
                        System.out.println(stack[i]);
                    }
                }
            } else if (choice == 4) {
                System.out.println("Size: " + (top + 1));
            } else if (choice == 5) {
                System.out.println(top == -1 ? "Yes, empty." : "No, not empty.");
            } else if (choice == 6) {
                System.out.println(top == capacity - 1 ? "Yes, full." : "No, not full.");
            } else if (choice != 7) {
                System.out.println("Invalid choice!");
            }
        }
        System.out.println("Goodbye!");
    }
}
