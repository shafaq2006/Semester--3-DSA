import java.util.ArrayList;
import java.util.Scanner;

// Beginner version using Java's built-in ArrayList (no size limit)
public class SimpleArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> books = new ArrayList<>();

        int choice = 0;
        while (choice != 7) {
            System.out.println("\n--- ARRAYLIST MENU ---");
            System.out.println("1. Add");
            System.out.println("2. Insert at index");
            System.out.println("3. Delete by index");
            System.out.println("4. Display");
            System.out.println("5. Search");
            System.out.println("6. Update at index");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter value: ");
                books.add(sc.nextInt());
            } else if (choice == 2) {
                System.out.print("Enter index: ");
                int index = sc.nextInt();
                System.out.print("Enter value: ");
                int value = sc.nextInt();
                if (index < 0 || index > books.size()) {
                    System.out.println("Invalid index!");
                } else {
                    books.add(index, value);
                }
            } else if (choice == 3) {
                System.out.print("Enter index: ");
                int index = sc.nextInt();
                if (index < 0 || index >= books.size()) {
                    System.out.println("Invalid index!");
                } else {
                    books.remove(index);
                }
            } else if (choice == 4) {
                System.out.println("List: " + books);
                System.out.println("Size: " + books.size());
            } else if (choice == 5) {
                System.out.print("Enter value to search: ");
                int index = books.indexOf(sc.nextInt());
                if (index == -1) {
                    System.out.println("Not found.");
                } else {
                    System.out.println("Found at index " + index);
                }
            } else if (choice == 6) {
                System.out.print("Enter index: ");
                int index = sc.nextInt();
                System.out.print("Enter new value: ");
                int value = sc.nextInt();
                if (index < 0 || index >= books.size()) {
                    System.out.println("Invalid index!");
                } else {
                    books.set(index, value);
                }
            } else if (choice != 7) {
                System.out.println("Invalid choice!");
            }
        }
        System.out.println("Goodbye!");
    }
}
