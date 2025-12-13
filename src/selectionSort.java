import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 7, 3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {

            int maxIndex = 0;

            for (int j = 1; j <= i; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            swap(arr, i, maxIndex);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
