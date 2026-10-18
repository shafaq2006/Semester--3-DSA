import java.util.Scanner;

// Beginner singly linked list
class SNode {
    int data;
    SNode next;

    SNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SimpleSinglyLinkedList {
    static SNode head = null;

    static void insertAtBeginning(int value) {
        SNode newNode = new SNode(value);
        newNode.next = head;
        head = newNode;
    }

    static void insertAtEnd(int value) {
        SNode newNode = new SNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        SNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    static void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty!");
        } else {
            head = head.next;
        }
    }

    static void deleteLast() {
        if (head == null) {
            System.out.println("List is empty!");
        } else if (head.next == null) {
            head = null;
        } else {
            SNode temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    static void deleteByValue(int value) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.data == value) {
            head = head.next;
            return;
        }
        SNode temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Value not found.");
        } else {
            temp.next = temp.next.next;
        }
    }

    static void search(int value) {
        SNode temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data == value) {
                System.out.println("Found at position " + index);
                return;
            }
            temp = temp.next;
            index++;
        }
        System.out.println("Not found.");
    }

    static void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        SNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 8) {
            System.out.println("\n--- SINGLY LINKED LIST ---");
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. Delete first");
            System.out.println("4. Delete last");
            System.out.println("5. Delete by value");
            System.out.println("6. Search");
            System.out.println("7. Display");
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
                System.out.print("Enter value: ");
                search(sc.nextInt());
            } else if (choice == 7) {
                display();
            } else if (choice != 8) {
                System.out.println("Invalid choice!");
            }
        }
        System.out.println("Goodbye!");
    }
}
