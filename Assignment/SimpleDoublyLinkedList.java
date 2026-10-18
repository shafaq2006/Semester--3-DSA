import java.util.Scanner;

// Beginner doubly linked list
class DNodeSimple {
    int data;
    DNodeSimple prev;
    DNodeSimple next;

    DNodeSimple(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class SimpleDoublyLinkedList {
    static DNodeSimple head = null;
    static DNodeSimple tail = null;

    static void insertAtBeginning(int value) {
        DNodeSimple newNode = new DNodeSimple(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    static void insertAtEnd(int value) {
        DNodeSimple newNode = new DNodeSimple(value);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    static void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty!");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    static void deleteLast() {
        if (tail == null) {
            System.out.println("List is empty!");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    static void deleteByValue(int value) {
        DNodeSimple temp = head;
        while (temp != null && temp.data != value) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Value not found.");
        } else if (temp == head) {
            deleteFirst();
        } else if (temp == tail) {
            deleteLast();
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }

    static void displayForward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        DNodeSimple temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    static void displayBackward() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }
        DNodeSimple temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 8) {
            System.out.println("\n--- DOUBLY LINKED LIST ---");
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. Delete first");
            System.out.println("4. Delete last");
            System.out.println("5. Delete by value");
            System.out.println("6. Display forward");
            System.out.println("7. Display backward");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter value: ");
                insertAtBeginning(sc.nextInt());
            } else if (choice == 2) {
                System.out.print("Enter value: ");
                insertAtEnd(sc.nextInt());
            } else if (choice == 3) {
                deleteFirst();
            } else if (choice == 4) {
                deleteLast();
            } else if (choice == 5) {
                System.out.print("Enter value: ");
                deleteByValue(sc.nextInt());
            } else if (choice == 6) {
                displayForward();
            } else if (choice == 7) {
                displayBackward();
            } else if (choice != 8) {
                System.out.println("Invalid choice!");
            }
        }
        System.out.println("Goodbye!");
    }
}
