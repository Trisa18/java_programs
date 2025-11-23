import java.util.Arrays;

public class Recursion_sort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 8};
        bubbleSort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = {5, 3, 1, 4, 2};
        selectionSortMax(arr, arr.length - 1, 0, 0);
        System.out.println(Arrays.toString(arr1));
    }

    static void bubbleSort(int[] arr, int row, int col) {
        // When row becomes 0, sorting is done
        if (row == 0) return;


        if (col < row) {
            if (arr[col] > arr[col + 1]) {
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            bubbleSort(arr, row, col + 1);   // Move to next column
        } else {
            bubbleSort(arr, row - 1, 0);     // Restart row with col=0
        }
    }

    static void selectionSortMax(int[] arr, int row, int col, int maxIndex) {
        if (row == 0) return;
        if (col <= row) {
            if (arr[col] > arr[maxIndex]) {
                maxIndex = col;
            }
            selectionSortMax(arr, row, col + 1, maxIndex);
        } else {

            int temp = arr[row];
            arr[row] = arr[maxIndex];
            arr[maxIndex] = temp;

            selectionSortMax(arr, row - 1, 0, 0);
        }
    }
}
