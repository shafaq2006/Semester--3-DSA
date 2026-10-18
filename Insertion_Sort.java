import java.util.Random;

public class Insertion_Sort {

    public static void main(String[] args) {

        int[] marks = new int[1000];
        Random random = new Random();
        for (int i = 0; i < marks.length; i++) {
            marks[i] = random.nextInt(101);
        }

        for (int i = 1; i < marks.length; i++) {
            int key = marks[i];
            int j = i - 1;

            while (j >= 0 && marks[j] > key) {
                marks[j + 1] = marks[j];
                j--;
            }

            marks[j + 1] = key;
        }

        System.out.println("First 20 marks:");
        for (int i = 0; i < 20; i++) {
            System.out.print(marks[i] + " ");
        }

        System.out.println("\nLast 20 marks:");
        for (int i = marks.length - 20; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
