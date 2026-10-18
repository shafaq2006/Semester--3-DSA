import java.util.Random;

public class Merge_Sort {

    static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid)   temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }
    }

    public static void main(String[] args) {

        int[] marks = new int[1000];
        Random random = new Random();
        for (int i = 0; i < marks.length; i++) {
            marks[i] = random.nextInt(101);
        }

        mergeSort(marks, 0, marks.length - 1);

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
