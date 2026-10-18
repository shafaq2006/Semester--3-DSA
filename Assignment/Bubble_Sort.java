import java.util.Random;

public class Bubble_Sort {

    public static void main(String[] args) {

        int[] marks = new int[1000];
        Random random = new Random();
        for (int i = 0; i < marks.length; i++) {
            marks[i] = random.nextInt(101);
        }

        int comparisons = 0;
        int swaps = 0;

        for (int i = 0; i < marks.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < marks.length - i - 1; j++) {
                comparisons++;
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swaps++;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }

        System.out.println("First 20 marks:");
        for (int i = 0; i < 20; i++) {
            System.out.print(marks[i] + " ");
        }

        System.out.println("\nLast 20 marks:");
        for (int i = marks.length - 20; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

        System.out.println("\nComparisons: " + comparisons);
        System.out.println("Swaps: " + swaps);
    }
}
