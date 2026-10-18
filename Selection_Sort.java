import java.util.Random;

public class Selection_Sort {

    public static void main(String[] args) {

        int[] marks = new int[1000];
        Random random = new Random();
        for (int i = 0; i < marks.length; i++) {
            marks[i] = random.nextInt(101);
        }

        for (int i = 0; i < marks.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < marks.length; j++) {
                if (marks[j] < marks[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = marks[i];
            marks[i] = marks[minIndex];
            marks[minIndex] = temp;
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
