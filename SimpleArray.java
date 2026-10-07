import java.util.Scanner;

// Beginner version of Program 1: library shelf using a fixed array of 10 slots
public class SimpleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] books = new int[10];
        int count = 0; // how many books are on the shelf

        int choice = 0;
        while (choice != 8) {
            System.out.println("\n--- ARRAY MENU ---");
            System.out.println("1. Add book");
            System.out.println("2. Insert at index");
            System.out.println("3. Delete last");
            System.out.println("4. Delete by index");
            System.out.println("5. Display");
            System.out.println("6. Search");
            System.out.println("7. Update at index");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                if (count == books.length) {
                    System.out.println("Shelf is full!");
                } else {
                    System.out.print("Enter book ID: ");
                    books[count] = sc.nextInt();
                    count++;
                }
            } else if (choice == 2) {
                if (count == books.length) {
                    System.out.println("Shelf is full!");
                } else {
                    System.out.print("Enter index (0-" + count + "): ");
                    int index = sc.nextInt();
                    if (index < 0 || index > count) {
                        System.out.println("Invalid index!");
                    } else {
                        System.out.print("Enter book ID: ");
                        int value = sc.nextInt();
                        for (int i = count; i > index; i--) {
                            books[i] = books[i - 1]; // shift right
                        }
                        books[index] = value;
                        count++;
                    }
                }
            } else if (choice == 3) {
                if (count == 0) {
                    System.out.println("Shelf is empty!");
                } else {
                    count--;
                    System.out.println("Last book removed.");
                }
            } else if (choice == 4) {
                System.out.print("Enter index to delete: ");
                int index = sc.nextInt();
                if (index < 0 || index >= count) {
                    System.out.println("Invalid index!");
                } else {
                    for (int i = index; i < count - 1; i++) {
                        books[i] = books[i + 1]; // shift left
                    }
                    count--;
                    System.out.println("Book removed.");
                }
            } else if (choice == 5) {
                if (count == 0) {
                    System.out.println("Shelf is empty!");
                } else {
                    for (int i = 0; i < count; i++) {
                        System.out.println("Index " + i + ": " + books[i]);
                    }
                }
            } else if (choice == 6) {
                System.out.print("Enter book ID to search: ");
                int value = sc.nextInt();
                boolean found = false;
                for (int i = 0; i < count; i++) {
                    if (books[i] == value) {
                        System.out.println("Found at index " + i);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Not found.");
                }
            } else if (choice == 7) {
                System.out.print("Enter index to update: ");
                int index = sc.nextInt();
                if (index < 0 || index >= count) {
                    System.out.println("Invalid index!");
                } else {
                    System.out.print("Enter new book ID: ");
                    books[index] = sc.nextInt();
                }
            } else if (choice != 8) {
                System.out.println("Invalid choice!");
            }
        }
        System.out.println("Goodbye!");
    }
}
